package com.ai.yc.user.api.register.impl;

import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.vo.ResponseHeader;
import com.ai.yc.user.api.userservice.interfaces.IYCUserServiceSV;
import com.ai.yc.user.api.userservice.param.InsertYCUserParams;
import com.ai.yc.user.api.userservice.param.SearchYCContactParams;
import com.ai.yc.user.api.userservice.param.SearchYCTranslatorParams;
import com.ai.yc.user.api.userservice.param.SearchYCUserParams;
import com.ai.yc.user.api.userservice.param.UpdateYCUserParams;
import com.ai.yc.user.api.userservice.param.YCContactInfoResponse;
import com.ai.yc.user.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.user.api.userservice.param.YCTranslatorInfoResponse;
import com.ai.yc.user.api.userservice.param.YCUpdateUserResponse;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.service.business.interfaces.IYCUserServiceBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service(validation = "true")
@Component
public class YCUserServiceSVImpl implements IYCUserServiceSV {

    @Autowired
    public IYCUserServiceBusiSV ycRegisterBusiSv;

	@Override
	public YCInsertUserResponse insertYCUser(InsertYCUserParams insertInfo){
		insertInfo.setMobilePhone(insertInfo.getMobilePhone());
		String userId = ycRegisterBusiSv.insertUserInfo(insertInfo);
		YCInsertUserResponse result = new YCInsertUserResponse();
		ResponseHeader responseHeader = new ResponseHeader(true, "1", "更新成功");
		result.setResponseHeader(responseHeader);
        result.setUserId(userId);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
        return result;
	}

	@Override
	public YCUpdateUserResponse updateYCUserInfo(UpdateYCUserParams updateUserParams){
		boolean flag = ycRegisterBusiSv.updateUserInfo(updateUserParams);
		YCUpdateUserResponse result = new YCUpdateUserResponse();
		ResponseHeader responseHeader = new ResponseHeader(true, "1", "更新成功");
		result.setResponseHeader(responseHeader);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
        return result;
	}

	@Override
	public YCUserInfoResponse searchYCUserInfo(SearchYCUserParams userId){
		UsrUser usrUser = ycRegisterBusiSv.searchUserInfo(userId.getUserId());
		YCUserInfoResponse result = GetUsrInfoByUsrUser(usrUser);
		
		ResponseHeader responseHeader = new ResponseHeader(true, "1", "更新成功");
		result.setResponseHeader(responseHeader);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
        return result;
	}
	

	@Override
	public YCTranslatorInfoResponse searchYCTranslatorInfoById(SearchYCTranslatorParams tUsrId) {
		return null;
	}

	@Override
	public YCContactInfoResponse searchYCContactInfoById(SearchYCContactParams cUsrId) {
//		UsrUser usrUser = ycRegisterBusiSv.(cUsrId.getUserId());
//		YCUserInfo result = GetUsrInfoByUsrUser(usrUser);
//		
//		ResponseHeader responseHeader = new ResponseHeader(true, "1", "更新成功");
//		result.setResponseHeader(responseHeader);
//        result.setResponseCode(ExceptCodeConstants.SUCCESS);
        return null;
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

}
