package com.ai.slp.user.api.favorite.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.favorite.interfaces.IUserFavoriteSV;

/**
 * 创建用户收藏信息参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class InsertUserFavoriteRequest extends BaseInfo {
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID NOT NULL
     */
    @NotNull(message = "用户Id不能为空", groups = { IUserFavoriteSV.InsertUcFavorite.class })
    private Long userId;

    /**
     * 收藏ID
     */
    private String favoriteSeqId;
    
    /**
     * 收藏关系ID NOT NULL
     */
    @NotNull(message = "收藏关系ID不能为空", groups = { IUserFavoriteSV.InsertUcFavorite.class })
    private String favoriteRelId;

    /**
     * 收藏类型
     */
    @NotNull(message = "收藏类型不能为空", groups = { IUserFavoriteSV.InsertUcFavorite.class })
    private String favoriteType;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFavoriteRelId() {
        return favoriteRelId;
    }

    public void setFavoriteRelId(String favoriteRelId) {
        this.favoriteRelId = favoriteRelId;
    }

    public String getFavoriteType() {
        return favoriteType;
    }

    public void setFavoriteType(String favoriteType) {
        this.favoriteType = favoriteType;
    }

    public String getFavoriteSeqId() {
        return favoriteSeqId;
    }

    public void setFavoriteReqId(String favoriteSeqId) {
        this.favoriteSeqId = favoriteSeqId;
    }

}
