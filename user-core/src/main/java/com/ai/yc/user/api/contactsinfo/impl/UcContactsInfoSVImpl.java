package com.ai.yc.user.api.contactsinfo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.contactsinfo.interfaces.IUcContactsInfoSV;
import com.ai.yc.user.api.contactsinfo.param.InsertContactsInfoRequest;
import com.ai.yc.user.api.contactsinfo.param.QueryContactsInfoRequest;
import com.ai.yc.user.api.contactsinfo.param.QueryContactsInfoResponse;
import com.ai.yc.user.api.contactsinfo.param.QueryContactsInfoSingleRequest;
import com.ai.yc.user.api.contactsinfo.param.QueryContactsInfoSingleResponse;
import com.ai.yc.user.api.contactsinfo.param.UpdateContactsInfoRequest;
import com.ai.yc.user.service.business.interfaces.IUcContactsInfoBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class UcContactsInfoSVImpl implements IUcContactsInfoSV {

    @Autowired
    private IUcContactsInfoBusiSV ucContactsInfoBusiSV;

    @Override
    public BaseResponse insertContactsInfo(InsertContactsInfoRequest contactsInfoRequest)
            throws BusinessException, SystemException {
        return ucContactsInfoBusiSV.insertContactsInfo(contactsInfoRequest);
    }

    @Override
    public BaseResponse updateContactsInfo(UpdateContactsInfoRequest contactsInfoRequest)
            throws BusinessException, SystemException {
        return ucContactsInfoBusiSV.updateContactsInfo(contactsInfoRequest);
    }

    @Override
    public QueryContactsInfoResponse queryContactsInfo(
            QueryContactsInfoRequest contactsInfoRequest)
                    throws BusinessException, SystemException {
        return ucContactsInfoBusiSV.queryContactsInfo(contactsInfoRequest);
    }

    @Override
    public QueryContactsInfoSingleResponse queryContactsInfoSingle(
            QueryContactsInfoSingleRequest contactsInfoRequest)
            throws BusinessException, SystemException {
        return ucContactsInfoBusiSV.queryContactsInfoSingle(contactsInfoRequest);
    }

}
