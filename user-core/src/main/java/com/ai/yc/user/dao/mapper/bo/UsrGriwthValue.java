package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;

public class UsrGriwthValue {
    private String recordId;

    private String userId;

    private Integer griwthValue;

    private String griwthResource;

    private String resourceDetail;

    private Timestamp createTime;

    private Timestamp resourceTime;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getGriwthValue() {
        return griwthValue;
    }

    public void setGriwthValue(Integer griwthValue) {
        this.griwthValue = griwthValue;
    }

    public String getGriwthResource() {
        return griwthResource;
    }

    public void setGriwthResource(String griwthResource) {
        this.griwthResource = griwthResource == null ? null : griwthResource.trim();
    }

    public String getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(String resourceDetail) {
        this.resourceDetail = resourceDetail == null ? null : resourceDetail.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getResourceTime() {
        return resourceTime;
    }

    public void setResourceTime(Timestamp resourceTime) {
        this.resourceTime = resourceTime;
    }
}