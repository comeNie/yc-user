package com.ai.slp.user.api.message.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.message.param.DeleteMessageRequest;
import com.ai.slp.user.api.message.param.InsertUserMessageRequest;
import com.ai.slp.user.api.message.param.QueryMessageRequest;
import com.ai.slp.user.api.message.param.QueryMessageResponse;
import com.ai.slp.user.api.message.param.UpdateMessageRequest;

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
    BaseResponse insertUserMessage(InsertUserMessageRequest messageRequest)
            throws BusinessException, SystemException;

    @interface UpdateUserMessage {
    }

    /**
     * 页面删除即更新消息状态
     * 
     * @param ucUserMessageParams
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER_009
     */
    BaseResponse updateUserMessage(UpdateMessageRequest updateRequest)
            throws BusinessException, SystemException;

    @interface QueryUserMessage {
    }

    /**
     * 查询消息
     * 
     * @param deleteRequest
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    PageInfo<QueryMessageResponse> queryUserMessage(QueryMessageRequest queryRequest)
            throws BusinessException, SystemException;

    @interface DeleteUserMessage {
    }

    /**
     * 后台删除消息
     * 
     * @param deleteRequest
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    BaseResponse deleteMessage(DeleteMessageRequest deleteRequest)
            throws BusinessException, SystemException;
}
