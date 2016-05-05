package com.ai.slp.user.api.ucuser.intefaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.api.ucuser.param.SearchUserListRequest;
import com.ai.slp.user.api.ucuser.param.SearchUserListResponse;

public interface IUcUserListSV {

    /**
     * 查询用户信息
     * @param userInfoRequest
     * @return
     * @author zhangqiang7
     * @UCUSER
     */
    public SearchUserListResponse searchUserList(SearchUserListRequest userListRequest)
            throws BusinessException, SystemException;
}
