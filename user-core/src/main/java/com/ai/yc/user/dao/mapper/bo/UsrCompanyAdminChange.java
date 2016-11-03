package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;

public class UsrCompanyAdminChange {
    private String adminChangeId;

    private String custId;

    private String sourceAdminId;

    private String sourceAdminName;

    private String targetAdminId;

    private String targetAdminName;

    private Integer isAccess;

    private Timestamp createTime;

    private Timestamp accessRejectTime;

    private String custName;

    public String getAdminChangeId() {
        return adminChangeId;
    }

    public void setAdminChangeId(String adminChangeId) {
        this.adminChangeId = adminChangeId == null ? null : adminChangeId.trim();
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getSourceAdminId() {
        return sourceAdminId;
    }

    public void setSourceAdminId(String sourceAdminId) {
        this.sourceAdminId = sourceAdminId == null ? null : sourceAdminId.trim();
    }

    public String getSourceAdminName() {
        return sourceAdminName;
    }

    public void setSourceAdminName(String sourceAdminName) {
        this.sourceAdminName = sourceAdminName == null ? null : sourceAdminName.trim();
    }

    public String getTargetAdminId() {
        return targetAdminId;
    }

    public void setTargetAdminId(String targetAdminId) {
        this.targetAdminId = targetAdminId == null ? null : targetAdminId.trim();
    }

    public String getTargetAdminName() {
        return targetAdminName;
    }

    public void setTargetAdminName(String targetAdminName) {
        this.targetAdminName = targetAdminName == null ? null : targetAdminName.trim();
    }

    public Integer getIsAccess() {
        return isAccess;
    }

    public void setIsAccess(Integer isAccess) {
        this.isAccess = isAccess;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getAccessRejectTime() {
        return accessRejectTime;
    }

    public void setAccessRejectTime(Timestamp accessRejectTime) {
        this.accessRejectTime = accessRejectTime;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }
}