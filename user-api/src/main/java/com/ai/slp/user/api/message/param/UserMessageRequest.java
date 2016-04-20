package com.ai.slp.user.api.message.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.message.interfaces.IUserMessageSV;

public class UserMessageRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户消息ID Not NULL
     */
    @NotNull(message = "用户消息ID不能为空", groups = { IUserMessageSV.InsertUserMessage.class })
    private String infoSeqId;

    /**
     * 用户ID NOT NULL
     */
    @NotNull(message = "用户ID不能为空", groups = { IUserMessageSV.InsertUserMessage.class })
    private String userId;
    
    public UserMessageRequest(String infoSeqId, String userId) {
        super();
        this.infoSeqId = infoSeqId;
        this.userId = userId;
    }

    public String getInfoSeqId() {
        return infoSeqId;
    }

    public void setInfoSeqId(String infoSeqId) {
        this.infoSeqId = infoSeqId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    
}
