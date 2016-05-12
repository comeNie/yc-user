package com.ai.slp.user.dao.mapper.factory;

import javax.annotation.PostConstruct;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.slp.user.dao.mapper.interfaces.UcApiInfoMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcBankInfoMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcContactsInfoMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcCustKeyInfoMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcGroupKeyInfoMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcLoginLogMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcSpecialInfoMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcStateChgMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcTelGroupMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcUserAgreeMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcUserFavoriteMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcUserMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcUserMessageMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcUserPhonebooksMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcUserSafariHisMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcUserSafariMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcUserSubsMapper;

@Component
public class MapperFactory {
 
    @Autowired
    private SqlSessionTemplate st;
    
    private static SqlSessionTemplate sqlSessionTemplate;

    @PostConstruct
    void init() {
        setSqlSessionTemplate(st);
    }
    
    public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        MapperFactory.sqlSessionTemplate = sqlSessionTemplate;
    }
    
    public static UcApiInfoMapper getUcApiInfoMapper() {
        return sqlSessionTemplate.getMapper(UcApiInfoMapper.class);
    }
    
    public static UcBankInfoMapper getUcBankInfoMapper() {
        return sqlSessionTemplate.getMapper(UcBankInfoMapper.class);
    }
    
    public static UcCustKeyInfoMapper getUcCustKeyInfoMapper() {
        return sqlSessionTemplate.getMapper(UcCustKeyInfoMapper.class);
    }
    
    public static UcLoginLogMapper getUcLoginLogMapper() {
        return sqlSessionTemplate.getMapper(UcLoginLogMapper.class);
    }
    
    public static UcSpecialInfoMapper getUcSpecialInfoMapper() {
        return sqlSessionTemplate.getMapper(UcSpecialInfoMapper.class);
    }
    
    public static UcStateChgMapper getUcStateChgMapper() {
        return sqlSessionTemplate.getMapper(UcStateChgMapper.class);
    }
    
    public static UcTelGroupMapper getUcTelGroupMapper() {
        return sqlSessionTemplate.getMapper(UcTelGroupMapper.class);
    }
    
    public static UcUserAgreeMapper getUcUserAgreeMapper() {
        return sqlSessionTemplate.getMapper(UcUserAgreeMapper.class);
    }
    
    public static UcUserFavoriteMapper getUcUserFavoriteMapper() {
        return sqlSessionTemplate.getMapper(UcUserFavoriteMapper.class);
    }
    
    public static UcUserMapper getUcUserMapper() {
        return sqlSessionTemplate.getMapper(UcUserMapper.class);
    }
    
    public static UcUserMessageMapper getUcUserMessageMapper() {
        return sqlSessionTemplate.getMapper(UcUserMessageMapper.class);
    }
    
    public static UcUserPhonebooksMapper getUcUserPhonebooksMapper() {
        return sqlSessionTemplate.getMapper(UcUserPhonebooksMapper.class);
    }
    
    public static UcUserSafariHisMapper getUcUserSafariHisMapper() {
        return sqlSessionTemplate.getMapper(UcUserSafariHisMapper.class);
    }
    
    public static UcUserSafariMapper getUcUserSafariMapper() {
        return sqlSessionTemplate.getMapper(UcUserSafariMapper.class);
    }
    
    public static UcUserSubsMapper getUcUserSubsMapper() {
        return sqlSessionTemplate.getMapper(UcUserSubsMapper.class);
    }
    
    public static UcGroupKeyInfoMapper getUcGroupKeyInfoMapper(){
        return sqlSessionTemplate.getMapper(UcGroupKeyInfoMapper.class);
    }
    
    public static UcContactsInfoMapper getUcContactsInfoMapper(){
        return sqlSessionTemplate.getMapper(UcContactsInfoMapper.class);
    }
}
