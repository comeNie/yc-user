package com.ai.slp.user.api.message.param;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.message.interfaces.IUserMessageSV;

public class DeleteMessageRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID NOT NULL
     */
    @NotNull(message = "用户ID不能为空", groups = { IUserMessageSV.DeleteUserMessage.class })
    private Integer userId;

    /**
     * 消息Id列表 Not NULL
     */
    @NotNull(message = "消息列表不能为空", groups = { IUserMessageSV.DeleteUserMessage.class })
    private List<String> list;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

}
