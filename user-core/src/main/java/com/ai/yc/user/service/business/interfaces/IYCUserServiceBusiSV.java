package com.ai.yc.user.service.business.interfaces;


import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrTranslator;
import com.ai.yc.user.dao.mapper.bo.UsrUser;

public interface IYCUserServiceBusiSV {
    
    public String insertUserInfo(InsertYCUserRequest user);
    
    public int updateUserInfo(UpdateYCUserRequest updateUserParams);

    public UsrUser searchUserInfo(String userID);

	public UsrTranslator searchYCUsrTranslatorInfo(String userId);

	public UsrContact searchUsrContactInfo(String userId);
	
	public UsrUser searchuserInfoByNickName(String userId);
}
