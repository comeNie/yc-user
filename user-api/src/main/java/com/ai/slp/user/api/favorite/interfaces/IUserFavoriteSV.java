package com.ai.slp.user.api.favorite.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteRequest;
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
     * @UCUSER
     */
    BaseResponse insertUcFavorite(CreateUserFavoriteRequest saveUserFavoriteRequest)
            throws BusinessException, SystemException;

    @interface UpdateFavorite {
    }

    /**
     * 用户收藏信息更新
     * 
     * @param ucUserFavoriteParams
     * @return
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @UCUSER
     */
    BaseResponse updateFavorite(UcUserFavoriteParams ucUserFavoriteParams)
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
     * @UCUSER
     */
    PageInfo<UserFavoriteResponse> queryFavorite(UserFavoriteRequest userFavoriteRequest)
            throws SystemException, BusinessException;
}
