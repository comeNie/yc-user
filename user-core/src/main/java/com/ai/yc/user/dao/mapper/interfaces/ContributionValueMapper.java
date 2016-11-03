package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.ContributionValue;
import com.ai.yc.user.dao.mapper.bo.ContributionValueCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContributionValueMapper {
    int countByExample(ContributionValueCriteria example);

    int deleteByExample(ContributionValueCriteria example);

    int deleteByPrimaryKey(String recordId);

    int insert(ContributionValue record);

    int insertSelective(ContributionValue record);

    List<ContributionValue> selectByExample(ContributionValueCriteria example);

    ContributionValue selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") ContributionValue record, @Param("example") ContributionValueCriteria example);

    int updateByExample(@Param("record") ContributionValue record, @Param("example") ContributionValueCriteria example);

    int updateByPrimaryKeySelective(ContributionValue record);

    int updateByPrimaryKey(ContributionValue record);
}