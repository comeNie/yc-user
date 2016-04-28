package com.ai.slp.user.api.safari.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.safari.interfaces.IUserSafariSV;
import com.ai.slp.user.api.safari.param.CreateUserSafariRequest;
import com.ai.slp.user.api.safari.param.CreateUserSafariResponse;
import com.ai.slp.user.api.safari.param.DeleteSafariHisRequest;
import com.ai.slp.user.api.safari.param.DeleteSafariRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoResponse;
import com.ai.slp.user.service.business.interfaces.IUserSafariBusiSV;

@Service
@Transactional
public class UserSafariSVImpl implements IUserSafariSV {

    private IUserSafariBusiSV userSafariBusiSV;

    @Override
    public CreateUserSafariResponse insertUserSafari(CreateUserSafariRequest request)
            throws BusinessException, SystemException {
        return userSafariBusiSV.insertUserSafari(request);
    }

    @Override
    public void deleteUserSafari(DeleteSafariRequest deleteSafariRequest)
            throws BusinessException, SystemException {
        userSafariBusiSV.deleteUserSafari(deleteSafariRequest);
    }

    @Override
    public PageInfo<UserSafariInfoResponse> queryUserSafari(
            UserSafariInfoRequest userSafariInfoRequest) throws BusinessException, SystemException {
        return userSafariBusiSV.queryUserSafari(userSafariInfoRequest);
    }

    @Override
    public void deleteUserSafariHis(DeleteSafariHisRequest deleteReuqest)
            throws BusinessException, SystemException {
    }

    @Override
    public void deleteSafariBack(DeleteSafariRequest deleteRequest)
            throws BusinessException, SystemException {
    }

}
