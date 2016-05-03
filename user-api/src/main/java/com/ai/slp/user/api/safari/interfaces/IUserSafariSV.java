package com.ai.slp.user.api.safari.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.safari.param.DeleteSafariHisRequest;
import com.ai.slp.user.api.safari.param.DeleteSafariRequest;
import com.ai.slp.user.api.safari.param.InsertUserSafariRequest;
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
     * @UCUSER_010
     */
    BaseResponse insertUserSafari(InsertUserSafariRequest safariRequest)
            throws BusinessException, SystemException;

    @interface DeleteUserSafari {
    }

    /**
     * 用户浏览商品信息前端删除
     * 
     * @param ucUserSafariParams
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER_011
     */
    BaseResponse deleteUserSafari(DeleteSafariRequest deletSafariRequest)
            throws BusinessException, SystemException;

    @interface DeleteSafariBack {
    }

    /**
     * 用户浏览商品信息后台删除
     * 
     * @param deleteRequest
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    BaseResponse deleteSafariBack(DeleteSafariRequest deleteRequest)
            throws BusinessException, SystemException;

    @interface DeleteUserSafariHis {
    }

    /**
     * 删除浏览商品足迹历史表
     * 
     * @param deleteReuqest
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    BaseResponse deleteUserSafariHis(DeleteSafariHisRequest deleteReuqest)
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
     * @UCUSER_012
     */
    UserSafariInfoResponse queryUserSafari(UserSafariInfoRequest userSafariInfoRequest)
            throws BusinessException, SystemException;
}