package com.ai.slp.user.api.contactsinfo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.user.api.contactsinfo.interfaces.IUcContactsInfoSV;
import com.ai.slp.user.api.contactsinfo.param.InsertContactsInfoRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class ContactInfoTest {

    @Autowired
    IUcContactsInfoSV iu;
    @Test
    public void test()
    {
        InsertContactsInfoRequest re = new InsertContactsInfoRequest();
        re.setTenantId("SLP");
        re.setUserId("123");
        re.setContactCertNum("11");
        iu.insertContactsInfo(re);
    }
}
