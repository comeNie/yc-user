package com.ai.yc.user.service.business.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelation;

public interface IYCUserCompanyRelationBusiSV {
	public BaseResponse insertCompanyRelationInfo(UsrCompanyRelation companyRelationInfo);
	public BaseResponse updateCompanyRelationInfo(UsrCompanyRelation companyRelationInfo);
}
