package com.ai.yc.user.service.business.interfaces;


import com.ai.yc.user.api.register.param.InsertYCUserRequest;
import com.ai.yc.user.api.register.param.UpdateYCUserParams;
import com.ai.yc.user.dao.mapper.bo.UsrUser;

public interface IYCUserServiceBusiSV {
    
    public String insertUserInfo(InsertYCUserRequest user);
    
    public boolean updateUserInfo(UpdateYCUserParams updateUserParams);

    public UsrUser searchUserInfo(String userID);
}
