package com.ai.slp.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.slp.user.api.ucuser.param.SearchUserInfoRequest;
import com.ai.slp.user.api.ucuser.param.SearchUserInfoResponse;
import com.ai.slp.user.api.ucuser.param.UcUserInfoParams;
import com.ai.slp.user.dao.mapper.bo.UcUser;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;
import com.ai.slp.user.service.atom.interfaces.IUcUserAtomSV;
import com.ai.slp.user.service.business.interfaces.IUcUserBusiSV;
import com.ai.slp.user.util.DateUtils;

/**
 * 登录服务 Date: 2016年4月22日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
@Service
@Transactional
public class UcUserBusiSVImpl implements IUcUserBusiSV {

    static final Log LOG = LogFactory.getLog(UcUserBusiSVImpl.class);

    @Autowired
    private IUcUserAtomSV ucUserAtomSV;

    @Override
    public SearchUserInfoResponse searchUserInfo(SearchUserInfoRequest userInfoRequest) {

        UcUserCriteria example = new UcUserCriteria();
        UcUserCriteria.Criteria criteria = example.createCriteria();

        criteria.andTenantIdEqualTo(userInfoRequest.getTenantId());

        if (!StringUtils.isBlank(userInfoRequest.getUserLoginName())){
            criteria.andUserLoginNameEqualTo(userInfoRequest.getUserLoginName());
        }
        if (!StringUtils.isBlank(userInfoRequest.getUserLoginName())) {
            criteria.andUserLoginNameEqualTo(userInfoRequest.getUserLoginName());
        }
        if (!StringUtils.isBlank(userInfoRequest.getUserMp())) {
            criteria.andUserMpEqualTo(userInfoRequest.getUserMp());
        }
        if (!StringUtils.isBlank(userInfoRequest.getUserEmail())) {
            criteria.andUserEmailEqualTo(userInfoRequest.getUserEmail());
        }
        if (!StringUtils.isBlank(userInfoRequest.getVipLevel())) {
            criteria.andVipLevelEqualTo(userInfoRequest.getVipLevel());
        }
        if (!StringUtils.isBlank(userInfoRequest.getRegisterSource())) {
            criteria.andRegisterSourceEqualTo(userInfoRequest.getRegisterSource());
        }
        if (!StringUtils.isBlank(userInfoRequest.getUserState())) {
            criteria.andUserStateEqualTo(userInfoRequest.getUserState());
        }
        if ((userInfoRequest.getBeginTime()!=null)
                && (userInfoRequest.getEndTime()!=null)) {
            criteria.andCreateTimeBetween(
                    DateUtils.getTimestamp(userInfoRequest.getBeginTime(), "yyyy-MM-dd HH:mm:ss"),
                    DateUtils.getTimestamp(userInfoRequest.getEndTime(), "yyyy-MM-dd HH:mm:ss"));
        }

        List<UcUser> list = new ArrayList<UcUser>();
        ResponseHeader responseHeader;
        Integer pageNo = userInfoRequest.getPageNo();
        Integer pageSize = userInfoRequest.getPageSize();
        int count = 0;
        try {
            count = ucUserAtomSV.countByExample(example);
            list = ucUserAtomSV.searchUcUserInfo(example);
            responseHeader = new ResponseHeader(true, "success", "查询成功");
        } catch (Exception e) {
            LOG.error("查询失败");
            responseHeader = new ResponseHeader(false, "fail", "查询失败");
        }
        List<UcUserInfoParams> responseList = new ArrayList<UcUserInfoParams>();
        for (UcUser user : list) {
            UcUserInfoParams ucUserInfoParams = new UcUserInfoParams();
            BeanUtils.copyProperties(user, ucUserInfoParams);
            responseList.add(ucUserInfoParams);
        }
        PageInfo<UcUserInfoParams> pageInfo = new PageInfo<UcUserInfoParams>();
        SearchUserInfoResponse response = new SearchUserInfoResponse();
        pageInfo.setCount(count);
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
        pageInfo.setResult(responseList);
        response.setPageInfo(pageInfo);
        response.setResponseHeader(responseHeader);
        return response;
    }

}
