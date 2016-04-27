package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.message.param.CreateUserMessageRequest;
import com.ai.slp.user.api.message.param.CreateUserMessageResponse;
import com.ai.slp.user.api.message.param.DeleteMessageRequest;
import com.ai.slp.user.api.message.param.QueryMessageRequest;
import com.ai.slp.user.api.message.param.QueryMessageResponse;
import com.ai.slp.user.api.message.param.UpdateMessageRequest;

public interface IUserMessageBusiSV {

    public CreateUserMessageResponse insertUserMessage(
            CreateUserMessageRequest createUserMessageRequest)
                    throws BusinessException, SystemException;

    public void updateUserMessage(UpdateMessageRequest request)
            throws BusinessException, SystemException;

    public PageInfo<QueryMessageResponse> queryUserMessage(QueryMessageRequest queryRequest)
            throws BusinessException, SystemException;

    public void deleteMessage(DeleteMessageRequest deleteRequest)
            throws BusinessException, SystemException;
}
