package com.ai.yc.user.api.userservice.impl;

import java.lang.reflect.Field;

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

    @Autowired
    public IYCUserServiceBusiSV ycUsrServiceBusiSv;

	@Override
	public YCInsertUserResponse insertYCUser(InsertYCUserRequest insertInfo){
		if((null == insertInfo.getPhone() && null == insertInfo.getEmail()) || (null == insertInfo.getPassword())){
			YCInsertUserResponse result = new YCInsertUserResponse();
			ResponseHeader responseHeader = new ResponseHeader(false, "0", "创建失败");
			result.setResponseHeader(responseHeader);
	        result.setUserId("-1");
	        result.setResponseCode(ExceptCodeConstants.FAILD);
	        return result;
		}
		if(null == insertInfo.getMobilePhone())
		{insertInfo.setMobilePhone(insertInfo.getPhone());}
		String userId = ycUsrServiceBusiSv.insertUserInfo(insertInfo);
		
		if(userId == null){
			YCInsertUserResponse result = new YCInsertUserResponse();
			ResponseHeader responseHeader = new ResponseHeader(false, "0", "创建失败");
			result.setResponseHeader(responseHeader);
	        result.setUserId("-1");
	        result.setResponseCode(ExceptCodeConstants.FAILD);
	        return result;
		}
		
		YCInsertUserResponse result = new YCInsertUserResponse();
		ResponseHeader responseHeader = new ResponseHeader(true, "1", "更新成功");
		result.setResponseHeader(responseHeader);
        result.setUserId(userId);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
        return result;
	}

	@Override
	public YCUpdateUserResponse updateYCUserInfo(UpdateYCUserRequest updateUserParams){
		if(!CheckFields(updateUserParams)){
			YCUpdateUserResponse result = new YCUpdateUserResponse();
			ResponseHeader responseHeader = new ResponseHeader(false, "0", "更新失败");
			result.setResponseHeader(responseHeader);
	        result.setResponseCode(ExceptCodeConstants.FAILD);
	        return result;
		}
		
		boolean flag = ycUsrServiceBusiSv.updateUserInfo(updateUserParams);
		
		if(!flag){
			YCUpdateUserResponse result = new YCUpdateUserResponse();
			ResponseHeader responseHeader = new ResponseHeader(false, "0", "更新失败");
			result.setResponseHeader(responseHeader);
	        result.setResponseCode(ExceptCodeConstants.FAILD);
	        return result;
		}
		
		YCUpdateUserResponse result = new YCUpdateUserResponse();
		ResponseHeader responseHeader = new ResponseHeader(true, "1", "更新成功");
		result.setResponseHeader(responseHeader);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
        return result;
	}

	

	@Override
	public YCUserInfoResponse searchYCUserInfo(SearchYCUserRequest userId){
		UsrUser usrUser = ycUsrServiceBusiSv.searchUserInfo(userId.getUserId());
//		YCUserInfoResponse result = GetUsrInfoByUsrUser(usrUser);
		YCUserInfoResponse result = new YCUserInfoResponse();
		BeanUtils.copyProperties(result, usrUser);
		ResponseHeader responseHeader = new ResponseHeader(true, "1", "更新成功");
		result.setResponseHeader(responseHeader);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
        return result;
	}
	

	@Override
	public YCTranslatorInfoResponse searchYCTranslatorInfo(SearchYCTranslatorRequest tUsrId) {
		UsrTranslator usrTranslator = ycUsrServiceBusiSv.searchYCUsrTranslatorInfo(tUsrId.getUserId());
		YCTranslatorInfoResponse result = new YCTranslatorInfoResponse();
		BeanUtils.copyProperties(result, usrTranslator);
		ResponseHeader responseHeader = new ResponseHeader(true, "1", "更新成功");
		result.setResponseHeader(responseHeader);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
		return result;
	}

	@Override
	public YCContactInfoResponse searchYCContactInfo(SearchYCContactRequest cUsrId) {
		UsrContact usrContact = ycUsrServiceBusiSv.searchUsrContactInfo(cUsrId.getUserId());
		YCContactInfoResponse result = new YCContactInfoResponse();
		BeanUtils.copyProperties(result, usrContact);
		ResponseHeader responseHeader = new ResponseHeader(true, "1", "更新成功");
		result.setResponseHeader(responseHeader);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
		return result;
//		return null;
	}
    
	
	
	
	public YCUserInfoResponse GetUsrInfoByUsrUser(UsrUser userparam) {
		try{
			Class<?> usrUserClass = Class.forName(YCUserInfoResponse.class.getName());
			Object usrUserObj = usrUserClass.newInstance();
			Object insertInfoObj = userparam;
			Field[] usrFields = YCUserInfoResponse.class.getDeclaredFields();
			Field[] insertfields = UsrUser.class.getDeclaredFields();
			for(int i = 0; i < insertfields.length; i++){
				for(int j = 0; j < usrFields.length; j++){
					if(insertfields[i].getName().equals(usrFields[j].getName())){
						usrFields[j].setAccessible(true);
						insertfields[i].setAccessible(true);
						if(usrFields[j].getGenericType() == insertfields[i].getGenericType())
							usrFields[j].set(usrUserObj, insertfields[i].get(insertInfoObj));
					}
				}
			}
			YCUserInfoResponse usrInfo = (YCUserInfoResponse) usrUserObj;
			return usrInfo;
		} catch ( InstantiationException| IllegalAccessException| ClassNotFoundException  e){
			e.printStackTrace();
		}
		return null;
	}

	private boolean CheckFields(UpdateYCUserRequest updateUserParams) {
		Field[] fields = updateUserParams.getClass().getFields();
		for(int i = 0; i < fields.length; i++){
			try {
				if(fields[i].get(updateUserParams) == null){
					return false;
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
}