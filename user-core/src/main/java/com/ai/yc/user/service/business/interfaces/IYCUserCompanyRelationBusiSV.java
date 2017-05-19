package com.ai.yc.user.service.business.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.usercompanyrelation.param.CompanyRelationResponse;
import com.ai.yc.user.api.usercompanyrelation.param.UserCompanyRelationPageInfoRequest;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelation;

import java.util.List;

public interface IYCUserCompanyRelationBusiSV {
	public BaseResponse insertCompanyRelationInfo(UsrCompanyRelation companyRelationInfo);
	public BaseResponse updateCompanyRelationInfo(UsrCompanyRelation companyRelationInfo);
	public CompanyRelationResponse getCompanyUser(UserCompanyRelationPageInfoRequest pageInfoRequest);
	public List<UsrCompanyRelation> getusrCompanyRelationInfo(String userID);
}
