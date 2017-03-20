package com.ai.yc.user.api.usercompany.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.user.api.usercompany.interfaces.IYCUserCompanySV;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoListResponse;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoRequest;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoResponse;
import com.ai.yc.user.api.usercompany.param.UserCompanyPageInfoRequest;
import com.ai.yc.user.dao.mapper.bo.UsrCompany;
import com.ai.yc.user.service.business.interfaces.IYCUserCompanyBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
@Service
@Component
public class YCUserCompanySVImpl implements IYCUserCompanySV{

	@Autowired
	private IYCUserCompanyBusiSV ycUserCompanyBusiSV;
	
	@Override
	public BaseResponse insertCompanyInfo(UserCompanyInfoRequest userInfoRequest)
			throws BusinessException, SystemException {
		String companyId = SeqUtil.getNewId("YC_USER$COMPANY_ID$SEQ", 8);
		UsrCompany usrCompany = new UsrCompany();
		BeanUtils.copyProperties(usrCompany, userInfoRequest);
		usrCompany.setCompanyId(companyId);
		usrCompany.setState(0);
		return ycUserCompanyBusiSV.insertCompanyInfo(usrCompany);
	}

	@Override
	public BaseResponse updateCompanyInfo(UserCompanyInfoRequest userInfoRequest)
			throws BusinessException, SystemException {
		UsrCompany usrCompany = new UsrCompany();
		BeanUtils.copyProperties(usrCompany, userInfoRequest);
		return ycUserCompanyBusiSV.updateCompanyInfo(usrCompany);
	}

	@Override
	public UserCompanyInfoResponse queryCompanyInfo(
			UserCompanyInfoRequest userInfoRequest) throws BusinessException,
			SystemException {
		return ycUserCompanyBusiSV.queryCompanyInfo(userInfoRequest);
	}

	@Override
	@POST
	@Path("/checkCompanyName")
	public BaseResponse checkCompanyName(
			UserCompanyInfoRequest userInfoRequest) throws BusinessException,
			SystemException {
		return ycUserCompanyBusiSV.checkCompanyInfo(userInfoRequest);
	}

	@Override
	@POST
	@Path("/queryPageInfoCompanyInfo")
	public UserCompanyInfoListResponse queryPageInfoCompanyInfo(
			UserCompanyPageInfoRequest userInfoRequest)
			throws BusinessException, SystemException {
		 return ycUserCompanyBusiSV.queryPageInfoCompanyInfo(userInfoRequest);
	}

}
