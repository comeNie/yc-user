package com.ai.slp.user.api.favorite.param;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.favorite.interfaces.IUserFavoriteSV;

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
    @NotNull(message = "用户ID不能为空", groups = { IUserFavoriteSV.CancelFavorite.class })
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
