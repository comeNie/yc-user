package com.ai.slp.user.api.ucuser.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.api.ucuser.intefaces.IUcUserInfoSV;
import com.ai.slp.user.api.ucuser.param.SearchUserInfoRequest;
import com.ai.slp.user.api.ucuser.param.SearchUserInfoResponse;
import com.ai.slp.user.service.business.interfaces.IUcUserBusiSV;

@Service
@Transactional
public class UcUserInfoSVImpl implements IUcUserInfoSV {

    @Autowired
    private IUcUserBusiSV ucUserBusiSV;

    @Override
    public SearchUserInfoResponse searchUserInfo(SearchUserInfoRequest userInfoRequest)
            throws BusinessException, SystemException {
        return ucUserBusiSV.searchUserInfo(userInfoRequest);
    }

}
