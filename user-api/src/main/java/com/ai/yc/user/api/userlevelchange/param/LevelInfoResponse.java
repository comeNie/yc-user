package com.ai.yc.user.api.userlevelchange.param;


import com.ai.opt.base.vo.BaseResponse;

import java.sql.Timestamp;

public class LevelInfoResponse extends BaseResponse{
    private String id;

    private String userId;

    private String level;

    private Long griwthValue;

    private Timestamp updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Long getGriwthValue() {
        return griwthValue;
    }

    public void setGriwthValue(Long griwthValue) {
        this.griwthValue = griwthValue;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}