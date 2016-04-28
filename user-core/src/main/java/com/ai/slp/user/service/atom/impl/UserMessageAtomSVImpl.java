package com.ai.slp.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.bo.UcUserMessage;
import com.ai.slp.user.dao.mapper.bo.UcUserMessageCriteria;
import com.ai.slp.user.dao.mapper.factory.MapperFactory;
import com.ai.slp.user.service.atom.interfaces.IUserMessageAtomSV;

@Component
public class UserMessageAtomSVImpl implements IUserMessageAtomSV {

    @Override
    public int deleteByExample(UcUserMessageCriteria example) {
        return MapperFactory.getUcUserMessageMapper().deleteByExample(example);
    }

    @Override
    public int insert(UcUserMessage record) {
        return MapperFactory.getUcUserMessageMapper().insert(record);
    }

    @Override
    public int updateByExampleSelective(UcUserMessage record, UcUserMessageCriteria example) {
        return MapperFactory.getUcUserMessageMapper().updateByExampleSelective(record, example);
    }

    @Override
    public List<UcUserMessage> selectByExample(UcUserMessageCriteria example) {
        return MapperFactory.getUcUserMessageMapper().selectByExample(example);
    }

    @Override
    public int countByExample(UcUserMessageCriteria example) {
        return MapperFactory.getUcUserMessageMapper().countByExample(example);
    }

}
