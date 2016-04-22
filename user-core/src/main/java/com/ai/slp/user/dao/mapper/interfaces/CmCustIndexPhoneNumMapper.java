package com.ai.slp.user.dao.mapper.interfaces;

import com.ai.slp.user.dao.mapper.bo.CmCustIndexPhoneNum;
import com.ai.slp.user.dao.mapper.bo.CmCustIndexPhoneNumCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmCustIndexPhoneNumMapper {
    int countByExample(CmCustIndexPhoneNumCriteria example);

    int deleteByExample(CmCustIndexPhoneNumCriteria example);

    int deleteByPrimaryKey(Long custId);

    int insert(CmCustIndexPhoneNum record);

    int insertSelective(CmCustIndexPhoneNum record);

    List<CmCustIndexPhoneNum> selectByExample(CmCustIndexPhoneNumCriteria example);

    CmCustIndexPhoneNum selectByPrimaryKey(Long custId);

    int updateByExampleSelective(@Param("record") CmCustIndexPhoneNum record, @Param("example") CmCustIndexPhoneNumCriteria example);

    int updateByExample(@Param("record") CmCustIndexPhoneNum record, @Param("example") CmCustIndexPhoneNumCriteria example);

    int updateByPrimaryKeySelective(CmCustIndexPhoneNum record);

    int updateByPrimaryKey(CmCustIndexPhoneNum record);
}