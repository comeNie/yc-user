package com.ai.slp.user.api.favorite.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.favorite.interfaces.IUserFavoriteSV;
import com.ai.slp.user.api.favorite.param.InsertUserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.InsertUserFavoriteResponse;
import com.ai.slp.user.api.favorite.param.DeleteFavoriteListRequest;
import com.ai.slp.user.api.favorite.param.UpdateFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UserFavoriteResponse;
import com.ai.slp.user.service.business.interfaces.IUserFavoriteBusiSV;

@Service
@Transactional
public class UserFavoriteSVImpl implements IUserFavoriteSV {

    @Autowired
    private IUserFavoriteBusiSV userFavoriteBusiSV;
    
    @Override
    public InsertUserFavoriteResponse insertUcFavorite(InsertUserFavoriteRequest favoriteRequest)
            throws BusinessException, SystemException {
        return userFavoriteBusiSV.insertUcFavorite(favoriteRequest);
    }

    @Override
    public void cancelFavorite(UpdateFavoriteRequest updateRequest)
            throws SystemException, BusinessException {
        userFavoriteBusiSV.updateFavorite(updateRequest);
    }

    @Override
    public PageInfo<UserFavoriteResponse> queryFavorite(UserFavoriteRequest userFavoriteRequest)
            throws SystemException, BusinessException {
        return userFavoriteBusiSV.queryFavorite(userFavoriteRequest);
    }

    @Override
    public void deleteFavorite(DeleteFavoriteListRequest deleteListRequest)
            throws SystemException, BusinessException {
        userFavoriteBusiSV.deleteFavorite(deleteListRequest);
    }

}
