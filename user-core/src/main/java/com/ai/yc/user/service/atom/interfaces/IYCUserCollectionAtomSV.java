package com.ai.yc.user.service.atom.interfaces;

import java.util.List;

import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslation;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslationCriteria;

public interface IYCUserCollectionAtomSV {
	public int insertCollectionInfo(UsrCollectionTranslation contactInfo);
	public int updateCollectionInfo(UsrCollectionTranslation contactInfo);
	public int deleteCollectionInfo(UsrCollectionTranslationCriteria example);
	public List<UsrCollectionTranslation> queryCollectionInfo(UsrCollectionTranslationCriteria example);
	public int getCollectionCount(UsrCollectionTranslationCriteria example);
}
