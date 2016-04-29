package com.ai.slp.user.service.atom.impl;

import java.util.List;

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
    public int updateUcStateChgBusiInfo(@Param("record") UcStateChg record,
            @Param("example") UcStateChgCriteria example) {
        return MapperFactory.getUcStateChgMapper().updateByExampleSelective(record, example);
    }

    @Override
    public List<UcStateChg> selectByExample(UcStateChgCriteria example) {
        return MapperFactory.getUcStateChgMapper().selectByExample(example);
    }

}
