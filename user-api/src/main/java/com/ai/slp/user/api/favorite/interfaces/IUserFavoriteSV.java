package com.ai.slp.user.api.favorite.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteResponse;
import com.ai.slp.user.api.favorite.param.DeleteFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UcUserFavoriteParams;
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
    CreateUserFavoriteResponse insertUcFavorite(CreateUserFavoriteRequest createUserFavoriteRequest)
            throws BusinessException, SystemException;

    @interface UpdateFavorite {
    }

    /**
     * 用户收藏信息更新
     * 
     * @param ucUserFavoriteParams
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @UCUSER_005
     */
    void updateFavorite(UcUserFavoriteParams ucUserFavoriteParams)
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

    void deleteFavorite(DeleteFavoriteRequest deleteRequest)
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
    PageInfo<UserFavoriteResponse> queryFavorite(UserFavoriteRequest userFavoriteRequest)
            throws SystemException, BusinessException;
}
