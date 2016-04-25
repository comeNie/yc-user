package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcUserFavorite;
import com.ai.slp.user.dao.mapper.bo.UcUserFavoriteCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUserFavoriteAtomSV;

@Component
public class UserFavoriteAtomSVImpl implements IUserFavoriteAtomSV {

    @Override
    public int insert(UcUserFavorite record) {
        return MapperFactory.getUcUserFavoriteMapper().insert(record);
    }

    @Override
    public int updateByExample(UcUserFavorite record, UcUserFavoriteCriteria example) {
        return MapperFactory.getUcUserFavoriteMapper().updateByExample(record, example);
    }

    @Override
    public int deleteByExample(UcUserFavoriteCriteria example) {
        return MapperFactory.getUcUserFavoriteMapper().deleteByExample(example);
    }

    @Override
    public List<UcUserFavorite> selectByExample(UcUserFavoriteCriteria example) {
        return MapperFactory.getUcUserFavoriteMapper().selectByExample(example);
    }

    @Override
    public int countByExample(UcUserFavoriteCriteria example) {
        return MapperFactory.getUcUserFavoriteMapper().countByExample(example);
    }

}
