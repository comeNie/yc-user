package com.ai.slp.user.api.contactsinfo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.contactsinfo.interfaces.IUcContactsInfoSV;
import com.ai.slp.user.api.contactsinfo.param.InsertContactsInfoRequest;
import com.ai.slp.user.api.contactsinfo.param.QueryContactsInfoRequest;
import com.ai.slp.user.api.contactsinfo.param.QueryContactsInfoResponse;
import com.ai.slp.user.api.contactsinfo.param.UpdateContactsInfoRequest;
import com.ai.slp.user.service.business.interfaces.IUcContactsInfoBusiSV;

@Service
@Transactional
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
    public PageInfo<QueryContactsInfoResponse> queryContactsInfo(
            QueryContactsInfoRequest contactsInfoRequest)
                    throws BusinessException, SystemException {
        return ucContactsInfoBusiSV.queryContactsInfo(contactsInfoRequest);
    }

}
