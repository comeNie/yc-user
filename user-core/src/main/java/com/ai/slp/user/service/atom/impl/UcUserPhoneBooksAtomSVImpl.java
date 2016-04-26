package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcUserPhonebooks;
import com.ai.slp.user.dao.mapper.bo.UcUserPhonebooksCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUcUserPhoneBooksAtomSV;

@Component
public class UcUserPhoneBooksAtomSVImpl implements IUcUserPhoneBooksAtomSV{

    @Override
    public void insertUserPhoneBooksInfo(UcUserPhonebooks record) {
        MapperFactory.getUcUserPhonebooksMapper().insert(record);
    }

    @Override
    public void updateUserPhoneBooksInfo(UcUserPhonebooks record,UcUserPhonebooksCriteria example) {
        MapperFactory.getUcUserPhonebooksMapper().updateByExample(record, example);
    }

    @Override
    public void deleteUserPhoneBooksInfo(UcUserPhonebooksCriteria example) {
        MapperFactory.getUcUserPhonebooksMapper().deleteByExample(example);
    }

    @Override
    public List<UcUserPhonebooks> selectUcTelGroupInfo(UcUserPhonebooksCriteria example
            ) {
        List<UcUserPhonebooks> list = MapperFactory.getUcUserPhonebooksMapper().selectByExample(example);
        return list;
    }

    @Override
    public int countUcTelGroupInfo(UcUserPhonebooksCriteria example) {
        return MapperFactory.getUcUserPhonebooksMapper().countByExample(example);
    }


}
