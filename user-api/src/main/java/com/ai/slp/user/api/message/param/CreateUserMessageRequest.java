package com.ai.slp.user.api.message.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.message.interfaces.IUserMessageSV;

/**
 * 用户消息服务创建入参 Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class CreateUserMessageRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;


    /**
     * 用户ID NOT NULL
     */
    @NotNull(message = "用户ID不能为空", groups = { IUserMessageSV.InsertUserMessage.class })
    private String userId;

    public CreateUserMessageRequest(String userId) {
        super();
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
