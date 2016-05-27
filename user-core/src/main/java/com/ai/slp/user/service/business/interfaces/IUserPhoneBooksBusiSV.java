package com.ai.slp.user.service.business.interfaces;

import java.util.List;

import com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroup;
import com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroupMantainReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksBatchData;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksModifyReq;

public interface IUserPhoneBooksBusiSV {

    void addUcTelGroup(UcTelGroupMantainReq req);

    void modifyUcTelGroup(UcTelGroupMantainReq req);

    void deleteUcTelGroup(UcTelGroupMantainReq req);

    List<UcTelGroup> getUcTelGroups(String userId);

    void batchDeleteUserPhonebooks(List<String> recordIds);

    void batchAddUserPhonebooks(List<UcUserPhonebooksBatchData> datas);

    void modifyUserPhonebook(UcUserPhonebooksModifyReq req);

}
