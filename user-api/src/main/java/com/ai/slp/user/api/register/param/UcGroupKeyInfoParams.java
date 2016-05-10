package com.ai.slp.user.api.register.param;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ai.slp.user.api.register.interfaces.IRegisterSV;

/**
 * 用户信息 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhaogw
 */
public class UcGroupKeyInfoParams implements Serializable {

    @NotNull(message = "租户id不能为空", groups = { IRegisterSV.InsertUcUser.class })
    private String tenantId;

    private String userId;

    private String userType;

    private String cretNum;

    private String custName;

    private String provinceCode;

    private String cityCode;

    private String subsTime;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getCretNum() {
        return cretNum;
    }

    public void setCretNum(String cretNum) {
        this.cretNum = cretNum;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
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

    public String getSubsTime() {
        return subsTime;
    }

    public void setSubsTime(String subsTime) {
        this.subsTime = subsTime;
    }

}
