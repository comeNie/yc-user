package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcBankInfo;
import com.ai.slp.user.dao.mapper.bo.UcBankInfoCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUcBankInfoAtomSV;

@Component
public class UcBankInfoAtomSVImpl implements IUcBankInfoAtomSV {

    @Override
    public int insert(UcBankInfo record) {
        return MapperFactory.getUcBankInfoMapper().insert(record);
    }

    @Override
    public int updateByExampleSelective(UcBankInfo record, UcBankInfoCriteria example) {
        return MapperFactory.getUcBankInfoMapper().updateByExampleSelective(record, example);
    }

    @Override
    public List<UcBankInfo> selectByExample(UcBankInfoCriteria example) {
        return MapperFactory.getUcBankInfoMapper().selectByExample(example);
    }

    @Override
    public int countByExample(UcBankInfoCriteria example) {
        return MapperFactory.getUcBankInfoMapper().countByExample(example);
    }

}
