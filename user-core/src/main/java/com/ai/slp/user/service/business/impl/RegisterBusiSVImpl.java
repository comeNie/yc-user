package com.ai.slp.user.service.business.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.user.api.register.param.UcBankKeyInfoParams;
import com.ai.slp.user.api.register.param.UcContactInfoParams;
import com.ai.slp.user.api.register.param.UcCustKeyInfoParams;
import com.ai.slp.user.api.register.param.UcGroupKeyInfoParams;
import com.ai.slp.user.api.register.param.UcUserParams;
import com.ai.slp.user.dao.mapper.bo.UcBankInfo;
import com.ai.slp.user.dao.mapper.bo.UcContactsInfo;
import com.ai.slp.user.dao.mapper.bo.UcCustKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfoCriteria;
import com.ai.slp.user.dao.mapper.bo.UcStateChg;
import com.ai.slp.user.dao.mapper.bo.UcUser;
import com.ai.slp.user.dao.mapper.bo.UcUserAgree;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;
import com.ai.slp.user.service.atom.interfaces.IRegisterAtomSV;
import com.ai.slp.user.service.business.interfaces.IRegisterBusiSV;

@Service
@Transactional
public class RegisterBusiSVImpl implements IRegisterBusiSV {

    private static final Log LOG = LogFactory.getLog(RegisterBusiSVImpl.class);
    @Autowired
    public IRegisterAtomSV registerAtomSv;
    
    //注册
    public String REGISTER_STATE = "11";
    //正常
    public String NORMAL_STATE="10";
    //冻结
    public String FREEZE_STATE="12";
    
    //个人注册代码
    public String USER_REGISTER="10";
    //企业注册代码
    public String COMPANY_REGISTER="11";
    //代理商注册代码
    public String AGENT_REGISTER="12";
    //供应商注册代码
    public String PROVIDER_REGISTER="13";
    
    /**
     * 个人用户、企业注册、代理商、供应商注册
     */
    
    @Override
    public BaseResponse insertUserInfo(UcUserParams userParams) {
            BaseResponse response = new BaseResponse();
            ResponseHeader responseHeader = null;
            /**
             * 用户名、手机号、邮箱是不是唯一
             */
            List<UcUser> list = getUserInfoBycondition(userParams);
            boolean flag = list.size()>0?false:true;
            if(flag){
                responseHeader = new ResponseHeader(false,"fail","请输入有效信息");
                response.setResponseHeader(responseHeader);
                return response;
            }
            
            try{
                UcUser ucUser = new UcUser();
                BeanUtils.copyProperties(ucUser, userParams);
                //插入user主表
                ucUser.setUserType(REGISTER_STATE);
                int userId = registerAtomSv.insertUserInfo(ucUser);
                
                //用户状态变更
                insertUserStateChg(userParams,REGISTER_STATE);
                
                //个人用户注册需要添加一个有注册转变为正常状态的记录
                if(USER_REGISTER.equals(userParams.getUserType())){
                    insertUserStateChg(userParams,NORMAL_STATE);
                }
                
                //插入用户协议表
                UcUserAgree ucUserAgree = new UcUserAgree();
                ucUserAgree.setUserId(Long.parseLong(String.valueOf(userId)));
                registerAtomSv.InsertUcUserAgreeAtomSv(ucUserAgree);
                responseHeader = new ResponseHeader(true,"success","注册成功");
            
            }catch(Exception e){
                responseHeader = new ResponseHeader(false,"fail","注册失败");
                LOG.error("注册失败", e);
            }
           response.setResponseHeader(responseHeader);
           return response;
    }
    /**
     * 获取用户信息
     */
    @Override
    public BaseResponse getUserInfo(UcUserParams userParams) {
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader = null;
        List<UcUser> list = getUserInfoBycondition(userParams);
        boolean flag = list.size()>0?false:true;
       
        if(flag){
            responseHeader = new ResponseHeader(false,"fail","该用户已注册，请重新输入");
        }else{
            responseHeader = new ResponseHeader(true,"success","");
        }
        response.setResponseHeader(responseHeader);
        return response;
    }
    
    @Override
    public BaseResponse getUcGroupKeyInfo(UcGroupKeyInfoParams ucGroupKeyInfoParams){
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader = null;
        
        boolean flag = getUcGroupKeyInfoByCondition(ucGroupKeyInfoParams);
        if(flag){
            responseHeader = new ResponseHeader(false,"fail","该用户已注册，请重新输入");
        }else{
            responseHeader = new ResponseHeader(true,"success","");
        }
        response.setResponseHeader(responseHeader);
        
        return response;
    }
    
    
    /**
     * 企业资质认证(企业注册后台)
     */
    @Override
    public BaseResponse insertCompanyInfoAttest(UcUserParams userParams,UcGroupKeyInfoParams ucGroupKeyInfoParams,UcContactInfoParams ucContactInfoParams) {
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader = null;
        
        try{
            
            /**
             * 获取当前用户信息
             */
            List<UcUser> list = getUserInfoBycondition(userParams);
            long userId = list.get(0).getUserId();
            userParams.setUserId(userId);
            //企业客户关键信息表
            UcGroupKeyInfo ucGroupKeyInfo = new UcGroupKeyInfo();
            BeanUtils.copyProperties(ucGroupKeyInfo, ucGroupKeyInfoParams);
            ucGroupKeyInfo.setUserId(userId);
            registerAtomSv.insertUcGroupKeyInfo(ucGroupKeyInfo);
            
            //用户联系人表
            UcContactsInfo ucContactsInfo = new UcContactsInfo();
            ucContactsInfo.setUserId(userId);
            BeanUtils.copyProperties(ucContactsInfo, ucContactInfoParams);
            registerAtomSv.insertUcContactsInfo(ucContactsInfo);
            
            //用户状态变更
            insertUserStateChg(userParams,REGISTER_STATE);
            
        }catch(Exception e){
            responseHeader = new ResponseHeader(false,"fail","注册失败");
            LOG.error("注册失败", e);
        }
       response.setResponseHeader(responseHeader);
       return response;
    }
    
    /**
     * 代理商资质认证
     */
    @Override
    public BaseResponse insertAgentInfoAttest(UcUserParams userParams,UcGroupKeyInfoParams ucGroupKeyInfoParams,UcContactInfoParams ucContactInfoParams,UcBankKeyInfoParams ucBankKeyInfoParam) {
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader = null;
        
        try{
            
            /**
             * 获取当前用户信息
             */
            List<UcUser> list = getUserInfoBycondition(userParams);
            long userId = list.get(0).getUserId();
            userParams.setUserId(userId);
            //企业客户关键信息表
            UcGroupKeyInfo ucGroupKeyInfo = new UcGroupKeyInfo();
            BeanUtils.copyProperties(ucGroupKeyInfo, ucGroupKeyInfoParams);
            ucGroupKeyInfo.setUserId(userId);
            registerAtomSv.insertUcGroupKeyInfo(ucGroupKeyInfo);
            
            //用户联系人表
            UcContactsInfo ucContactsInfo = new UcContactsInfo();
            ucContactsInfo.setUserId(userId);
            BeanUtils.copyProperties(ucContactsInfo, ucContactInfoParams);
            registerAtomSv.insertUcContactsInfo(ucContactsInfo);
            
            //用户银行信息
            UcBankInfo ucBankInfo = new UcBankInfo();
            ucBankInfo.setUserId(userId);
            BeanUtils.copyProperties(ucBankInfo, ucBankKeyInfoParam);
            
            //用户状态变更
            insertUserStateChg(userParams,REGISTER_STATE);
            
        }catch(Exception e){
            responseHeader = new ResponseHeader(false,"fail","注册失败");
            LOG.error("注册失败", e);
        }
       response.setResponseHeader(responseHeader);
       return response;
    }
    
    
    /**
     * 个人认证
     * @param userParams
     * @param ucCustKeyInfpParam
     * @param ucBackInfo
     * @return
     * @author zhangyh7
     * @ApiDocMethod
     */
    public BaseResponse insertUserInfoAttest(UcUserParams userParams,UcCustKeyInfoParams ucCustKeyInfpParam,UcContactInfoParams ucContactInfoParams,UcBankInfo ucBackInfo){
       
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader = null;
        try{
            /**
             * 获取当前用户信息
             */
            List<UcUser> list = getUserInfoBycondition(userParams);
            long userId = list.get(0).getUserId();
            userParams.setUserId(userId);
            
            UcCustKeyInfo ucCustKeyInfo = new UcCustKeyInfo();
            ucCustKeyInfo.setUserId(userId);
            BeanUtils.copyProperties(ucCustKeyInfo, ucCustKeyInfpParam);
            registerAtomSv.insertUcCustKeyInfo(ucCustKeyInfo);
            responseHeader = new ResponseHeader(true,"succss","认证成功");
            
        }catch(Exception e){
            responseHeader = new ResponseHeader(false,"fail","认证失败");
        }
        
        response.setResponseHeader(responseHeader);
        
        return response;
    }
    
    
    /**
     * 供货商申请注册
     * @param userParams
     * @return
     * @author zhangyh7
     * @ApiDocMethod
     */
    public BaseResponse inertProviderInfo(UcUserParams userParams,UcGroupKeyInfoParams ucGroupKeyInfoParams){
        
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader = null;
        try{
            //企业客户关键信息表
            UcGroupKeyInfo ucGroupKeyInfo = new UcGroupKeyInfo();
            ucGroupKeyInfo.setUserId(userParams.getUserId());
            BeanUtils.copyProperties(ucGroupKeyInfo, ucGroupKeyInfoParams);
            registerAtomSv.insertUcGroupKeyInfo(ucGroupKeyInfo);
            responseHeader = new ResponseHeader(true,"success","注册成功");
            
            //缺少供应产品信息
            
            //用户状态变更
            insertUserStateChg(userParams,REGISTER_STATE);
            
        }catch(Exception e){
            LOG.error("供应商注册失败",e);
            responseHeader = new ResponseHeader(false,"fail","注册失败");
        }
        response.setResponseHeader(responseHeader);
        return response;
    }
    
    
    
    public List<UcUser>  getUserInfoBycondition(UcUserParams userParams){
        /**
         * 用户名、手机号、邮箱是不是唯一
         */
        UcUserCriteria criteria = new UcUserCriteria();
        if(!StringUtils.isBlank(userParams.getUserMp())){
            criteria.or().andUserMpEqualTo(userParams.getUserMp());
        }
        if(!StringUtils.isBlank(userParams.getUserLoginName())){
            criteria.or().andUserLoginNameEqualTo(userParams.getUserLoginName());
        }
        if(!StringUtils.isBlank(userParams.getUserEmail())){
            criteria.or().andUserEmailEqualTo(userParams.getUserEmail());
        }
        List<UcUser> list = registerAtomSv.getUserInfo(criteria);
        
        return list;
    }

    
    
    
    
    public boolean getUcGroupKeyInfoByCondition(UcGroupKeyInfoParams ucGroupKeyInfoParams){
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
        flag = list.size()>0?false:true;
        
        return flag;
    }
  
    /**
     * 用户轨迹状态变化方法
     * @param userParams
     * @return
     * @author zhangyh7
     * @ApiDocMethod
     */
    public int insertUserStateChg(UcUserParams userParams,String state){
        UcStateChg ucStateChgRegister = new UcStateChg();
        ucStateChgRegister.setTenantId(userParams.getTenantId());
        ucStateChgRegister.setUserId(Long.parseLong(String.valueOf(userParams.getUserId())));
        ucStateChgRegister.setOperType(userParams.getUserType());
        ucStateChgRegister.setNewState(state);
        ucStateChgRegister.setChgTime(new Timestamp(new Date().getTime()));
        return registerAtomSv.insertUcStateChgBusiInfo(ucStateChgRegister);
    }
}
