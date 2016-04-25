package com.ai.slp.user.api.favorite.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.favorite.interfaces.IUserFavoriteSV;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteResponse;
import com.ai.slp.user.api.favorite.param.DeleteFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UcUserFavoriteParams;
import com.ai.slp.user.api.favorite.param.UserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UserFavoriteResponse;
import com.ai.slp.user.service.business.interfaces.IUserFavoriteBusiSV;

@Service
@Transactional
public class UserFavoriteSVImpl implements IUserFavoriteSV {

    @Autowired
    private IUserFavoriteBusiSV iUserFavoriteBusiSV;
    
    @Override
    public CreateUserFavoriteResponse insertUcFavorite(CreateUserFavoriteRequest createUserFavoriteRequest)
            throws BusinessException, SystemException {
        return iUserFavoriteBusiSV.insertUcFavorite(createUserFavoriteRequest);
    }

    @Override
    public void updateFavorite(UcUserFavoriteParams ucUserFavoriteParams)
            throws SystemException, BusinessException {
        iUserFavoriteBusiSV.updateFavorite(ucUserFavoriteParams);
    }

    @Override
    public PageInfo<UserFavoriteResponse> queryFavorite(UserFavoriteRequest userFavoriteRequest)
            throws SystemException, BusinessException {
        return iUserFavoriteBusiSV.queryFavorite(userFavoriteRequest);
    }

    @Override
    public void deleteFavorite(DeleteFavoriteRequest deleteRequest)
            throws SystemException, BusinessException {
        iUserFavoriteBusiSV.deleteFavorite(deleteRequest);
    }

}
