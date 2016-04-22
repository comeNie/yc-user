package com.ai.slp.user.api.login.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.login.interfaces.ILoginSV;

/**
 * 登录服务入参 Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class LoginRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户类型 NOT NULL
     */
    @NotNull(message = "用户类型不能为空", groups = { ILoginSV.Login.class })
    private String userType;

    /**
     * 用户登陆用户名
     */
    private String UserLoginName;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户手机号
     */
    private String userMp;

    /**
     * 用户密码
     */
    @NotNull(message = "密码不能为空", groups = { ILoginSV.Login.class })
    private String userLoginPwd;

    public String getUserLoginName() {
        return UserLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        UserLoginName = userLoginName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMp() {
        return userMp;
    }

    public void setUserMp(String userMp) {
        this.userMp = userMp;
    }

    public String getUserLoginPwd() {
        return userLoginPwd;
    }

    public void setUserLoginPwd(String userLoginPwd) {
        this.userLoginPwd = userLoginPwd;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
