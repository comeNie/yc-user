package com.ai.yc.user.api.usercollection.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.yc.user.api.usercollectiontranslation.interfaces.IYCUserCollectionSV;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoRequest;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoResponse;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslation;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslationCriteria;
import com.ai.yc.user.service.business.interfaces.IYCUserCollectionBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
@Service
@Component
public class YCUserCollectionSVImpl implements IYCUserCollectionSV{

	@Autowired
	private IYCUserCollectionBusiSV ycUserCollectionSV;
	
	@Override
	public BaseResponse insertCollectionInfo(
			UserCollectionInfoRequest userInfoRequest) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		String collectId = SeqUtil.getNewId("YC_USER$COLLECTION_ID$SEQ", 8);
		UsrCollectionTranslation collectionTranslation = new UsrCollectionTranslation();
		BeanUtils.copyProperties(collectionTranslation, userInfoRequest);
		collectionTranslation.setCollectionId(collectId);
		response.setResponseHeader(header);
		return ycUserCollectionSV.insertCollectionInfo(collectionTranslation);
	}

	@Override
	public UserCollectionInfoResponse queryCollectionInfo(
			UserCollectionInfoRequest userInfoRequest) {
		UsrCollectionTranslationCriteria example = new UsrCollectionTranslationCriteria();
		UsrCollectionTranslationCriteria.Criteria criteria = example.createCriteria();
		if(!StringUtil.isBlank(userInfoRequest.getCollectionId())){
			criteria.andCollectionIdEqualTo(userInfoRequest.getCollectionId());
		}
		return ycUserCollectionSV.queryCollectionInfo(userInfoRequest);
	}

	@Override
	public BaseResponse updateCollectionInfo(
			UserCollectionInfoRequest userInfoRequest) {
		UsrCollectionTranslation translation = new UsrCollectionTranslation();
		BeanUtils.copyProperties(translation, userInfoRequest);
		return ycUserCollectionSV.updateCollectionInfo(translation);
	}

	@Override
	public BaseResponse deleteCollectionInfo(UserCollectionInfoRequest userInfoRequest) {
		return ycUserCollectionSV.deleteCollectionInfo(userInfoRequest);
	}

}
