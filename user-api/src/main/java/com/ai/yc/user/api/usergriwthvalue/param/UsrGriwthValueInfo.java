package com.ai.yc.user.api.usergriwthvalue.param;

import java.sql.Timestamp;

public class UsrGriwthValueInfo {
	/**
	 * 成长值记录主键ID
	 */
    private String recordId;
    /**
     * 用户Id
     */
    private String userId;
    /**
     * 成长值
     */
    private Integer griwthValue;
    /**
     * 成长来源
     */
    private String griwthResource;
    /**
     * 来源详情
     */
    private String resourceDetail;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 来源时间
     */
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