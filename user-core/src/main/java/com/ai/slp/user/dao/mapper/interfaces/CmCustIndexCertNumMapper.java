package com.ai.slp.user.dao.mapper.interfaces;

import com.ai.slp.user.dao.mapper.bo.CmCustIndexCertNum;
import com.ai.slp.user.dao.mapper.bo.CmCustIndexCertNumCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmCustIndexCertNumMapper {
    int countByExample(CmCustIndexCertNumCriteria example);

    int deleteByExample(CmCustIndexCertNumCriteria example);

    int deleteByPrimaryKey(Long custId);

    int insert(CmCustIndexCertNum record);

    int insertSelective(CmCustIndexCertNum record);

    List<CmCustIndexCertNum> selectByExample(CmCustIndexCertNumCriteria example);

    CmCustIndexCertNum selectByPrimaryKey(Long custId);

    int updateByExampleSelective(@Param("record") CmCustIndexCertNum record, @Param("example") CmCustIndexCertNumCriteria example);

    int updateByExample(@Param("record") CmCustIndexCertNum record, @Param("example") CmCustIndexCertNumCriteria example);

    int updateByPrimaryKeySelective(CmCustIndexCertNum record);

    int updateByPrimaryKey(CmCustIndexCertNum record);
}