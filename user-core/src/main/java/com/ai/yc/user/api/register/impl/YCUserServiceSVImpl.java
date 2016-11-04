package com.ai.yc.user.api.register.impl;

import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.vo.ResponseHeader;
import com.ai.yc.user.api.register.interfaces.IYCUserServiceSV;
import com.ai.yc.user.api.register.param.InsertYCUserRequest;
import com.ai.yc.user.api.register.param.SearchYCContactUserId;
import com.ai.yc.user.api.register.param.SearchYCTranslatorUserId;
import com.ai.yc.user.api.register.param.SearchYCUserParams;
import com.ai.yc.user.api.register.param.UpdateYCUserParams;
import com.ai.yc.user.api.register.param.YCContactInfo;
import com.ai.yc.user.api.register.param.YCInsertUserResponse;
import com.ai.yc.user.api.register.param.YCTranslatorInfo;
import com.ai.yc.user.api.register.param.YCUpdateUserResponse;
import com.ai.yc.user.api.register.param.YCUserInfo;
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
	public YCInsertUserResponse insertYCUser(InsertYCUserRequest insertInfo){
		System.out.println("$$$$$$$$$$$"+insertInfo);
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
	public YCUserInfo searchYCUserInfo(SearchYCUserParams userId){
		UsrUser usrUser = ycRegisterBusiSv.searchUserInfo(userId.getUserId());
		YCUserInfo result = GetUsrInfoByUsrUser(usrUser);
		
		ResponseHeader responseHeader = new ResponseHeader(true, "1", "更新成功");
		result.setResponseHeader(responseHeader);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
        return result;
	}
	

	@Override
	public YCTranslatorInfo searchYCTranslatorInfoById(SearchYCTranslatorUserId tUsrId) {
		return null;
	}

	@Override
	public YCContactInfo searchYCContactInfoById(SearchYCContactUserId cUsrId) {
//		UsrUser usrUser = ycRegisterBusiSv.(cUsrId.getUserId());
//		YCUserInfo result = GetUsrInfoByUsrUser(usrUser);
//		
//		ResponseHeader responseHeader = new ResponseHeader(true, "1", "更新成功");
//		result.setResponseHeader(responseHeader);
//        result.setResponseCode(ExceptCodeConstants.SUCCESS);
        return null;
	}
    
	public YCUserInfo GetUsrInfoByUsrUser(UsrUser userparam) {
		try{
			Class<?> usrUserClass = Class.forName(YCUserInfo.class.getName());
			Object usrUserObj = usrUserClass.newInstance();
			Object insertInfoObj = userparam;
			Field[] usrFields = YCUserInfo.class.getDeclaredFields();
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
			YCUserInfo usrInfo = (YCUserInfo) usrUserObj;
			return usrInfo;
		} catch ( InstantiationException| IllegalAccessException| ClassNotFoundException  e){
			e.printStackTrace();
		}
		return null;
	}

}
