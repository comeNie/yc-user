package com.ai.yc.user.service.business.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sdk.util.UUIDUtil;
import com.ai.slp.balance.api.accountmaintain.interfaces.IAccountMaintainSV;
import com.ai.slp.balance.api.accountmaintain.param.RegAccReq;
import com.ai.yc.user.api.register.param.RegisterParamsRequest;
import com.ai.yc.user.api.register.param.UcContactInfoParams;
import com.ai.yc.user.api.register.param.UcGroupKeyInfoParams;
import com.ai.yc.user.api.register.param.UcUserParams;
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.constants.UcUserConstants.Account;
import com.ai.yc.user.dao.mapper.bo.UcContactsInfo;
import com.ai.yc.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.yc.user.dao.mapper.bo.UcGroupKeyInfoCriteria;
import com.ai.yc.user.dao.mapper.bo.UcUser;
import com.ai.yc.user.dao.mapper.bo.UcUserCriteria;
import com.ai.yc.user.service.atom.interfaces.IRegisterAtomSV;
import com.ai.yc.user.service.atom.interfaces.IUcContactsInfoAtomSV;
import com.ai.yc.user.service.business.interfaces.IRegisterBusiSV;
import com.ai.yc.user.util.SequenceUtil;
import com.alibaba.fastjson.JSON;

@Service
@Transactional
public class RegisterBusiSVImpl implements IRegisterBusiSV {

    private static final Log LOG = LogFactory.getLog(RegisterBusiSVImpl.class);
    @Autowired
    public IRegisterAtomSV registerAtomSv;
    
    @Autowired
    public IUcContactsInfoAtomSV iUcContactsInfoAtomSV;
    
    
    /**
     * 个人用户、企业注册、代理商、供应商注册
     */
    
    @Override
    public String insertUserInfo(RegisterParamsRequest registerParamsRequest) {
            UcUserParams userParams = registerParamsRequest.getUcUserParam();
            List<UcUser> list = getUserInfoBycondition(userParams);
            if(!CollectionUtil.isEmpty(list)){
                throw new BusinessException(ExceptCodeConstants.Account.ACCOUNT_SET_INFO_CHECK_FAILED, "账户不唯一");
            }
            UcUser ucUser = new UcUser();
            if(userParams==null){
                throw new BusinessException("ACCOUNT_SET_INFO_CHECK_FAILED","注册失败,请输入用户信息");
            }
            
            //插入user主表
            String userId = SequenceUtil.createUserId();
            userParams.setUserId(userId);
            userParams.setTenantId("SLP");
            userParams.setUserLoginName(userParams.getUserLoginName().toLowerCase());
            //用户信息
            BeanUtils.copyProperties(ucUser, userParams);
           
            ucUser.setUserState(ExceptCodeConstants.Account.REGISTER_STATE);
            registerAtomSv.insertUserInfo(ucUser);
             
            
          
            //创建支付密码账户
            RegAccReq vo = new RegAccReq();
            vo.setExternalId(UUIDUtil.genId32());// 外部流水号ID
            vo.setSystemId("SLP-UAC_WEB");// 系统ID
            vo.setTenantId(Account.TENANT_ID);// 租户ID
            vo.setRegCustomerId(userId);
            vo.setAcctName(userParams.getUserLoginName());
            vo.setAcctType("0");// 账户类型， 0 后付费
            vo.setRegType("1");//注册方式网站注册
            vo.setPayType("2");// 支付方式
            IAccountMaintainSV accountMaintainSV = DubboConsumerFactory.getService(IAccountMaintainSV.class);
            try {
               accountMaintainSV.createAccount(vo);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return userId;
            
    }
    /**
     * 获取用户信息
     */
    @Override
    public boolean checkUserExist(UcUserParams userParams) {
        List<UcUser> list = getUserInfoBycondition(userParams);
        boolean flag = list!=null&&list.size()>0?false:true;
        return flag;
    }
    
    /**
     * 企业用户名或者手机号是不是唯一
     */
    @Override
    public boolean checkUcGroupKeyExist(UcGroupKeyInfoParams ucGroupKeyInfoParams){
        boolean flag = false;
        /**
         * 用户名或者手机号是不是唯一
         */
        UcGroupKeyInfoCriteria example =  new UcGroupKeyInfoCriteria();
        UcGroupKeyInfoCriteria.Criteria criteria = example.createCriteria();
        if(!StringUtil.isBlank(ucGroupKeyInfoParams.getCustName())){
            criteria.andCustNameEqualTo(ucGroupKeyInfoParams.getCustName());
        }
        List<UcGroupKeyInfo> list = registerAtomSv.getUcGroupKeyInfo(example);
        /**
         * list.size()>0说明用户名或者手机不唯一，返回false
         */
        flag = list!=null&&list.size()>0?false:true;
        
        return flag;
    }
    
    
    /**
     * 企业资质认证(企业注册后台)
     */
    @Override
    public void insertCompanyInfoAttest(RegisterParamsRequest registerParamsRequest) {
        
            /**
             * 获取当前用户信息
             */
            UcUserParams userParams = registerParamsRequest.getUcUserParam();
            List<UcUser> list = getUserInfoBycondition(userParams);
            
            if(CollectionUtil.isEmpty(list)){
                throw new BusinessException("ACCOUNT_NOT_FOUND", "账户资料验证失败");
            }
            
            String userId = list.get(0).getUserId();
            userParams.setUserId(userId);
            //企业客户关键信息表
            UcGroupKeyInfo ucGroupKeyInfo = new UcGroupKeyInfo();
            UcGroupKeyInfoParams ucGroupKeyInfoParams = registerParamsRequest.getUcGroupKeyInfoParams();
            if(ucGroupKeyInfoParams==null){
                throw new BusinessException(ExceptCodeConstants.Account.ACCOUNT_SET_INFO_CHECK_FAILED, "请输入企业客户信息");
            }
            BeanUtils.copyProperties(ucGroupKeyInfo, ucGroupKeyInfoParams);
            ucGroupKeyInfo.setUserId(userId);
            registerAtomSv.insertUcGroupKeyInfo(ucGroupKeyInfo);
            
            //用户联系人表
            UcContactsInfo ucContactsInfo = new UcContactsInfo();
            ucContactsInfo.setUserId(userId);
            UcContactInfoParams ucContactInfoParams = registerParamsRequest.getUcContactInfoParams();
            if(ucContactInfoParams==null){
                throw new BusinessException(ExceptCodeConstants.Account.ACCOUNT_SET_INFO_CHECK_FAILED, "请输入企业客户信息");
            }
            BeanUtils.copyProperties(ucContactsInfo, ucContactInfoParams);
            registerAtomSv.insertUcContactsInfo(ucContactsInfo);
            
            
            
    }
    
    /**
     * 供货商申请注册
     * @param userParams
     * @return
     * @author zhangyh7
     * @ApiDocMethod
     */
    public void inertProviderInfo(RegisterParamsRequest registerParamsRequest){
        
            //企业客户关键信息表
            UcGroupKeyInfo ucGroupKeyInfo = new UcGroupKeyInfo();
            UcUserParams userParams = registerParamsRequest.getUcUserParam();
            ucGroupKeyInfo.setUserId(userParams.getUserId());
            UcGroupKeyInfoParams ucGroupKeyInfoParams = registerParamsRequest.getUcGroupKeyInfoParams();
            if(ucGroupKeyInfoParams==null){
                throw new BusinessException(ExceptCodeConstants.Account.ACCOUNT_SET_INFO_CHECK_FAILED, "请输入供应商信息");
            }
            BeanUtils.copyProperties(ucGroupKeyInfo, ucGroupKeyInfoParams);
            registerAtomSv.insertUcGroupKeyInfo(ucGroupKeyInfo);
            
            //缺少供应产品信息
            
            
    }
    
    public List<UcUser>  getUserInfoBycondition(UcUserParams userParams){
        /**
         * 用户名、手机号、邮箱是不是唯一
         */
        UcUserCriteria example = new UcUserCriteria();
        UcUserCriteria.Criteria criteria = example.createCriteria();
        if(!StringUtils.isBlank(userParams.getUserMp())){
            criteria.andUserTypeEqualTo(userParams.getUserType());
            criteria.andUserMpEqualTo(userParams.getUserMp());
        }
        if(!StringUtils.isBlank(userParams.getUserLoginName())){
            criteria.andUserTypeEqualTo(userParams.getUserType());
            criteria.andUserLoginNameEqualTo(userParams.getUserLoginName());
        }
        if(!StringUtils.isBlank(userParams.getUserEmail())){
            criteria.andUserTypeEqualTo(userParams.getUserType());
            criteria.andUserEmailEqualTo(userParams.getUserEmail());
        }
        List<UcUser> list = registerAtomSv.getUserInfo(example);
        
        return list;
    }
}
