package com.ai.slp.user.service.atom.impl;

import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUcGroupKeyInfoAtomSV;

public class UcGroupKeyInfoAtomSVImpl implements IUcGroupKeyInfoAtomSV {

    @Override
    public void insertUcGroupKeyInfo(UcGroupKeyInfo ucGroupKey) {
        MapperFactory.getUcGroupKeyInfoMapper().insert(ucGroupKey);
        
    }

}
