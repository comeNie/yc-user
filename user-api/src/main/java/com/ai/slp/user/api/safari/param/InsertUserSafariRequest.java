package com.ai.slp.user.api.safari.param;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.safari.interfaces.IUserSafariSV;

/**
 * 用户查看商品足迹信息参数<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */

public class InsertUserSafariRequest extends BaseInfo {
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID NOT NULL
     */
    @NotNull(message = "用户Id不能为空", groups = { IUserSafariSV.InsertUserSafari.class })
    @Size(min = 18, max = 18, message = "用户Id长度不是18位", groups = { IUserSafariSV.InsertUserSafari.class })
    private String userId;

    /**
     * 浏览商品ID NOT NULL
     */
    @NotNull(message = "浏览商品Id不能为空", groups = { IUserSafariSV.InsertUserSafari.class })
    private String prodId;

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
