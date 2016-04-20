package com.ai.slp.user.api.apiinfo.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.apiinfo.interfaces.IApiInfoSV;

/**
 * 企业、代理商申请API创建服务请求 <br>
 * Date: 2016年4月19日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class CreateApiInfoRequest extends BaseInfo {
    private static final long serialVersionUID = 1L;

    /**
     * 用户Id NOT NULL
     */
    @NotNull(message = "用户Id不能为空", groups = { IApiInfoSV.InsertApiInfo.class })
    private Integer userId;

    public CreateApiInfoRequest(Integer userId) {
        super();
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
