package com.ai.slp.user.api.phonebook;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.paas.ipaas.util.JSonUtil;
import com.ai.slp.user.api.ucuserphonebooks.interfaces.IUserPhoneBooksSV;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksBatchAddReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksBatchAddResp;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksBatchData;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class PhoneBookSVTest {

    @Autowired
    private IUserPhoneBooksSV phoneBookSV;

    @Test
    public void searchUserTest() {
        UcUserPhonebooksBatchAddReq req = new UcUserPhonebooksBatchAddReq();
        req.setTenantId("SLP");
        List<UcUserPhonebooksBatchData> datas=new LinkedList<UcUserPhonebooksBatchData>();
        UcUserPhonebooksBatchData phonebooksBatchData = new UcUserPhonebooksBatchData();
        phonebooksBatchData.setTelGroupId("62");
        phonebooksBatchData.setTelMp("18701179658");
        phonebooksBatchData.setTelName("张bbb");
        phonebooksBatchData.setUserId("000000000000000480");
        phonebooksBatchData.setTenantId("SLP");
        datas.add(phonebooksBatchData);
        UcUserPhonebooksBatchData phonebooksBatchData2 = new UcUserPhonebooksBatchData();
        phonebooksBatchData2.setTelGroupId("62");
        phonebooksBatchData2.setTelMp("18701176559");
        phonebooksBatchData2.setTelName("张aaa");
        phonebooksBatchData2.setUserId("000000000000000480");
        phonebooksBatchData2.setTenantId("SLP");
        datas.add(phonebooksBatchData2);
		req.setDatas(datas);
		UcUserPhonebooksBatchAddResp batchAddUserPhonebooks = phoneBookSV.batchAddUserPhonebooks(req);
		System.out.println(JSonUtil.toJSon(batchAddUserPhonebooks));
    }
}
