package com.ai.yc.user.service.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoRequest;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoResponse;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslation;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslationCriteria;
import com.ai.yc.user.service.atom.interfaces.IYCUserCollectionAtomSV;
import com.ai.yc.user.service.business.interfaces.IYCUserCollectionBusiSV;

@Service
@Transactional
public class YCuserCollectionBusiSVImpl implements IYCUserCollectionBusiSV{

	@Autowired
	private IYCUserCollectionAtomSV ycUSCollectionAtomSV;
	
	@Override
	public BaseResponse insertCollectionInfo(
			UsrCollectionTranslation contactInfo) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			ycUSCollectionAtomSV.insertCollectionInfo(contactInfo);
			header = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "收藏信息成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false, ExceptCodeConstants.Special.SYSTEM_ERROR, "收藏信息失败");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public BaseResponse updateCollectionInfo(
			UsrCollectionTranslation contactInfo) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			ycUSCollectionAtomSV.updateCollectionInfo(contactInfo);
			header = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "更新收藏信息成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false, ExceptCodeConstants.Special.SYSTEM_ERROR, "更新收藏信息失败");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public BaseResponse deleteCollectionInfo(UserCollectionInfoRequest userInfoRequest) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			UsrCollectionTranslationCriteria example = new UsrCollectionTranslationCriteria();
			UsrCollectionTranslationCriteria.Criteria criteria = example.createCriteria();
			if(StringUtil.isBlank(userInfoRequest.getUserId())){
				throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户Id不能为空");
			}
			if(StringUtil.isBlank(userInfoRequest.getCollectionId())){
				throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "译文Id不能为空");
			}
			criteria.andUserIdEqualTo(userInfoRequest.getUserId());
			criteria.andCollectionIdIn(userInfoRequest.getCollectionIds());
			ycUSCollectionAtomSV.deleteCollectionInfo(example);
			header = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "删除收藏信息成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false, ExceptCodeConstants.Special.SYSTEM_ERROR, "删除收藏信息失败");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public UserCollectionInfoResponse queryCollectionInfo(UserCollectionInfoRequest userInfoRequest) {
		UserCollectionInfoResponse response = new UserCollectionInfoResponse();
		ResponseHeader header = null;
		try{
			UsrCollectionTranslationCriteria example = new UsrCollectionTranslationCriteria();
			UsrCollectionTranslationCriteria.Criteria criteria = example.createCriteria();
			if(!StringUtil.isBlank(userInfoRequest.getCollectionId())){
				criteria.andCollectionIdEqualTo(userInfoRequest.getCollectionId());
			}
			if(!StringUtil.isBlank(userInfoRequest.getTranslation())){
				criteria.andTranslationEqualTo(userInfoRequest.getTranslation().trim());
			}
			if(!StringUtil.isBlank(userInfoRequest.getOriginal())){
				criteria.andOriginalEqualTo(userInfoRequest.getOriginal().trim());
			}
			if(!StringUtil.isBlank(userInfoRequest.getSourceLanguage())){
				criteria.andSourceLanguageEqualTo(userInfoRequest.getSourceLanguage());
			}
			if(!StringUtil.isBlank(userInfoRequest.getTargetLanguage())){
				criteria.andTargetLanguageEqualTo(userInfoRequest.getTargetLanguage());
			}
			ycUSCollectionAtomSV.queryCollectionInfo(example);
			header = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "查询收藏信息成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false, ExceptCodeConstants.Special.SYSTEM_ERROR, "查询收藏信息失败");
		}
		response.setResponseHeader(header);
		return response;
	}

}
