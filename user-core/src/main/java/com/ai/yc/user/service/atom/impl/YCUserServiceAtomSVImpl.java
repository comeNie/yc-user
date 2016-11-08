package com.ai.yc.user.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrLanguage;
import com.ai.yc.user.dao.mapper.bo.UsrLanguageCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrTranslator;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UsrUserCriteria;
import com.ai.yc.user.dao.mapper.interfaces.UsrContactMapper;
import com.ai.yc.user.dao.mapper.interfaces.UsrLanguageMapper;
import com.ai.yc.user.dao.mapper.interfaces.UsrTranslatorMapper;
import com.ai.yc.user.dao.mapper.interfaces.UsrUserMapper;
import com.ai.yc.user.service.atom.interfaces.IYCUserServiceAtomSV;


@Component
public class YCUserServiceAtomSVImpl implements IYCUserServiceAtomSV {

	@Autowired
	private transient UsrUserMapper tUserMapper;
	
	@Autowired
	private transient UsrTranslatorMapper uTranslatorMapper;

	@Autowired
	private transient UsrContactMapper uContactMapper;
	
	@Autowired
	private transient UsrLanguageMapper uLanguageMapper;
	
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
	public UsrTranslator getUsrTranslatorInfo(String userId) {
		return uTranslatorMapper.selectByPrimaryKey(userId);
	}

	@Override
	public UsrContact getUsrContactInfo(String userId) {
		return uContactMapper.selectByPrimaryKey(userId);
	}

	@Override
	public UsrUser getUserInfoByNickName(UsrUserCriteria example) {
		List<UsrUser> list = tUserMapper.selectByExample(example);
		if(!CollectionUtil.isEmpty(list)){
			return list.get(0);
		}
		return list.get(0);
	}

	@Override
	public List<UsrLanguage> getUsrLanguageList(UsrLanguageCriteria userIdCri) {
		return uLanguageMapper.selectByExample(userIdCri);
	}
}
