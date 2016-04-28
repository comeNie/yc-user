package com.ai.slp.user.api.register.param;

import java.io.Serializable;
import java.sql.Timestamp;

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
public class UcUserAgreeParams implements Serializable {

    
    @NotNull(message="租户id不能为空",groups={IRegisterSV.InsertUcUser.class})
    private String tenantId;

    private String agreeSeqId;

    private Long userId;

    private String agreementId;

    private Timestamp subsTime;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getAgreeSeqId() {
        return agreeSeqId;
    }

    public void setAgreeSeqId(String agreeSeqId) {
        this.agreeSeqId = agreeSeqId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public Timestamp getSubsTime() {
        return subsTime;
    }

    public void setSubsTime(Timestamp subsTime) {
        this.subsTime = subsTime;
    }
    
    
    
    
}
