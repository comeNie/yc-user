package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcTelGroup;
import com.ai.slp.user.dao.mapper.bo.UcTelGroupCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUcTelGroupAtomSV;

@Component
public class TelGroupAtomSVImpl implements IUcTelGroupAtomSV {
  
    @Override
    public void insertUcTelGroupInfo(UcTelGroup contactsGroup) {
        MapperFactory.getUcTelGroupMapper().insert(contactsGroup);
    }

    @Override
    public List<UcTelGroup> selectUcTelGroupInfo(UcTelGroupCriteria ucTelGroupCriteria) {
        List<UcTelGroup> result = MapperFactory.getUcTelGroupMapper().selectByExample(ucTelGroupCriteria);
        return result;
    }

    @Override
    public void updateUcTelGroupInfo(UcTelGroup contactsGroup,UcTelGroupCriteria example) {
        MapperFactory.getUcTelGroupMapper().updateByExample(contactsGroup, example);
    }

    @Override
    public int countUcTelGroupInfo(UcTelGroupCriteria example) {
        return  MapperFactory.getUcTelGroupMapper().countByExample(example);
    }

    @Override
    public void deleteUcTelGroupInfo(UcTelGroupCriteria example) {
        MapperFactory.getUcTelGroupMapper().deleteByExample(example);
    }

}
