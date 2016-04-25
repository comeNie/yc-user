package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.safari.param.CreateUserSafariRequest;
import com.ai.slp.user.api.safari.param.CreateUserSafariResponse;
import com.ai.slp.user.api.safari.param.DeleteSafariRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoResponse;

public interface IUserSafariBusiSV {
    CreateUserSafariResponse insertUserSafari(CreateUserSafariRequest request)
            throws BusinessException, SystemException;

    public void deleteUserSafari(DeleteSafariRequest deleetSafariRequest)
            throws BusinessException, SystemException;

    public PageInfo<UserSafariInfoResponse> queryUserSafari(
            UserSafariInfoRequest userSafariInfoRequest) throws BusinessException, SystemException;
}
