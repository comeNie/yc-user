package com.ai.yc.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UsrUserCriteria;
import com.ai.yc.user.dao.mapper.bo.UcUserCriteria;


public interface IYCRegisterAtomSV {
    // 用户
    public int insertUserInfo(UsrUser user);

    public List<UsrUser> getUserInfo(UcUserCriteria criteria);

    int updateUserInfo(@Param("record") UsrUser record,
            @Param("example") UsrUserCriteria example);

    public UsrUser getUserInfo(String userId);


}
