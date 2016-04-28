package com.ai.slp.user.api.specialinfo.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 创建用户个性化信息出参
 * Date: 2016年4月28日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class InsertSpecialInfoResponse extends BaseResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 返回标志
     */
    private Integer responseId;

    public Integer getResponseId() {
        return responseId;
    }

    public void setResponseId(Integer responseId) {
        this.responseId = responseId;
    }

}