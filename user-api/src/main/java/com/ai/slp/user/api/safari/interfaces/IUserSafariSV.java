package com.ai.slp.user.api.safari.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.safari.param.CreateUserSafariRequest;
import com.ai.slp.user.api.safari.param.UcUserSafariParams;
import com.ai.slp.user.api.safari.param.UserSafariInfoRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoResponse;

/**
 * 用户查看商品足迹服务<br>
 * Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */

public interface IUserSafariSV {

    @interface InsertUserSafari {
    }

    /**
     * 用户浏览商品信息创建
     * 
     * @param createUserSafariRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    BaseResponse insertUserSafari(CreateUserSafariRequest createUserSafariRequest)
            throws BusinessException, SystemException;

    @interface UpdateUserSafari {
    }

    /**
     * 用户浏览商品信息更新
     * 
     * @param ucUserSafariParams
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    BaseResponse updateUserSafari(UcUserSafariParams ucUserSafariParams)
            throws BusinessException, SystemException;

    @interface QueryUserSafari {
    }

    /**
     * 用户浏览商品信息查询
     * 
     * @param userSafariInfoRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    PageInfo<UserSafariInfoResponse> queryUserSafari(UserSafariInfoRequest userSafariInfoRequest)
            throws BusinessException, SystemException;
}