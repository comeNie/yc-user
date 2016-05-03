package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcContactsInfo;
import com.ai.slp.user.dao.mapper.bo.UcContactsInfoCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUcContactsInfoAtomSV;

@Component
public class UcContactsInfoAtomSVImpl implements IUcContactsInfoAtomSV {

    @Override
    public int countByExample(UcContactsInfoCriteria example) {
        return MapperFactory.getUcContactsInfoMapper().countByExample(example);
    }

    @Override
    public int deleteByExample(UcContactsInfoCriteria example) {
        return MapperFactory.getUcContactsInfoMapper().deleteByExample(example);
    }

    @Override
    public int insert(UcContactsInfo record) {
        return MapperFactory.getUcContactsInfoMapper().insert(record);
    }

    @Override
    public List<UcContactsInfo> selectByExample(UcContactsInfoCriteria example) {
        return MapperFactory.getUcContactsInfoMapper().selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UcContactsInfo record, UcContactsInfoCriteria example) {
        return MapperFactory.getUcContactsInfoMapper().updateByExampleSelective(record, example);
    }

}
