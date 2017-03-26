package com.ai.yc.user.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrContactCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UsrUserCriteria;
import com.ai.yc.user.dao.mapper.interfaces.UsrContactMapper;
import com.ai.yc.user.dao.mapper.interfaces.UsrUserMapper;
import com.ai.yc.user.service.atom.interfaces.IYCUserServiceAtomSV;


@Component
public class YCUserServiceAtomSVImpl implements IYCUserServiceAtomSV {

	@Autowired
	private transient UsrUserMapper tUserMapper;
	
//	@Autowired
//	private transient UsrTranslatorMapper uTranslatorMapper;

	@Autowired
	private transient UsrContactMapper uContactMapper;
	
//	@Autowired
//	private transient UsrLanguageMapper uLanguageMapper;
	
//	@Autowired
//	private transient UsrLspMapper uLspMapper;
	
	@Override
	public int updateUserInfo(UsrUser record, UsrUserCriteria example) {
		return tUserMapper.updateByExampleSelective(record, example);
	}

	@Override
	public UsrUser getUserInfo(String userId) {
		return tUserMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int insertUserInfo(UsrUser user) {
		return tUserMapper.insert(user);
	}

	@Override
	public List<UsrContact> getUsrContactInfo(String userId) {
		UsrContactCriteria example = new UsrContactCriteria();
		UsrContactCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		return uContactMapper.selectByExample(example);

	}

	@Override
	public UsrUser getUserInfoByNickName(UsrUserCriteria example) {
		List<UsrUser> list = tUserMapper.selectByExample(example);
		if(!CollectionUtil.isEmpty(list)){
			return list.get(0);
		} else {
			return null;
		}
		
	}


	@Override
	public int insertContactInfo(UsrContact usrContact) {
		return uContactMapper.insertSelective(usrContact);
	}

	@Override
	public int deleteContactInfo(String contactId) {
		return uContactMapper.deleteByPrimaryKey(contactId);
	}

	@Override
	public List<UsrUser> getAllUserInfo() {
		UsrUserCriteria example = new UsrUserCriteria();
		List<UsrUser> list = tUserMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<UsrUser> getUserInfo(UsrUserCriteria example) {
		return tUserMapper.selectByExample(example);
	}

	@Override
	public int countByExample(UsrUserCriteria example) {
		return tUserMapper.countByExample(example);
	}

	
}
