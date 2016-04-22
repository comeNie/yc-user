package com.ai.slp.user.dao.mapper.bo;

import java.sql.Timestamp;

public class UcUserAgree {
    private String tenantId;

    private String agreeSeqId;

    private Long userId;

    private String agreementId;

    private Timestamp subsTime;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getAgreeSeqId() {
        return agreeSeqId;
    }

    public void setAgreeSeqId(String agreeSeqId) {
        this.agreeSeqId = agreeSeqId == null ? null : agreeSeqId.trim();
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
        this.agreementId = agreementId == null ? null : agreementId.trim();
    }

    public Timestamp getSubsTime() {
        return subsTime;
    }

    public void setSubsTime(Timestamp subsTime) {
        this.subsTime = subsTime;
    }
}