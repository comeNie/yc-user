package com.ai.yc.user.service.business.interfaces;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoRequest;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoResponse;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslation;

public interface IYCUserCollectionBusiSV {
	public BaseResponse insertCollectionInfo(UsrCollectionTranslation contactInfo);
	public BaseResponse updateCollectionInfo(UsrCollectionTranslation contactInfo);
	public BaseResponse deleteCollectionInfo(UserCollectionInfoRequest userInfoRequest);
	public UserCollectionInfoResponse queryCollectionInfo(UserCollectionInfoRequest userInfoRequest);
}
