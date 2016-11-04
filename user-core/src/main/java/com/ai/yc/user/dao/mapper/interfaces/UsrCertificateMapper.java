package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.UsrCertificate;
import com.ai.yc.user.dao.mapper.bo.UsrCertificateCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrCertificateMapper {
    int countByExample(UsrCertificateCriteria example);

    int deleteByExample(UsrCertificateCriteria example);

    int deleteByPrimaryKey(String certificateId);

    int insert(UsrCertificate record);

    int insertSelective(UsrCertificate record);

    List<UsrCertificate> selectByExample(UsrCertificateCriteria example);

    UsrCertificate selectByPrimaryKey(String certificateId);

    int updateByExampleSelective(@Param("record") UsrCertificate record, @Param("example") UsrCertificateCriteria example);

    int updateByExample(@Param("record") UsrCertificate record, @Param("example") UsrCertificateCriteria example);

    int updateByPrimaryKeySelective(UsrCertificate record);

    int updateByPrimaryKey(UsrCertificate record);
}