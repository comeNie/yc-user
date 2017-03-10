package com.ai.yc.user.api.usercompanyrelation.param;

import java.sql.Timestamp;

public class UsrCompanyRelationRequest {
	/**
	 * 主键Id
	 */
    private String relationId;
    /**
     * 公司编号
     */
    private String companyId;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 是否是管理员
     */
    private Integer isManagement;
    /**
     * 加入时间
     */
    private Timestamp joinTime;
    /**
     * 状态
     */
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