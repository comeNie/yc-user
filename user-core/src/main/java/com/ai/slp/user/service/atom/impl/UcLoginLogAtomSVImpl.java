package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcLoginLog;
import com.ai.slp.user.dao.mapper.bo.UcLoginLogCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUcLoginLogAtomSV;

@Component
public class UcLoginLogAtomSVImpl implements IUcLoginLogAtomSV {

    @Override
    public void insertUcLoginLogInfo(UcLoginLog ucLoginLog) {
        MapperFactory.getUcLoginLogMapper().insert(ucLoginLog);
    }

    @Override
    public List<UcLoginLog> selectUcTelGroupInfo(UcLoginLogCriteria example) {
        return MapperFactory.getUcLoginLogMapper().selectByExample(example);
    }

    @Override
    public int countUcTelGroupInfo(UcLoginLogCriteria example) {
        return MapperFactory.getUcLoginLogMapper().countByExample(example);
    }

}
