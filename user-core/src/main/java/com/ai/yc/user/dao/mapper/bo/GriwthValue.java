package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;

public class GriwthValue extends GriwthValueKey {
    private Timestamp createTime;

    private Integer griwthValue;

    private String griwthResource;

    private String resourceDetail;

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
}