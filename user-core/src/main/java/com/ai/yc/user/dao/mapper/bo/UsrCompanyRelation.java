package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;

public class UsrCompanyRelation {
    private String relationId;

    private String companyId;

    private String userId;

    private Integer isManagement;

    private Timestamp joinTime;

    private String status;

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId == null ? null : relationId.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getIsManagement() {
        return isManagement;
    }

    public void setIsManagement(Integer isManagement) {
        this.isManagement = isManagement;
    }

    public Timestamp getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Timestamp joinTime) {
        this.joinTime = joinTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}