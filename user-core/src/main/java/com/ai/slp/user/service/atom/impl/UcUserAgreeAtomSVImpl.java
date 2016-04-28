package com.ai.slp.user.service.atom.impl;

import com.ai.slp.user.dao.mapper.bo.UcUserAgree;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUcUserAgreeAtomSV;

public class UcUserAgreeAtomSVImpl implements IUcUserAgreeAtomSV{
    
    @Override
    public void InsertUcUserAgreeAtomSv(UcUserAgree record) {
        MapperFactory.getUcUserAgreeMapper().insert(record);
    }

}
