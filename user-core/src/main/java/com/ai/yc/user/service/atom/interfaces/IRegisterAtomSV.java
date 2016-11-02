package com.ai.yc.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.yc.user.dao.mapper.bo.UcContactsInfo;
import com.ai.yc.user.dao.mapper.bo.UcContactsInfoCriteria;
import com.ai.yc.user.dao.mapper.bo.UcCustKeyInfo;
import com.ai.yc.user.dao.mapper.bo.UcCustKeyInfoCriteria;
import com.ai.yc.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.yc.user.dao.mapper.bo.UcGroupKeyInfoCriteria;
import com.ai.yc.user.dao.mapper.bo.UcUser;
import com.ai.yc.user.dao.mapper.bo.UcUserCriteria;


public interface IRegisterAtomSV {
    // 用户
    public int insertUserInfo(UcUser user);

    public List<UcUser> getUserInfo(UcUserCriteria criteria);

    int updateUserInfo(@Param("record") UcUser record,
            @Param("example") UcUserCriteria example);

    // 企业认证
    public int insertUcGroupKeyInfo(UcGroupKeyInfo ucGroupKey);

    public List<UcGroupKeyInfo> getUcGroupKeyInfo(UcGroupKeyInfoCriteria criteria);
    
    public List<UcCustKeyInfo> getUcCustKeyInfo(UcCustKeyInfoCriteria  criteria);
    
    public List<UcContactsInfo> getUcContactsInfo(UcContactsInfoCriteria  criteria);
    
    int updateGroupKeyInfo(@Param("record") UcGroupKeyInfo record,
            @Param("example") UcGroupKeyInfoCriteria example);


    // 用户联系人
    public int insertUcContactsInfo(UcContactsInfo ucContactsInfo);
    // 个人客户关系信息
    public int insertUcCustKeyInfo(UcCustKeyInfo ucContactsInfo);
    
    int updateCustKeyInfo(@Param("record") UcCustKeyInfo record,
            @Param("example") UcCustKeyInfoCriteria example);


}
