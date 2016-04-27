package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcUserSafari;
import com.ai.slp.user.dao.mapper.bo.UcUserSafariCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUserSafariAtomSV;

@Component
public class UserSafariAtomSVImpl implements IUserSafariAtomSV {

    @Override
    public int insert(UcUserSafari record) {
        return MapperFactory.getUcUserSafariMapper().insert(record);
    }

    @Override
    public List<UcUserSafari> selectByExample(UcUserSafariCriteria example) {
        return MapperFactory.getUcUserSafariMapper().selectByExample(example);
    }

    @Override
    public int deleteByExample(UcUserSafariCriteria example) {
        return MapperFactory.getUcUserSafariMapper().deleteByExample(example);
    }

    @Override
    public int countByExample(UcUserSafariCriteria example) {
        return MapperFactory.getUcUserSafariMapper().countByExample(example);
    }

    @Override
    public int updateByExampleSelective(UcUserSafari record, UcUserSafariCriteria example) {
        return MapperFactory.getUcUserSafariMapper().updateByExampleSelective(record, example);
    }
    
}
