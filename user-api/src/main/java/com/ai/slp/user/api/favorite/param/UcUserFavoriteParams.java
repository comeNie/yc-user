package com.ai.slp.user.api.favorite.param;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.favorite.interfaces.IUserFavoriteSV;

/**
 * 用户收藏信息表 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */

public class UcUserFavoriteParams extends BaseInfo {
    private static final long serialVersionUID = 1L;

    /**
     * 收藏ID NOT NULL
     */
    @NotNull(message = "收藏Id不能为空", groups = { IUserFavoriteSV.UpdateFavorite.class })
    private String favoriteSeqId;

    /**
     * 用户ID NOT NULL
     */
    @NotNull(message = "用户Id不能为空", groups = { IUserFavoriteSV.UpdateFavorite.class })
    private Integer userId;

    /**
     * 收藏类型
     */
    private String favoriteType;

    /**
     * 收藏关系ID
     */
    private String favoriteRelId;

    /**
     * 收藏状态
     */
    private String state;

    /**
     * 创建时间
     */
    private Date CreateTime;

    /**
     * 修改时间
     */
    private Date UpdateTime;

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

    public String getFavoriteType() {
        return favoriteType;
    }

    public void setFavoriteType(String favoriteType) {
        this.favoriteType = favoriteType;
    }

    public String getFavoriteRelId() {
        return favoriteRelId;
    }

    public void setFavoriteRelId(String favoriteRelId) {
        this.favoriteRelId = favoriteRelId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public Date getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(Date updateTime) {
        UpdateTime = updateTime;
    }

}
