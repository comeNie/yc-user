package com.ai.slp.user.api.login.param;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.opt.validator.constraints.MobilePhone;
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
     * 用户类型 不能为空
     */
    @NotNull(message = "用户类型不能为空", groups = { ILoginSV.Login.class })
    private String userType;

    /**
     * 用户登陆用户名
     */
    private String userLoginName;

    /**
     * 用户邮箱
     */
    @Email(message = "邮箱格式不正确", groups = { ILoginSV.Login.class })
    private String userEmail;

    /**
     * 用户手机号
     */
    @MobilePhone(message = "手机号码格式不正确", groups = { ILoginSV.Login.class })
    private String userMp;

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
