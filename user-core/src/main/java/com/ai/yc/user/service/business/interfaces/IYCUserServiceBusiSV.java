package com.ai.yc.user.service.business.interfaces;


import com.ai.yc.user.api.userservice.param.InsertYCUserParams;
import com.ai.yc.user.api.userservice.param.UpdateYCUserParams;
import com.ai.yc.user.dao.mapper.bo.UsrUser;

public interface IYCUserServiceBusiSV {
    
    public String insertUserInfo(InsertYCUserParams user);
    
    public boolean updateUserInfo(UpdateYCUserParams updateUserParams);

    public UsrUser searchUserInfo(String userID);
}
