package com.ai.slp.user.api.safari.param;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.safari.interfaces.IUserSafariSV;

/**
 * 用户查看商品足迹信息表<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */

public class UcUserSafariParams extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID NOT NULL
     */
    @NotNull(message = "用户Id不能为空", groups = { IUserSafariSV.UpdateUserSafari.class })
    private Integer userId;

    /**
     * 浏览信息ID NOT NULL
     */
    @NotNull(message = "浏览信息Id不能为空", groups = { IUserSafariSV.UpdateUserSafari.class })
    private String safariSeqId;

    /**
     * 商品ID
     */
    private String prodId;

    /**
     * 浏览时间
     */
    private Date safariTime;

    /**
     * 状态
     */
    private String state;

    public UcUserSafariParams(Integer userId, String safariSeqId, String prodId, Date safariTime,
            String state) {
        super();
        this.userId = userId;
        this.safariSeqId = safariSeqId;
        this.prodId = prodId;
        this.safariTime = safariTime;
        this.state = state;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSafariSeqId() {
        return safariSeqId;
    }

    public void setSafariSeqId(String safariSeqId) {
        this.safariSeqId = safariSeqId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
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
