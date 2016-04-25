package com.ai.slp.user.api.safari.param;

import java.util.Date;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 查询浏览商品出参 Date: 2016年4月25日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class UserSafariInfoResponse extends BaseResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 商品ID
     */
    private String prodId;

    /**
     * 浏览商品ID
     */
    private String safariSeqId;

    /**
     * 浏览时间
     */
    private Date safariTime;

    /**
     * 状态
     */
    private String state;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getSafariSeqId() {
        return safariSeqId;
    }

    public void setSafariSeqId(String safariSeqId) {
        this.safariSeqId = safariSeqId;
    }

    public Date getSafariTime() {
        return safariTime;
    }

    public void setSafariTime(Date safariTime) {
        this.safariTime = safariTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
