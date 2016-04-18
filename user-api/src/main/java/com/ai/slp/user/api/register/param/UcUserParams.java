package com.ai.slp.user.api.register.param;

import java.io.Serializable;

/**
 * 用户信息 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhaogw
 */
public class UcUserParams implements Serializable {

    private String tenantId;
    private Integer userId;
    private String userType;
    private String userFlag;
    private String userState;
    private String vipLevel;
    private String safetyLevel;
    private String userLoginName;
    private String userLoginPwd;
    private String pwdSafetyLevel;
    private String userMp;
    private String userEmail;
    private String emailValidateFlag;
    private String userNickname;
    private String ortraitFileId;
    private String provinceCode;
    private String cityCode;
    private String registerWay;
    
    
    
    public UcUserParams(String tenantId, Integer userId, String cityCode, String registerWay) {
        super();
        this.tenantId = tenantId;
        this.userId = userId;
        this.cityCode = cityCode;
        this.registerWay = registerWay;
    }
    public UcUserParams(String tenantId, Integer userId, String userType, String userFlag,
            String userState, String vipLevel, String safetyLevel, String userLoginName,
            String userLoginPwd, String pwdSafetyLevel, String userMp, String userEmail,
            String emailValidateFlag, String userNickname, String ortraitFileId,
            String provinceCode, String cityCode, String registerWay) {
        super();
        this.tenantId = tenantId;
        this.userId = userId;
        this.userType = userType;
        this.userFlag = userFlag;
        this.userState = userState;
        this.vipLevel = vipLevel;
        this.safetyLevel = safetyLevel;
        this.userLoginName = userLoginName;
        this.userLoginPwd = userLoginPwd;
        this.pwdSafetyLevel = pwdSafetyLevel;
        this.userMp = userMp;
        this.userEmail = userEmail;
        this.emailValidateFlag = emailValidateFlag;
        this.userNickname = userNickname;
        this.ortraitFileId = ortraitFileId;
        this.provinceCode = provinceCode;
        this.cityCode = cityCode;
        this.registerWay = registerWay;
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public String getUserFlag() {
        return userFlag;
    }
    public void setUserFlag(String userFlag) {
        this.userFlag = userFlag;
    }
    public String getUserState() {
        return userState;
    }
    public void setUserState(String userState) {
        this.userState = userState;
    }
    public String getVipLevel() {
        return vipLevel;
    }
    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }
    public String getSafetyLevel() {
        return safetyLevel;
    }
    public void setSafetyLevel(String safetyLevel) {
        this.safetyLevel = safetyLevel;
    }
    public String getUserLoginName() {
        return userLoginName;
    }
    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }
    public String getUserLoginPwd() {
        return userLoginPwd;
    }
    public void setUserLoginPwd(String userLoginPwd) {
        this.userLoginPwd = userLoginPwd;
    }
    public String getPwdSafetyLevel() {
        return pwdSafetyLevel;
    }
    public void setPwdSafetyLevel(String pwdSafetyLevel) {
        this.pwdSafetyLevel = pwdSafetyLevel;
    }
    public String getUserMp() {
        return userMp;
    }
    public void setUserMp(String userMp) {
        this.userMp = userMp;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getEmailValidateFlag() {
        return emailValidateFlag;
    }
    public void setEmailValidateFlag(String emailValidateFlag) {
        this.emailValidateFlag = emailValidateFlag;
    }
    public String getUserNickname() {
        return userNickname;
    }
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }
    public String getOrtraitFileId() {
        return ortraitFileId;
    }
    public void setOrtraitFileId(String ortraitFileId) {
        this.ortraitFileId = ortraitFileId;
    }
    public String getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
    public String getCityCode() {
        return cityCode;
    }
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
    public String getRegisterWay() {
        return registerWay;
    }
    public void setRegisterWay(String registerWay) {
        this.registerWay = registerWay;
    }
    
    
}
