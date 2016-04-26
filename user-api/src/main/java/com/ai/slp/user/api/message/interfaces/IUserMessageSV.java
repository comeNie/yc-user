package com.ai.slp.user.api.message.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.api.message.param.CreateUserMessageRequest;
import com.ai.slp.user.api.message.param.CreateUserMessageResponse;
import com.ai.slp.user.api.message.param.DeleteMessageRequest;
import com.ai.slp.user.api.message.param.UcUserMessageParams;

/**
 * 用户消息服务 Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public interface IUserMessageSV {
    @interface InsertUserMessage {
    }

    /**
     * 用户消息新增
     * 
     * @param createUserMessageRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER_008
     */
    CreateUserMessageResponse insertUserMessage(CreateUserMessageRequest createUserMessageRequest)
            throws BusinessException, SystemException;

    @interface UpdateUserMessage {
    }

    /**
     * 用户消息更新
     * 
     * @param ucUserMessageParams
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER_009
     */
    void updateUserMessage(UcUserMessageParams ucUserMessageParams)
            throws BusinessException, SystemException;

    @interface DeleteUserMessage {
    }

    /**
     * 删除消息服务
     * 
     * @param deleteRequest
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    void deleteUserMessage(DeleteMessageRequest deleteRequest)
            throws BusinessException, SystemException;
}
