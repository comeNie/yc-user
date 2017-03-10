package com.ai.yc.user.api.usercompanyrelation.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoRequest;
import com.ai.yc.user.api.usercompanyrelation.interfaces.IYCUserCompanyRelationSV;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelation;
import com.ai.yc.user.service.business.interfaces.IYCUserCompanyRelationBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
@Service
@Component
public class YCUserCompanyRelationSVImpl implements IYCUserCompanyRelationSV{

	@Autowired
	private IYCUserCompanyRelationBusiSV ycUserCompanyBusiSV;

	@Override
	public BaseResponse insertCompanyRelationInfo(
			UserCompanyInfoRequest userInfoRequest) throws BusinessException,
			SystemException {
		UsrCompanyRelation companyRelation = new UsrCompanyRelation();
		BeanUtils.copyProperties(companyRelation, userInfoRequest);
		return ycUserCompanyBusiSV.insertCompanyRelationInfo(companyRelation);
	}

	@Override
	public BaseResponse updateCompanyRelationInfo(UserCompanyInfoRequest userInfoRequest)
			throws BusinessException, SystemException {
		UsrCompanyRelation companyRelation = new UsrCompanyRelation();
		BeanUtils.copyProperties(companyRelation, userInfoRequest);
		return ycUserCompanyBusiSV.updateCompanyRelationInfo(companyRelation);
	}
	
	

}
