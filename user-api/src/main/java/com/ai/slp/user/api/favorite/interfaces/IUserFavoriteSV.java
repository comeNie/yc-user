package com.ai.slp.user.api.favorite.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.favorite.param.DeleteFavoriteListRequest;
import com.ai.slp.user.api.favorite.param.InsertUserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UpdateFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UserFavoriteResponse;

/**
 * 用户收藏信息服务<br>
 * Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public interface IUserFavoriteSV {

    @interface InsertUcFavorite {
    }

    /**
     * 用户收藏信息创建
     * 
     * @param saveUserFavoriteRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER_004
     */
    BaseResponse insertUcFavorite(InsertUserFavoriteRequest favoriteRequest)
            throws BusinessException, SystemException;

    @interface CancelFavorite {
    }

    /**
     * 用户收藏信息更新 
     * 取消收藏即更新收藏状态
     * 
     * @param ucUserFavoriteParams
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @UCUSER_005
     */
    BaseResponse cancelFavorite(UpdateFavoriteRequest updateRequest)
            throws SystemException, BusinessException;

    @interface DeleteFavorite {
    }

    /**
     * 用户收藏信息删除
     * 
     * @param deleteRequest
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @UCUSER
     */

    BaseResponse deleteFavorite(DeleteFavoriteListRequest deleteListRequest)
            throws SystemException, BusinessException;

    @interface QueryFavorite {
    }

    /**
     * 用户收藏信息查询
     * 
     * @param userFavoriteRequest
     * @return
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @UCUSER_006
     */
   UserFavoriteResponse queryFavorite(UserFavoriteRequest userFavoriteRequest)
            throws SystemException, BusinessException;
}
