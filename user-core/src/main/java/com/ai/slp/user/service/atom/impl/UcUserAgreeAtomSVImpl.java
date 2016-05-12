package com.ai.slp.user.service.atom.impl;

import com.ai.slp.user.dao.mapper.bo.UcUserAgree;
import com.ai.slp.user.dao.mapper.interfaces.UcUserAgreeMapper;
import com.ai.slp.user.service.atom.interfaces.IUcUserAgreeAtomSV;

public class UcUserAgreeAtomSVImpl implements IUcUserAgreeAtomSV{
    
    private transient UcUserAgreeMapper userAgreeMapper;
    @Override
    public void InsertUcUserAgreeAtomSv(UcUserAgree record) {
        userAgreeMapper.insert(record);
    }

}
