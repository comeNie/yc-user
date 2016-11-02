package com.ai.yc.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.yc.user.dao.mapper.bo.UcUserMessage;
import com.ai.yc.user.dao.mapper.bo.UcUserMessageCriteria;


public interface IUserMessageAtomSV {

    int deleteByExample(UcUserMessageCriteria example);

    int insert(UcUserMessage record);

    int updateByExampleSelective(@Param("record") UcUserMessage record,
            @Param("example") UcUserMessageCriteria example);

    List<UcUserMessage> selectByExample(UcUserMessageCriteria example);

    int countByExample(UcUserMessageCriteria example);
}
