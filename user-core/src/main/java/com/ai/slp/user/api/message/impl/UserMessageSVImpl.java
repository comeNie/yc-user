package com.ai.slp.user.api.message.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.api.message.interfaces.IUserMessageSV;
import com.ai.slp.user.api.message.param.CreateUserMessageRequest;
import com.ai.slp.user.api.message.param.CreateUserMessageResponse;
import com.ai.slp.user.api.message.param.UcUserMessageParams;

@Service
@Transactional
public class UserMessageSVImpl implements IUserMessageSV {

    @Override
    public CreateUserMessageResponse insertUserMessage(
            CreateUserMessageRequest createUserMessageRequest)
                    throws BusinessException, SystemException {
        return null;
    }

    @Override
    public void updateUserMessage(UcUserMessageParams ucUserMessageParams)
            throws BusinessException, SystemException {
    }

}
