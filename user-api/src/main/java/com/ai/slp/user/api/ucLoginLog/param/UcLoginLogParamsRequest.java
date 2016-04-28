package com.ai.slp.user.api.ucLoginLog.param;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ai.slp.user.api.ucStateChg.interfaces.IUcStateChgSV;

public class UcLoginLogParamsRequest {

    /**
     * 租户ID
     */
    @NotNull(message="租户ID不能为空",groups={IUcStateChgSV.InsertUcStateChgInfo.class,IUcStateChgSV.UpdateUcStateChgInfo.class})
    @Size(max=32,groups={IUcStateChgSV.InsertUcStateChgInfo.class,IUcStateChgSV.UpdateUcStateChgInfo.class})
    private String tenantId;
    
    /**
     * 用户ID
     */
    @NotNull(message="用户ID不能为空",groups={IUcStateChgSV.InsertUcStateChgInfo.class,IUcStateChgSV.UpdateUcStateChgInfo.class})
    @Size(max=18,groups={IUcStateChgSV.InsertUcStateChgInfo.class,IUcStateChgSV.UpdateUcStateChgInfo.class})
    private int userId;
    
    /**
     * 登录流水号
     */
    private String loginSeqId;
    
    /**
     * 系统登录时间
     */
    private Date loginTime;
    
    /**
     * 登录IP归属省
     */
    private String loginProvice;
    
    /**
     * 登录IP归属地市
     */
    
    private String loginCity;
    
    /**
     * 用户登录IP地址
     */
    
    private String loginIpAdd;
    
    /**
     * 登录手机号归属省
     */
    private String phoneProvice;
    
    /**
     * 登录手机号归属地市
     */
    private String phoneCity;
    
    /**
     * 登录用户的手机号码
     */
    private String loginMp;
    
    /**
     * 用户手机品牌
     */
    private String userPhone;
    
    /**
     * 用户手机型号
     */
    private String userPhoneType;
    
    /**
     * 手机IMEI
     */
    private String userPhoneImei;
    
    /**
     * 手机定位省
     */
    private String provice;
    
    /**
     * 手机定位地市
     */
    private String city;
    
    /**
     * 用户登录渠道
     */
    private String loginChl;
    
    /**
     * 用户登录方式
     */
    private String loginWay;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginSeqId() {
        return loginSeqId;
    }

    public void setLoginSeqId(String loginSeqId) {
        this.loginSeqId = loginSeqId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginProvice() {
        return loginProvice;
    }

    public void setLoginProvice(String loginProvice) {
        this.loginProvice = loginProvice;
    }

    public String getLoginCity() {
        return loginCity;
    }

    public void setLoginCity(String loginCity) {
        this.loginCity = loginCity;
    }

    public String getLoginIpAdd() {
        return loginIpAdd;
    }

    public void setLoginIpAdd(String loginIpAdd) {
        this.loginIpAdd = loginIpAdd;
    }

    public String getPhoneProvice() {
        return phoneProvice;
    }

    public void setPhoneProvice(String phoneProvice) {
        this.phoneProvice = phoneProvice;
    }

    public String getPhoneCity() {
        return phoneCity;
    }

    public void setPhoneCity(String phoneCity) {
        this.phoneCity = phoneCity;
    }

    public String getLoginMp() {
        return loginMp;
    }

    public void setLoginMp(String loginMp) {
        this.loginMp = loginMp;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPhoneType() {
        return userPhoneType;
    }

    public void setUserPhoneType(String userPhoneType) {
        this.userPhoneType = userPhoneType;
    }

    public String getUserPhoneImei() {
        return userPhoneImei;
    }

    public void setUserPhoneImei(String userPhoneImei) {
        this.userPhoneImei = userPhoneImei;
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLoginChl() {
        return loginChl;
    }

    public void setLoginChl(String loginChl) {
        this.loginChl = loginChl;
    }

    public String getLoginWay() {
        return loginWay;
    }

    public void setLoginWay(String loginWay) {
        this.loginWay = loginWay;
    }
    
    
}
