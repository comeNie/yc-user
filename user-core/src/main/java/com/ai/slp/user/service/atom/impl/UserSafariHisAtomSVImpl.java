package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcUserSafariHis;
import com.ai.slp.user.dao.mapper.bo.UcUserSafariHisCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUserSafariHisAtomSV;

@Component
public class UserSafariHisAtomSVImpl implements IUserSafariHisAtomSV {

    @Override
    public int insert(UcUserSafariHis record) {
        return MapperFactory.getUcUserSafariHisMapper().insert(record);
    }

    @Override
    public List<UcUserSafariHis> selectByExample(UcUserSafariHisCriteria example) {
        return MapperFactory.getUcUserSafariHisMapper().selectByExample(example);
    }

    @Override
    public int deleteByExample(UcUserSafariHisCriteria example) {
        return MapperFactory.getUcUserSafariHisMapper().deleteByExample(example);
    }
}
