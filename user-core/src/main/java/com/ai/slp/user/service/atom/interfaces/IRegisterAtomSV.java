package com.ai.slp.user.service.atom.interfaces;

import java.util.List;

import com.ai.slp.user.dao.mapper.bo.UcUser;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;

public interface IRegisterAtomSV {
    public int insertUserInfo(UcUser user);
    public List<UcUser> getUserInfo(UcUserCriteria criteria);
}
