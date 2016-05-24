package com.ai.slp.user.api.ucuser.intefaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.api.ucuser.param.SearchUserRequest;
import com.ai.slp.user.api.ucuser.param.SearchUserListResponse;
import com.ai.slp.user.api.ucuser.param.SearchUserResponse;

public interface IUcUserSV {

    interface SearchUserList {
    }

    /**
     * 查询用户信息
     * 
     * @param userInfoRequest
     * @return
     * @author zhangqiang7
     * @UCUSER
     */
    public SearchUserListResponse searchUserList(SearchUserRequest userListRequest)
            throws BusinessException, SystemException;
    
    interface QueryByPhone{}
    /**
     * 根据手机号码进行查询（不加状态）
     * @param request
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangyh7
     * @ApiCode 
     */
    SearchUserResponse queryByPhone(SearchUserRequest request) throws BusinessException,SystemException;
    
    interface QueryByEmail{}
    /**
     * 根据email进行查询（不加状态）
     * @param request
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangyh7
     * @ApiCode 
     */
    SearchUserResponse queryByEmail(SearchUserRequest request) throws BusinessException,SystemException;
    
    interface QueryBaseInfo{}
    /**
     * 根据email进行查询（不加状态）
     * @param request
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhanglh
     * @ApiCode UAC_0015
     */
    SearchUserResponse queryBaseInfo(SearchUserRequest accountQueryRequest) throws BusinessException,SystemException;
}
