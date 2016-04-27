package com.ai.slp.user.service.atom.impl;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcStateChg;
import com.ai.slp.user.dao.mapper.bo.UcStateChgCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUcStateChgAtomSV;

@Component
public class UcStateChgAtomSVImpl implements IUcStateChgAtomSV {

    @Override
    public int insertUcStateChgBusiInfo(UcStateChg ucStateChgParam) {
       
        return MapperFactory.getUcStateChgMapper().insert(ucStateChgParam);
    }

    @Override
    public int updateUcStateChgBusiInfo(@Param("record")
    UcStateChg record, @Param("example")
    UcStateChgCriteria example) {
        return MapperFactory.getUcStateChgMapper().updateByExample(record, example);
    }

}
