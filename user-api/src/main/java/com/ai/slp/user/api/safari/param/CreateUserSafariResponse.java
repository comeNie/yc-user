package com.ai.slp.user.api.safari.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 创建浏览记录出参 Date: 2016年4月25日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class CreateUserSafariResponse extends BaseResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 返回ID
     */
    Integer responseId;

    public Integer getResponseId() {
        return responseId;
    }

    public void setResponseId(Integer responseId) {
        this.responseId = responseId;
    }

}
