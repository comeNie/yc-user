package com.ai.slp.user.api.favorite.param;

import java.util.List;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 用户收藏信息更新入参 Date: 2016年4月27日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class UpdateFavoriteRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * userID NOT NULL
     */

    private Long userId;

    /**
     * favoriteList
     */
    private List<String> favoriteList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<String> getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(List<String> favoriteList) {
        this.favoriteList = favoriteList;
    }

}
