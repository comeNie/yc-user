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
import com.ai.slp.user.api.register.param.SearchUcUserParams;
import com.ai.slp.user.api.register.param.UcUserParams;
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
    public PageInfo<SearchUcUserParams> searchUserInfo(UcUserParams ucUser) {

        UcUserCriteria example = new UcUserCriteria();
        UcUserCriteria.Criteria criteria = example.createCriteria();

        criteria.andTenantIdEqualTo(ucUser.getTenantId());

        if (ucUser.getUserId()!=0) {
            criteria.andUserIdEqualTo(ucUser.getUserId());
        }
        if (!StringUtils.isBlank(ucUser.getUserLoginName())) {
            criteria.andUserLoginNameEqualTo(ucUser.getUserLoginName());
        }
        if (!StringUtils.isBlank(ucUser.getUserMp())) {
            criteria.andUserMpEqualTo(ucUser.getUserMp());
        }
        if (!StringUtils.isBlank(ucUser.getUserEmail())) {
            criteria.andUserEmailEqualTo(ucUser.getUserEmail());
        }
        if (!StringUtils.isBlank(ucUser.getVipLevel())) {
            criteria.andVipLevelEqualTo(ucUser.getVipLevel());
        }
        if (!StringUtils.isBlank(ucUser.getRegisterSource())) {
            criteria.andRegisterSourceEqualTo(ucUser.getRegisterSource());
        }
        if (!StringUtils.isBlank(ucUser.getUserState())) {
            criteria.andUserStateEqualTo(ucUser.getUserState());
        }
        if ((ucUser.getBeginTime()!=null)
                && (ucUser.getEndTime()!=null)) {
            criteria.andCreateTimeBetween(
                    DateUtils.getTimestamp(ucUser.getBeginTime(), "yyyy-MM-dd HH:mm:ss"),
                    DateUtils.getTimestamp(ucUser.getEndTime(), "yyyy-MM-dd HH:mm:ss"));
        }

        List<UcUser> list = new ArrayList<UcUser>();
        ResponseHeader responseHeader;
        Integer pageNo = ucUser.getPageNo();
        Integer pageSize = ucUser.getPageSize();
        int count = 0;
        try {
            count = ucUserAtomSV.countByExample(example);
            list = ucUserAtomSV.searchUcUserInfo(example);
            responseHeader = new ResponseHeader(true, "success", "查询成功");
        } catch (Exception e) {
            LOG.error("查询失败");
            responseHeader = new ResponseHeader(false, "fail", "查询失败");
        }
        List<SearchUcUserParams> responseList = new ArrayList<SearchUcUserParams>();
        SearchUcUserParams response = new SearchUcUserParams();
        for (UcUser user : list) {
            BeanUtils.copyProperties(user, response);
            responseList.add(response);
        }
        PageInfo<SearchUcUserParams> pageInfo = new PageInfo<SearchUcUserParams>();
        response.setResponseHeader(responseHeader);
        pageInfo.setCount(count);
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
        pageInfo.setResult(responseList);
        return pageInfo;
    }

}
