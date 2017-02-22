package com.ai.yc.user.service.atom.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoRequest;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslation;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslationCriteria;
import com.ai.yc.user.dao.mapper.interfaces.UsrCollectionTranslationMapper;
import com.ai.yc.user.service.atom.interfaces.IYCUserCollectionAtomSV;

@Component
public class YCUserCollectionAtomSVImpl implements IYCUserCollectionAtomSV{

	@Autowired
	private transient UsrCollectionTranslationMapper uCollectionMapper;

	@Override
	public int insertCollectionInfo(UsrCollectionTranslation collectionInfo) {
		return uCollectionMapper.insertSelective(collectionInfo);
	}

	@Override
	public int updateCollectionInfo(UsrCollectionTranslation collectionInfo) {
		return uCollectionMapper.updateByPrimaryKeySelective(collectionInfo);
	}

	@Override
	public int deleteCollectionInfo(UsrCollectionTranslationCriteria example) {
		return uCollectionMapper.deleteByExample(example);
	}

	@Override
	public List<UsrCollectionTranslation> queryCollectionInfo(
			UsrCollectionTranslationCriteria example) {
		return uCollectionMapper.selectByExample(example);
	}

	@Override
	public int getCollectionCount(UsrCollectionTranslationCriteria example) {
		// TODO Auto-generated method stub
		return uCollectionMapper.countByExample(example);
	}
}
