package com.ai.yc.user.service.atom.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.user.api.usercontact.param.UserContactInfoRespose;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrContactCriteria;
import com.ai.yc.user.dao.mapper.interfaces.UsrContactMapper;
import com.ai.yc.user.service.atom.interfaces.IYCUserContactAtomSV;

@Component
public class YCUserContactAtomSVImpl implements IYCUserContactAtomSV{

	@Autowired
	private transient UsrContactMapper uContactMapper;
	
	@Override
	public int insertContactInfo(UsrContact contactInfo) {
		return uContactMapper.insertSelective(contactInfo);
	}

	@Override
	public int updateContactInfo(UsrContact contactInfo) {
		return uContactMapper.updateByPrimaryKeySelective(contactInfo);
	}

	@Override
	public int deleteContactInfo(String contactId) {
		return uContactMapper.deleteByPrimaryKey(contactId);
	}

	@Override
	public List<UsrContact> queryContactInfo(UsrContactCriteria example) {
		return uContactMapper.selectByExample(example);
	}

	@Override
	public int updateContactDefaultMode(UsrContact contactInfo) {
		return uContactMapper.updateByPrimaryKey(contactInfo);
	}

	@Override
	public int getContactCount(UsrContactCriteria example) {
		return uContactMapper.countByExample(example);
	}
}
