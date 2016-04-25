package com.ai.slp.user.api.safari.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.safari.interfaces.IUserSafariSV;

/**
 * 删除浏览商品记录入参 Date: 2016年4月25日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class DeleteSafariRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID NOT NULL
     */
    @NotNull(message = "用户Id不能为空", groups = { IUserSafariSV.DeleteUserSafari.class })
    private Integer userId;

    /**
     * 浏览商品ID NOT NULL
     */
    @NotNull(message = "商品Id不能为空", groups = { IUserSafariSV.DeleteUserSafari.class })
    private String prodId;

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

}