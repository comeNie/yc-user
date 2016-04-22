package com.ai.slp.user.dao.mapper.interfaces;

import com.ai.slp.user.dao.mapper.bo.UcUserPhonebooks;
import com.ai.slp.user.dao.mapper.bo.UcUserPhonebooksCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcUserPhonebooksMapper {
    int countByExample(UcUserPhonebooksCriteria example);

    int deleteByExample(UcUserPhonebooksCriteria example);

    int insert(UcUserPhonebooks record);

    int insertSelective(UcUserPhonebooks record);

    List<UcUserPhonebooks> selectByExample(UcUserPhonebooksCriteria example);

    int updateByExampleSelective(@Param("record") UcUserPhonebooks record, @Param("example") UcUserPhonebooksCriteria example);

    int updateByExample(@Param("record") UcUserPhonebooks record, @Param("example") UcUserPhonebooksCriteria example);
}