package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;

public class UsrContributionValue {
    private String recordId;

    private String translatorId;

    private String contribution;

    private String contributionResource;

    private String resourceDetail;

    private Timestamp createTime;

    private Timestamp resourceTime;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getTranslatorId() {
        return translatorId;
    }

    public void setTranslatorId(String translatorId) {
        this.translatorId = translatorId == null ? null : translatorId.trim();
    }

    public String getContribution() {
        return contribution;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution == null ? null : contribution.trim();
    }

    public String getContributionResource() {
        return contributionResource;
    }

    public void setContributionResource(String contributionResource) {
        this.contributionResource = contributionResource == null ? null : contributionResource.trim();
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