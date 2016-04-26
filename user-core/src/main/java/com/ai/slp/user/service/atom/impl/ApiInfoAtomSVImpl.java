package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcApiInfo;
import com.ai.slp.user.dao.mapper.bo.UcApiInfoCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IApiInfoAtomSV;

@Component
public class ApiInfoAtomSVImpl implements IApiInfoAtomSV {

    @Override
    public int deleteByExample(UcApiInfoCriteria example) {
        return MapperFactory.getUcApiInfoMapper().deleteByExample(example);
    }

    @Override
    public int insert(UcApiInfo record) {
        return MapperFactory.getUcApiInfoMapper().insert(record);
    }

    @Override
    public List<UcApiInfo> selectByExample(UcApiInfoCriteria example) {
        return MapperFactory.getUcApiInfoMapper().selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UcApiInfo record, UcApiInfoCriteria example) {
        return MapperFactory.getUcApiInfoMapper().updateByExampleSelective(record, example);
    }

    @Override
    public int countByExample(UcApiInfoCriteria example) {
        return MapperFactory.getUcApiInfoMapper().countByExample(example);
    }

}
