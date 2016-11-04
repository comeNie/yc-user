package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.UsrTranslator;
import com.ai.yc.user.dao.mapper.bo.UsrTranslatorCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrTranslatorMapper {
    int countByExample(UsrTranslatorCriteria example);

    int deleteByExample(UsrTranslatorCriteria example);

    int deleteByPrimaryKey(String userId);

    int insert(UsrTranslator record);

    int insertSelective(UsrTranslator record);

    List<UsrTranslator> selectByExample(UsrTranslatorCriteria example);

    UsrTranslator selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UsrTranslator record, @Param("example") UsrTranslatorCriteria example);

    int updateByExample(@Param("record") UsrTranslator record, @Param("example") UsrTranslatorCriteria example);

    int updateByPrimaryKeySelective(UsrTranslator record);

    int updateByPrimaryKey(UsrTranslator record);
}