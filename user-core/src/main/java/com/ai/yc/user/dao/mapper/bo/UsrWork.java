package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;

public class UsrWork {
    private Long workId;

    private String translatorId;

    private String company;

    private String position;

    private String workStartTime;

    private String workEndTime;

    private String workSummarize;

    private Timestamp createTime;

    public Long getWorkId() {
        return workId;
    }

    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    public String getTranslatorId() {
        return translatorId;
    }

    public void setTranslatorId(String translatorId) {
        this.translatorId = translatorId == null ? null : translatorId.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getWorkStartTime() {
        return workStartTime;
    }

    public void setWorkStartTime(String workStartTime) {
        this.workStartTime = workStartTime == null ? null : workStartTime.trim();
    }

    public String getWorkEndTime() {
        return workEndTime;
    }

    public void setWorkEndTime(String workEndTime) {
        this.workEndTime = workEndTime == null ? null : workEndTime.trim();
    }

    public String getWorkSummarize() {
        return workSummarize;
    }

    public void setWorkSummarize(String workSummarize) {
        this.workSummarize = workSummarize == null ? null : workSummarize.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}