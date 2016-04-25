package com.ai.slp.user.api.favorite.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.favorite.interfaces.IUserFavoriteSV;

/**
 * 用户收藏信息查询入参 Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class UserFavoriteRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 收藏ID NOT NULL
     */
    @NotNull(message = "收藏Id不能为空", groups = { IUserFavoriteSV.QueryFavorite.class })
    private String favoriteSeqId;

    /**
     * 用户ID NOT NULL
     */
    @NotNull(message = "用户Id不能为空", groups = { IUserFavoriteSV.QueryFavorite.class })
    private Integer userId;

    /**
     * 分页信息
     */
    private Integer pageNo;

    private Integer pageSize;

    public String getFavoriteSeqId() {
        return favoriteSeqId;
    }

    public void setFavoriteSeqId(String favoriteSeqId) {
        this.favoriteSeqId = favoriteSeqId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
