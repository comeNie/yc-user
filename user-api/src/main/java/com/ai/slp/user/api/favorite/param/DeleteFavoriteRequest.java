package com.ai.slp.user.api.favorite.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.favorite.interfaces.IUserFavoriteSV;

/**
 * 删除收藏记录入参 Date: 2016年4月25日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class DeleteFavoriteRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 删除收藏ID NOT NULL
     */
    @NotNull(message = "收藏Id不能为空", groups = { IUserFavoriteSV.DeleteFavorite.class })
    private String favoriteReqId;

    /**
     * 用户ID NUT NULL
     */
    @NotNull(message = "用户Id不能为空", groups = { IUserFavoriteSV.DeleteFavorite.class })
    private Integer userId;

    public String getFavoriteReqId() {
        return favoriteReqId;
    }

    public void setFavoriteReqId(String favoriteReqId) {
        this.favoriteReqId = favoriteReqId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
