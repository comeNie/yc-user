package com.ai.slp.user.api.specialinfo.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.specialinfo.interfaces.IUcSpecialInfoSV;

/**
 * 获取个性化信息出参 Date: 2016年4月28日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QuerySpecialInfoRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户Id NOT NULL
     */
    @NotNull(message = "userID不能为空", groups = { IUcSpecialInfoSV.UpdateSpecialInfo.class })
    private String userId;

    /**
     * 扩展ID
     */
    @NotNull(message = "specialInfoId不能为空", groups = { IUcSpecialInfoSV.UpdateSpecialInfo.class })
    private Long specialInfoId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getSpecialInfoId() {
        return specialInfoId;
    }

    public void setSpecialInfoId(Long specialInfoId) {
        this.specialInfoId = specialInfoId;
    }

}
