package com.ai.yc.user.dao.mapper.interfaces;

import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslation;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrCollectionTranslationMapper {
    int countByExample(UsrCollectionTranslationCriteria example);

    int deleteByExample(UsrCollectionTranslationCriteria example);

    int deleteByPrimaryKey(String collectionId);

    int insert(UsrCollectionTranslation record);

    int insertSelective(UsrCollectionTranslation record);

    List<UsrCollectionTranslation> selectByExample(UsrCollectionTranslationCriteria example);

    UsrCollectionTranslation selectByPrimaryKey(String collectionId);

    int updateByExampleSelective(@Param("record") UsrCollectionTranslation record, @Param("example") UsrCollectionTranslationCriteria example);

    int updateByExample(@Param("record") UsrCollectionTranslation record, @Param("example") UsrCollectionTranslationCriteria example);

    int updateByPrimaryKeySelective(UsrCollectionTranslation record);

    int updateByPrimaryKey(UsrCollectionTranslation record);
}