package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcSpecialInfo;
import com.ai.slp.user.dao.mapper.bo.UcSpecialInfoCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUcSpecialInfoAtomSV;

@Component
public class UcSpecialInfoAtomSVImpl implements IUcSpecialInfoAtomSV {

    @Override
    public int deleteByExample(UcSpecialInfoCriteria example) {
        return MapperFactory.getUcSpecialInfoMapper().deleteByExample(example);
    }

    @Override
    public int insert(UcSpecialInfo record) {
        return MapperFactory.getUcSpecialInfoMapper().insert(record);
    }

    @Override
    public List<UcSpecialInfo> selectByExample(UcSpecialInfoCriteria example) {
        return MapperFactory.getUcSpecialInfoMapper().selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UcSpecialInfo record, UcSpecialInfoCriteria example) {
        return MapperFactory.getUcSpecialInfoMapper().updateByExampleSelective(record, example);
    }

}
