package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.UsrGriwthValue;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValueCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrGriwthValueMapper {
    int countByExample(UsrGriwthValueCriteria example);

    int deleteByExample(UsrGriwthValueCriteria example);

    int deleteByPrimaryKey(String recordId);

    int insert(UsrGriwthValue record);

    int insertSelective(UsrGriwthValue record);

    List<UsrGriwthValue> selectByExample(UsrGriwthValueCriteria example);

    UsrGriwthValue selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") UsrGriwthValue record, @Param("example") UsrGriwthValueCriteria example);

    int updateByExample(@Param("record") UsrGriwthValue record, @Param("example") UsrGriwthValueCriteria example);

    int updateByPrimaryKeySelective(UsrGriwthValue record);

    int updateByPrimaryKey(UsrGriwthValue record);
}