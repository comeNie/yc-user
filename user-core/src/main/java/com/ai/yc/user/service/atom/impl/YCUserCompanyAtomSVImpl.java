package com.ai.yc.user.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.user.dao.mapper.bo.UsrCompany;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyCriteria;
import com.ai.yc.user.dao.mapper.interfaces.UsrCompanyMapper;
import com.ai.yc.user.service.atom.interfaces.IYCUserCompanyAtomSV;
@Component
public class YCUserCompanyAtomSVImpl implements IYCUserCompanyAtomSV{

	@Autowired
	private  transient UsrCompanyMapper usrCompanyMapper;
	
	@Override
	public int insertCompanyInfo(UsrCompany companyInfo) {
		return usrCompanyMapper.insertSelective(companyInfo);
	}

	@Override
	public int updateCompanyInfo(UsrCompany companyInfo) {
		return usrCompanyMapper.updateByPrimaryKey(companyInfo);
	}

	@Override
	public int deleteCompanyInfo(String companyId) {
		return usrCompanyMapper.deleteByPrimaryKey(companyId);
	}

	@Override
	public List<UsrCompany> queryCompanyInfo(UsrCompanyCriteria example) {
		return usrCompanyMapper.selectByExample(example);
	}

	@Override
	public int getCompanyCount(UsrCompanyCriteria example) {
		return usrCompanyMapper.countByExample(example);
	}

}
