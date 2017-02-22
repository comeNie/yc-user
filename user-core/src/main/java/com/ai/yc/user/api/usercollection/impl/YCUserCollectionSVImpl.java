package com.ai.yc.user.api.usercollection.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.user.api.usercollectiontranslation.interfaces.IYCUserCollectionSV;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoListResponse;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoRequest;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoResponse;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionPageInfoRequest;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslation;
import com.ai.yc.user.service.business.interfaces.IYCUserCollectionBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
@Service
@Component
public class YCUserCollectionSVImpl implements IYCUserCollectionSV{

	@Autowired
	private IYCUserCollectionBusiSV ycUserCollectionSV;
	
	@Override
	public UserCollectionInfoResponse insertCollectionInfo(
			UserCollectionInfoRequest userInfoRequest) {
		String collectId = SeqUtil.getNewId("YC_USER$COLLECTION_ID$SEQ", 8);
		UsrCollectionTranslation collectionTranslation = new UsrCollectionTranslation();
		BeanUtils.copyProperties(collectionTranslation, userInfoRequest);
		collectionTranslation.setCollectionId(collectId);
		return ycUserCollectionSV.insertCollectionInfo(collectionTranslation);
	}

	@Override
	public UserCollectionInfoListResponse queryCollectionInfo(
			UserCollectionPageInfoRequest userInfoRequest) {
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
