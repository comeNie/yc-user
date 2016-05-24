package com.ai.slp.user.api.ucUserSecurity.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.slp.user.api.ucUserSecurity.interfaces.IUcUserSecurityManageSV;
import com.ai.slp.user.api.ucUserSecurity.param.UcUserEmailRequest;
import com.ai.slp.user.api.ucUserSecurity.param.UcUserPasswordRequest;
import com.ai.slp.user.api.ucUserSecurity.param.UcUserPhoneRequest;
import com.ai.slp.user.constants.ExceptCodeConstants;
import com.ai.slp.user.dao.mapper.bo.UcUser;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;
import com.ai.slp.user.service.business.interfaces.IUcUserBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class UcUserSecurityManageSVImpl implements IUcUserSecurityManageSV {

	@Autowired
	IUcUserBusiSV iAccountBusiSV;

	@Override
	public BaseResponse setEmailData(UcUserEmailRequest emailModifyRequest) throws BusinessException,SystemException {
		/*// 入参检查
		iVoValidateSV.validateSetAccountEmail(emailModifyRequest);*/
		// 整理数据
		UcUser gnAccount = new UcUser();
		BeanUtils.copyProperties(gnAccount, emailModifyRequest);
		return updateAccountById(gnAccount,"邮箱");
	}

	@Override
	public BaseResponse setPasswordData(UcUserPasswordRequest passwordModifyRequest) throws BusinessException,SystemException {
		//iVoValidateSV.validateSetAccountPwd(passwordModifyRequest);
		// 整理数据
	    UcUser gnAccount = new UcUser();
		BeanUtils.copyProperties(gnAccount, passwordModifyRequest);
		return updateAccountById(gnAccount,"密码");
	}

	@Override
	public BaseResponse setPhoneData(UcUserPhoneRequest phoneModifyRequest) throws BusinessException,SystemException {
		//iVoValidateSV.validateSetPhoneTenant(phoneModifyRequest);
		// 整理数据
		UcUser gnAccount = new UcUser();
		BeanUtils.copyProperties(gnAccount, phoneModifyRequest);
		return updateAccountById(gnAccount,"电话");
	}

	/**
	 * 根据账号ID更新账户信息
	 * 
	 * @param gnAccount
	 * @return
	 * @throws SystemException
	 */
	private BaseResponse updateAccountById(UcUser gnAccount,String message) throws SystemException {
	    UcUserCriteria criteria = new UcUserCriteria();
	    criteria.or().andUserIdEqualTo(gnAccount.getUserId());
		gnAccount.setUpdateTime(DateUtil.getSysDate());
		int updateCount = iAccountBusiSV.updateByAccountId(gnAccount,criteria);
		BaseResponse baseResponse = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		if (updateCount > 0) {
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.SUCCESS);
			responseHeader.setResultMessage(message+"更新成功");
		} else {
			responseHeader.setIsSuccess(false);
			responseHeader.setResultCode(ExceptCodeConstants.FAILD);
			responseHeader.setResultMessage(message+"更新失败");
		}
		baseResponse.setResponseHeader(responseHeader);
		return baseResponse;
	}

}
