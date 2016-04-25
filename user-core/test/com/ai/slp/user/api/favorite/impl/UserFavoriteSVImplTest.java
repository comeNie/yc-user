package com.ai.slp.user.api.favorite.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.favorite.interfaces.IUserFavoriteSV;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteResponse;
import com.ai.slp.user.api.favorite.param.DeleteFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UcUserFavoriteParams;
import com.ai.slp.user.api.favorite.param.UserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UserFavoriteResponse;
import com.ai.slp.user.api.login.impl.LoginSVImplTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class UserFavoriteSVImplTest {

    private static final Log LOG = LogFactory.getLog(LoginSVImplTest.class);

    @Autowired
    private IUserFavoriteSV iUserFavoriteSV;

    //@Test
    public void createUserFavoriteTest() {
        CreateUserFavoriteRequest request = new CreateUserFavoriteRequest();
        request.setTenantId("test111");
        request.setUserId(111);
        request.setTenantPwd("123456");
        request.setFavoriteType("01");
        request.setFavoriteRelId("1234");
        CreateUserFavoriteResponse response = new CreateUserFavoriteResponse();
        response = iUserFavoriteSV.insertUcFavorite(request);
        System.out.println(response.getResponseId());
    }

    @Test
    public void updateUserFavoriteTest() {
        UcUserFavoriteParams userFavorite = new UcUserFavoriteParams();
        userFavorite.setUserId(111);
        userFavorite.setTenantId("test111");
        userFavorite.setTenantPwd("123456");
        userFavorite.setFavoriteType("00");
        userFavorite.setFavoriteRelId("1234");
        userFavorite.setFavoriteSeqId("222");
        userFavorite.setState("1");
        LOG.info("开始更新了");
        iUserFavoriteSV.updateFavorite(userFavorite);
    }

    //@Test
    public void deleteFavoriteSVImplTest() {
        DeleteFavoriteRequest request = new DeleteFavoriteRequest();
        request.setTenantId("test111");
        request.setUserId(111);
        request.setFavoriteReqId("222");
        request.setTenantPwd("123456");
        iUserFavoriteSV.deleteFavorite(request);
    }
    
    //@Test
    public void  queryFavoriteSVImplTest(){
        UserFavoriteRequest request = new UserFavoriteRequest();
        request.setTenantId("test111");
        request.setTenantPwd("123456");
        request.setUserId(111);
        request.setFavoriteSeqId("222");
        request.setPageNo(11);
        request.setPageSize(11);;
        PageInfo<UserFavoriteResponse> pageInfo = new PageInfo<UserFavoriteResponse>();
        pageInfo = iUserFavoriteSV.queryFavorite(request);
        System.out.println(pageInfo.getPageCount());
        System.out.println(pageInfo.getResult().size());
    }
}
