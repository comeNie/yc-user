package com.ai.yc.user.api.userlevelchange.param;


import com.ai.opt.base.vo.BaseResponse;

import java.sql.Timestamp;
import java.util.List;

public class LevelInfoResponse extends BaseResponse{
    private List<LevelInfo> levelInfos;

    public List<LevelInfo> getLevelInfos() {
        return levelInfos;
    }

    public void setLevelInfos(List<LevelInfo> levelInfos) {
        this.levelInfos = levelInfos;
    }
}