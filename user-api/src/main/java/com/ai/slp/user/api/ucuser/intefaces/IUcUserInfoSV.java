package com.ai.slp.user.api.ucuser.intefaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.api.ucuser.param.SearchUserInfoRequest;
import com.ai.slp.user.api.ucuser.param.SearchUserInfoResponse;

public interface IUcUserInfoSV {

    /**
     * 查询用户信息
     * @param userInfoRequest
     * @return
     * @author zhangqiang7
     * @UCUSER
     */
    public SearchUserInfoResponse searchUserInfo(SearchUserInfoRequest userInfoRequest)
            throws BusinessException, SystemException;
}
