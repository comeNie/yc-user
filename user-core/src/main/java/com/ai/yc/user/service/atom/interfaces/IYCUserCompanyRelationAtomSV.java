package com.ai.yc.user.service.atom.interfaces;

import java.util.List;

import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelation;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelationCriteria;

public interface IYCUserCompanyRelationAtomSV {

	public int insertRelationInfo(UsrCompanyRelation relationInfo);
	
	public int updateRelationInfo(UsrCompanyRelation relationInfo);
	
	public List<UsrCompanyRelation> queryRelationInfo(UsrCompanyRelationCriteria example);
}
