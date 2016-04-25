package com.ai.slp.user.api.favorite.param;

import java.util.Date;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 用户收藏信息出参 Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class UserFavoriteResponse extends BaseResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 租户ID
     */
    private String TenantId;

    /**
     * 收藏ID
     */
    private String favoriteSeqId;

    /**
     * 用户ID
     */
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

    public String getTenantId() {
        return TenantId;
    }

    public void setTenantId(String tenantId) {
        TenantId = tenantId;
    }

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
