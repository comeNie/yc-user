package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.UsrCompanyAdminChange;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyAdminChangeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrCompanyAdminChangeMapper {
    int countByExample(UsrCompanyAdminChangeCriteria example);

    int deleteByExample(UsrCompanyAdminChangeCriteria example);

    int deleteByPrimaryKey(String adminChangeId);

    int insert(UsrCompanyAdminChange record);

    int insertSelective(UsrCompanyAdminChange record);

    List<UsrCompanyAdminChange> selectByExample(UsrCompanyAdminChangeCriteria example);

    UsrCompanyAdminChange selectByPrimaryKey(String adminChangeId);

    int updateByExampleSelective(@Param("record") UsrCompanyAdminChange record, @Param("example") UsrCompanyAdminChangeCriteria example);

    int updateByExample(@Param("record") UsrCompanyAdminChange record, @Param("example") UsrCompanyAdminChangeCriteria example);

    int updateByPrimaryKeySelective(UsrCompanyAdminChange record);

    int updateByPrimaryKey(UsrCompanyAdminChange record);
}