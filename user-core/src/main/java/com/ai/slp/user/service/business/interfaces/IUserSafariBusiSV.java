package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.safari.param.InsertUserSafariRequest;
import com.ai.slp.user.api.safari.param.InsertUserSafariResponse;
import com.ai.slp.user.api.safari.param.DeleteSafariHisRequest;
import com.ai.slp.user.api.safari.param.DeleteSafariRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoResponse;

public interface IUserSafariBusiSV {
    InsertUserSafariResponse insertUserSafari(InsertUserSafariRequest safariRequest)
            throws BusinessException, SystemException;

    public void deleteUserSafari(DeleteSafariRequest deleetSafariRequest)
            throws BusinessException, SystemException;

    public PageInfo<UserSafariInfoResponse> queryUserSafari(
            UserSafariInfoRequest userSafariInfoRequest) throws BusinessException, SystemException;

    public void deleteUserSafariHis(DeleteSafariHisRequest deleteRequest)
            throws BusinessException, SystemException;

}
