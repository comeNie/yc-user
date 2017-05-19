package com.ai.yc.user.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.user.api.usercompany.param.UserCompanyRelationPageInfo;
import com.ai.yc.user.dao.mapper.attach.UsrCompanyRelationAttachMapper;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelation;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelationCriteria;
import com.ai.yc.user.dao.mapper.interfaces.UsrCompanyRelationMapper;
import com.ai.yc.user.service.atom.interfaces.IYCUserCompanyRelationAtomSV;

@Component
public class YCUserCompanyRelationAtomSVImpl implements IYCUserCompanyRelationAtomSV{

	@Autowired
	private  transient UsrCompanyRelationMapper usrCompanyRelationMapper;
	
	@Autowired
	private transient UsrCompanyRelationAttachMapper usrCompanyRelationAttachMapper;
	
	@Override
	public int insertRelationInfo(UsrCompanyRelation relationInfo) {
		return usrCompanyRelationMapper.insertSelective(relationInfo);
	}

	@Override
	public List<UsrCompanyRelation> queryRelationInfo(UsrCompanyRelationCriteria example) {
		return usrCompanyRelationMapper.selectByExample(example);
	}

	@Override
	public int updateRelationInfo(UsrCompanyRelation relationInfo) {
		return usrCompanyRelationMapper.updateByPrimaryKeySelective(relationInfo);
	}

	@Override
	public List<UserCompanyRelationPageInfo> getCompanyUser(String companyId,int startLimit,int endLimit) {
		return usrCompanyRelationAttachMapper.getCompanyInfoList(companyId,startLimit,endLimit);
	}

	@Override
	public int getCompanyUserCount(String companyId) {
		return usrCompanyRelationAttachMapper.getCompanyInfoCount(companyId);
	}

	@Override
	public List<UsrCompanyRelation> getusrCompanyRelationInfo(String userID) {
		UsrCompanyRelationCriteria example = new UsrCompanyRelationCriteria();
		example.createCriteria().andUserIdEqualTo(userID);
		List<UsrCompanyRelation> usrCompanyRelations = usrCompanyRelationMapper.selectByExample(example);
		return usrCompanyRelations;
	}
}
