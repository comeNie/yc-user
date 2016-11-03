package com.ai.yc.user.service.business.interfaces;


import com.ai.yc.user.api.register.param.InsertYCUserRequest;
import com.ai.yc.user.dao.mapper.bo.UsrUser;

public interface IYCRegisterBusiSV {
    
    public String insertUserInfo(InsertYCUserRequest user);
    
    public boolean checkUserExist(String userID);
    
    public boolean updateUserInfo(UsrUser user);

    public UsrUser searchUserInfo(String userID);
}
