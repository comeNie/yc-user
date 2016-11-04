package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.UsrEducation;
import com.ai.yc.user.dao.mapper.bo.UsrEducationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrEducationMapper {
    int countByExample(UsrEducationCriteria example);

    int deleteByExample(UsrEducationCriteria example);

    int deleteByPrimaryKey(Long educationId);

    int insert(UsrEducation record);

    int insertSelective(UsrEducation record);

    List<UsrEducation> selectByExample(UsrEducationCriteria example);

    UsrEducation selectByPrimaryKey(Long educationId);

    int updateByExampleSelective(@Param("record") UsrEducation record, @Param("example") UsrEducationCriteria example);

    int updateByExample(@Param("record") UsrEducation record, @Param("example") UsrEducationCriteria example);

    int updateByPrimaryKeySelective(UsrEducation record);

    int updateByPrimaryKey(UsrEducation record);
}