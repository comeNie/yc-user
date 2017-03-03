package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.UsrCompany;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrCompanyMapper {
    int countByExample(UsrCompanyCriteria example);

    int deleteByExample(UsrCompanyCriteria example);

    int deleteByPrimaryKey(String companyId);

    int insert(UsrCompany record);

    int insertSelective(UsrCompany record);

    List<UsrCompany> selectByExample(UsrCompanyCriteria example);

    UsrCompany selectByPrimaryKey(String companyId);

    int updateByExampleSelective(@Param("record") UsrCompany record, @Param("example") UsrCompanyCriteria example);

    int updateByExample(@Param("record") UsrCompany record, @Param("example") UsrCompanyCriteria example);

    int updateByPrimaryKeySelective(UsrCompany record);

    int updateByPrimaryKey(UsrCompany record);
}