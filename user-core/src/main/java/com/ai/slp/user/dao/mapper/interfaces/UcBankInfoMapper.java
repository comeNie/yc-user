package com.ai.slp.user.dao.mapper.interfaces;

import com.ai.slp.user.dao.mapper.bo.UcBankInfo;
import com.ai.slp.user.dao.mapper.bo.UcBankInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcBankInfoMapper {
    int countByExample(UcBankInfoCriteria example);

    int deleteByExample(UcBankInfoCriteria example);

    int insert(UcBankInfo record);

    int insertSelective(UcBankInfo record);

    List<UcBankInfo> selectByExample(UcBankInfoCriteria example);

    int updateByExampleSelective(@Param("record") UcBankInfo record, @Param("example") UcBankInfoCriteria example);

    int updateByExample(@Param("record") UcBankInfo record, @Param("example") UcBankInfoCriteria example);
}