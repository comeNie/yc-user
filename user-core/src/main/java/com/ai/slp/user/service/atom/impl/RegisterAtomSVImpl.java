package com.ai.slp.user.service.atom.impl;

import java.util.List;

import com.ai.slp.user.dao.mapper.bo.UcUser;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IRegisterAtomSV;

public class RegisterAtomSVImpl implements IRegisterAtomSV {

    @Override
    public int insertUserInfo(UcUser user) {
        return MapperFactory.getUcUserMapper().insert(user);
    }

    @Override
    public List<UcUser> getUserInfo(UcUserCriteria criteria) {
        return MapperFactory.getUcUserMapper().selectByExample(criteria);
    }

    
}
