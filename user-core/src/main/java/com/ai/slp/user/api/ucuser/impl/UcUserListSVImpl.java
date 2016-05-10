package com.ai.slp.user.api.ucuser.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.api.ucuser.intefaces.IUcUserListSV;
import com.ai.slp.user.api.ucuser.param.SearchUserListRequest;
import com.ai.slp.user.api.ucuser.param.SearchUserListResponse;
import com.ai.slp.user.service.business.interfaces.IUcUserBusiSV;

@Service
@Transactional
public class UcUserListSVImpl implements IUcUserListSV {

    @Autowired
    private IUcUserBusiSV ucUserBusiSV;

    @Override
    public SearchUserListResponse searchUserList(SearchUserListRequest userListRequest)
            throws BusinessException, SystemException {
        return ucUserBusiSV.searchUserList(userListRequest);
    }

}
