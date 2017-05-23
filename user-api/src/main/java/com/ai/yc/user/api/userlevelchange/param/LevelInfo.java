package com.ai.yc.user.api.userlevelchange.param;

import java.sql.Timestamp;

/**
 * Created by liquid on 17/5/23.
 */
public class LevelInfo {
    private String id;

    private String userId;

    /**
     * 级别  1:普通会员 2:VIP会员 3:SVIP会员  4:SVIP白金会员
     */
    private String level;

    /**
     * 用户当前的成长值
     */
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
