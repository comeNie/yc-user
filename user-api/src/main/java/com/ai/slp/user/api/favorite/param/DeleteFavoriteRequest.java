package com.ai.slp.user.api.favorite.param;

import com.ai.opt.base.vo.BaseInfo;
/**
 * 删除单个收藏记录入参
 * Date: 2016年4月26日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class DeleteFavoriteRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 收藏ID
     */
    private String favoriteReqId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFavoriteReqId() {
        return favoriteReqId;
    }

    public void setFavoriteReqId(String favoriteReqId) {
        this.favoriteReqId = favoriteReqId;
    }

}
