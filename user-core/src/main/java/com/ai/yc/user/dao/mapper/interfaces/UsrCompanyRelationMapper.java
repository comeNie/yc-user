package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelation;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrCompanyRelationMapper {
    int countByExample(UsrCompanyRelationCriteria example);

    int deleteByExample(UsrCompanyRelationCriteria example);

    int deleteByPrimaryKey(String relationId);

    int insert(UsrCompanyRelation record);

    int insertSelective(UsrCompanyRelation record);

    List<UsrCompanyRelation> selectByExample(UsrCompanyRelationCriteria example);

    UsrCompanyRelation selectByPrimaryKey(String relationId);

    int updateByExampleSelective(@Param("record") UsrCompanyRelation record, @Param("example") UsrCompanyRelationCriteria example);

    int updateByExample(@Param("record") UsrCompanyRelation record, @Param("example") UsrCompanyRelationCriteria example);

    int updateByPrimaryKeySelective(UsrCompanyRelation record);

    int updateByPrimaryKey(UsrCompanyRelation record);
}