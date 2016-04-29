package com.ai.slp.user.api.message.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.message.interfaces.IUserMessageSV;
import com.ai.slp.user.api.message.param.DeleteMessageRequest;
import com.ai.slp.user.api.message.param.InsertUserMessageRequest;
import com.ai.slp.user.api.message.param.QueryMessageRequest;
import com.ai.slp.user.api.message.param.QueryMessageResponse;
import com.ai.slp.user.api.message.param.UpdateMessageRequest;
import com.ai.slp.user.service.business.interfaces.IUserMessageBusiSV;

@Service
@Transactional
public class UserMessageSVImpl implements IUserMessageSV {

    @Autowired
    private IUserMessageBusiSV userMessageBusiSV;

    @Override
    public BaseResponse insertUserMessage(
            InsertUserMessageRequest messageRequest)
                    throws BusinessException, SystemException {
        return userMessageBusiSV.insertUserMessage(messageRequest);
    }

    @Override
    public BaseResponse updateUserMessage(UpdateMessageRequest updateRequest)
            throws BusinessException, SystemException {
        return userMessageBusiSV.updateUserMessage(updateRequest);
    }

    @Override
    public PageInfo<QueryMessageResponse> queryUserMessage(QueryMessageRequest queryRequest)
            throws BusinessException, SystemException {
        return userMessageBusiSV.queryUserMessage(queryRequest);
    }

    @Override
    public BaseResponse deleteMessage(DeleteMessageRequest deleteRequest)
            throws BusinessException, SystemException {
        return userMessageBusiSV.deleteMessage(deleteRequest);
    }

}
