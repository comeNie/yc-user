package com.ai.slp.user.api.contactsinfo.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.contactsinfo.param.InsertContactsInfoRequest;
import com.ai.slp.user.api.contactsinfo.param.QueryContactsInfoRequest;
import com.ai.slp.user.api.contactsinfo.param.QueryContactsInfoResponse;
import com.ai.slp.user.api.contactsinfo.param.UpdateContactsInfoRequest;

/**
 * 用户联系人服务 Date: 2016年4月29日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public interface IUcContactsInfoSV {

    @interface InsertContactsInfo {
    }

    /**
     * 创建用户联系人
     * 
     * @param contactsInfoRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    BaseResponse insertContactsInfo(InsertContactsInfoRequest contactsInfoRequest)
            throws BusinessException, SystemException;

    @interface UpdateContactsInfo {
    }

    /**
     * 更新用户联系人
     * 
     * @param contactsInfoRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    BaseResponse updateContactsInfo(UpdateContactsInfoRequest contactsInfoRequest)
            throws BusinessException, SystemException;

    @interface QueryContactsInfo {
    }

    /**
     * 获取用户联系人
     * 
     * @param contactsInfoRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    PageInfo<QueryContactsInfoResponse> queryContactsInfo(
            QueryContactsInfoRequest contactsInfoRequest) throws BusinessException, SystemException;

}
