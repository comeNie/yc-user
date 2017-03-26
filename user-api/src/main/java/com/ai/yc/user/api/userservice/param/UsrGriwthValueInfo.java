package com.ai.yc.user.api.userservice.param;

import java.io.Serializable;
import java.util.Date;

public class UsrGriwthValueInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8681624669806820609L;
	private String recordId;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 成长值
     */
    private Integer griwthValue;
    /**
     * 成长值来源
     */
    private String griwthResource;
    /**
     * 成长值来源详情
     */
    private String resourceDetail;
    
    private Date createTime;
    /**
     * 创建时间
     */
    private Date resourceTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getResourceTime() {
        return resourceTime;
    }

    public void setResourceTime(Date resourceTime) {
        this.resourceTime = resourceTime;
    }
}