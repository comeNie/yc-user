package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteResponse;
import com.ai.slp.user.api.favorite.param.DeleteFavoriteListRequest;
import com.ai.slp.user.api.favorite.param.UcUserFavoriteParams;
import com.ai.slp.user.api.favorite.param.UserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UserFavoriteResponse;

public interface IUserFavoriteBusiSV {

    public CreateUserFavoriteResponse insertUcFavorite(
            CreateUserFavoriteRequest createUserFavoriteRequest)
                    throws BusinessException, SystemException;

    public void updateFavorite(UcUserFavoriteParams ucUserFavoriteParams)
            throws SystemException, BusinessException;

    public void deleteFavorite(DeleteFavoriteListRequest deleteFavoriteListRequest)
            throws SystemException, BusinessException;

    public PageInfo<UserFavoriteResponse> queryFavorite(UserFavoriteRequest userFavoriteRequest)
            throws SystemException, BusinessException;

}
