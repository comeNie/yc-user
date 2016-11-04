package com.ai.yc.user.api.userservice.impl;

import java.lang.reflect.Field;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.user.api.userservice.interfaces.IYCUserServiceSV;
import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.SearchYCContactRequest;
import com.ai.yc.user.api.userservice.param.SearchYCTranslatorRequest;
import com.ai.yc.user.api.userservice.param.SearchYCUserRequest;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.api.userservice.param.YCContactInfoResponse;
import com.ai.yc.user.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.user.api.userservice.param.YCTranslatorInfoResponse;
import com.ai.yc.user.api.userservice.param.YCUpdateUserResponse;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrTranslator;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.service.business.interfaces.IYCUserServiceBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service(validation = "true")
@Component
public class YCUserServiceSVImpl implements IYCUserServiceSV {

	private static final Logger LOGGER = LoggerFactory.getLogger(YCUserServiceSVImpl.class);
    @Autowired
    public IYCUserServiceBusiSV ycUsrServiceBusiSv;

	@Override
	public YCInsertUserResponse insertYCUser(InsertYCUserRequest insertInfo){
		ResponseHeader responseHeader = null;
		YCInsertUserResponse response = new YCInsertUserResponse();
		String userId = "";
		try{
			userId = ycUsrServiceBusiSv.insertUserInfo(insertInfo);
			responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"插入成功");
		}catch(Exception e){
			LOGGER.error("插入失败",e);
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,"插入失败");
		}
		response.setUserId(userId);
		response.setResponseHeader(responseHeader);
        return response;
	}

	@Override
	public YCUpdateUserResponse updateYCUserInfo(UpdateYCUserRequest updateUserParams){
		ResponseHeader responseHeader = null;
		YCUpdateUserResponse response = new YCUpdateUserResponse();
		try{
			ycUsrServiceBusiSv.updateUserInfo(updateUserParams);
		}catch(Exception e){
			LOGGER.error("修改失败",e);
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,"修改失败");
		}
		response.setResponseHeader(responseHeader);
		response.setResponseCode(ExceptCodeConstants.SUCCESS);
        return response;
	}

	

	@Override
	public YCUserInfoResponse searchYCUserInfo(SearchYCUserRequest userId){
		UsrUser usrUser = ycUsrServiceBusiSv.searchUserInfo(userId.getUserId());
//		YCUserInfoResponse result = GetUsrInfoByUsrUser(usrUser);
		YCUserInfoResponse result = new YCUserInfoResponse();
		BeanUtils.copyProperties(result, usrUser);
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "更新成功");
		result.setResponseHeader(responseHeader);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
        return result;
	}
	

	@Override
	public YCTranslatorInfoResponse searchYCTranslatorInfo(SearchYCTranslatorRequest tUsrId) {
		UsrTranslator usrTranslator = ycUsrServiceBusiSv.searchYCUsrTranslatorInfo(tUsrId.getUserId());
		YCTranslatorInfoResponse result = new YCTranslatorInfoResponse();
		BeanUtils.copyProperties(result, usrTranslator);
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "更新成功");
		result.setResponseHeader(responseHeader);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
		return result;
	}

	@Override
	public YCContactInfoResponse searchYCContactInfo(SearchYCContactRequest cUsrId) {
		UsrContact usrContact = ycUsrServiceBusiSv.searchUsrContactInfo(cUsrId.getUserId());
		YCContactInfoResponse result = new YCContactInfoResponse();
		BeanUtils.copyProperties(result, usrContact);
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "更新成功");
		result.setResponseHeader(responseHeader);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
		return result;
	}

}
