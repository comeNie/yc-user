package com.ai.yc.user.service.business.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.yc.ucenter.api.members.interfaces.IUcMembersSV;
import com.ai.yc.ucenter.api.members.param.register.UcMembersRegisterRequest;
import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.constants.SequenceCodeConstants.UserSequenceCode;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrTranslator;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UsrUserCriteria;
import com.ai.yc.user.service.atom.interfaces.IYCUserServiceAtomSV;
import com.ai.yc.user.service.business.interfaces.IYCUserServiceBusiSV;
import com.ai.yc.user.util.UCDateUtils;

@Service
@Transactional
public class YCUserServiceBusiSVImpl implements IYCUserServiceBusiSV {

    private static final Log LOG = LogFactory.getLog(YCUserServiceBusiSVImpl.class);

    @Autowired
    public IYCUserServiceAtomSV ycUSAtomSV;
    
    /**
     * resultCode
     * 0 fail
     * 1 success
     */
	@Override
	public String insertUserInfo(InsertYCUserRequest insertinfo)  {
		if(StringUtil.isBlank(insertinfo.getRegip())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户ip不能为空");
		}
		
		if(StringUtil.isBlank(insertinfo.getLoginway())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户名不能为空");
		} else {
			if(insertinfo.getLoginway().equals("1")){
				if(StringUtil.isBlank(insertinfo.getEmail())){
					throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户名不能为空");
				}
			}
			if(insertinfo.getLoginway().equals("2")){
				if(StringUtil.isBlank(insertinfo.getEmail())){
					throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户名不能为空");
				}
			}
		}
		
		if(StringUtil.isBlank(insertinfo.getUserName())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户名不能为空");
		}
		
		if(StringUtil.isBlank(insertinfo.getNickname())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:昵称不能为空");
		}
		
		// 孟博注册接口
		IUcMembersSV iUcMembersSV = DubboConsumerFactory.getService(IUcMembersSV.class);
		UcMembersRegisterRequest umrr = new UcMembersRegisterRequest();
		umrr.setRegip(insertinfo.getRegip());
		umrr.setOperationcode(insertinfo.getOperationcode());
		umrr.setUsername(insertinfo.getUserName());
		umrr.setEmail(insertinfo.getEmail());
		umrr.setPassword(insertinfo.getPassword());
		umrr.setUsersource("gtcom");
		umrr.setLoginmode("0");
		umrr.setLoginway(insertinfo.getLoginway());
		umrr.setCreatetime(UCDateUtils.getSystime() + "");
		iUcMembersSV.ucRegisterMember(umrr);
		
		// 插入数据
		UsrUser tUser = new UsrUser();
		// 从右到左
		BeanUtils.copyProperties(tUser, insertinfo);
		String UserId = SeqUtil.getNewId(UserSequenceCode.CM_CUST_FILE_EXT$INFO_EXT$ID,18);
		tUser.setUserId(UserId);
		ycUSAtomSV.insertUserInfo(tUser);
		// 支付账户信息
		return UserId;
	}

	@Override
	public int updateUserInfo(UpdateYCUserRequest userparam) {
		if(StringUtil.isBlank(userparam.getUserId())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户Id不能为空");
		}
		UsrUser user = UsrUser.getUsrUserByUpparam(userparam);
		UsrUserCriteria example = new UsrUserCriteria();
		UsrUserCriteria.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(user.getUserId());
        return  ycUSAtomSV.updateUserInfo(user, example);
        
	}

	@Override
	public UsrUser searchUserInfo(String userID) {
		UsrUser usrUser = ycUSAtomSV.getUserInfo(userID);
		return usrUser;
	}

	@Override
	public UsrTranslator searchYCUsrTranslatorInfo(String userId) {
		UsrTranslator utr = ycUSAtomSV.getUsrTranslatorInfo(userId);
		return utr;
	}

	@Override
	public UsrContact searchUsrContactInfo(String userId) {
		UsrContact usrC = ycUSAtomSV.getUsrContactInfo(userId);
		return usrC;
	}

}
