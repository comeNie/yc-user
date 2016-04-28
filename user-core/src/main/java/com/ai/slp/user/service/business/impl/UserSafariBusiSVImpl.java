package com.ai.slp.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.user.api.safari.param.CreateUserSafariRequest;
import com.ai.slp.user.api.safari.param.CreateUserSafariResponse;
import com.ai.slp.user.api.safari.param.DeleteSafariHisRequest;
import com.ai.slp.user.api.safari.param.DeleteSafariRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoResponse;
import com.ai.slp.user.dao.mapper.bo.UcUserSafari;
import com.ai.slp.user.dao.mapper.bo.UcUserSafariCriteria;
import com.ai.slp.user.dao.mapper.bo.UcUserSafariHisCriteria;
import com.ai.slp.user.service.atom.interfaces.IUserSafariAtomSV;
import com.ai.slp.user.service.atom.interfaces.IUserSafariHisAtomSV;
import com.ai.slp.user.service.business.interfaces.IUserSafariBusiSV;
import com.ai.slp.user.util.DateUtils;
import com.alibaba.dubbo.common.utils.StringUtils;

@Service
@Transactional
public class UserSafariBusiSVImpl implements IUserSafariBusiSV {
    private final static Log LOG = LogFactory.getLog(UserSafariBusiSVImpl.class);

    @Autowired
    private IUserSafariAtomSV userSafariAtomSV;

    @Autowired
    private IUserSafariHisAtomSV userSafariHisAtomSV;

    @Override
    public CreateUserSafariResponse insertUserSafari(CreateUserSafariRequest request)
            throws BusinessException, SystemException {
        UcUserSafari ucUserSafari = new UcUserSafari();
        ucUserSafari.setTenantId(request.getTenantId());
        ucUserSafari.setUserId(Long.parseLong(request.getUserId().toString()));
        ucUserSafari.setProdId(request.getProdId());
        ucUserSafari.setState("1");
        ucUserSafari.setSafariTime(DateUtils.currTimeStamp());
        int responseId = userSafariAtomSV.insert(ucUserSafari);
        CreateUserSafariResponse response = new CreateUserSafariResponse();
        response.setResponseId(responseId);
        return response;
    }

    @Override
    public void deleteUserSafari(DeleteSafariRequest deleteRequest)
            throws BusinessException, SystemException {
        UcUserSafariCriteria example = new UcUserSafariCriteria();
        UcUserSafariCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(deleteRequest.getTenantId());
        criteria.andUserIdEqualTo(Long.parseLong(deleteRequest.getUserId().toString()));

        // UcUserSafariHis safariHis = new UcUserSafariHis();
        // 浏览历史表
        if (!StringUtil.isBlank(deleteRequest.getDeleteCode())) {
            updateSafariSingle(example);
        } else {
            if (StringUtil.isBlank(deleteRequest.getDateTime())) {
                criteria.andProdIdEqualTo(deleteRequest.getProdId());
            } else {
                String beginTime = deleteRequest.getDateTime() + " 00:00:00";
                String endTime = deleteRequest.getDateTime() + " 23:59:59";
                criteria.andSafariTimeBetween(
                        DateUtils.getTimestamp(beginTime, "yyyy-MM-dd HH:mm:ss"),
                        DateUtils.getTimestamp(endTime, "yyyy-MM-dd HH:mm:ss"));
            }
            updateSafariSingle(example);
        }
    }

    public void updateSafariSingle(UcUserSafariCriteria example) {
        try {
            UcUserSafari record = new UcUserSafari();
            record.setState("0");
            userSafariAtomSV.updateByExampleSelective(record, example);
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error("更新失败");
        }
    }

    @Override
    public PageInfo<UserSafariInfoResponse> queryUserSafari(UserSafariInfoRequest request)
            throws BusinessException, SystemException {
        UcUserSafariCriteria example = new UcUserSafariCriteria();
        UcUserSafariCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(request.getTenantId());
        criteria.andUserIdEqualTo(Long.parseLong(request.getUserId().toString()));
        // criteria.andSafariTimeBetween(value1, value2);
        PageInfo<UserSafariInfoResponse> pageInfo = new PageInfo<UserSafariInfoResponse>();
        List<UcUserSafari> queryList = new ArrayList<UcUserSafari>();
        List<UserSafariInfoResponse> responseList = new ArrayList<UserSafariInfoResponse>();

        Integer pageNo = request.getPageNo();
        Integer pageSize = request.getPageSize();
        int count = userSafariAtomSV.countByExample(example);
        queryList = userSafariAtomSV.selectByExample(example);
        UserSafariInfoResponse response = new UserSafariInfoResponse();
        for (UcUserSafari ucUserSafari : queryList) {
            BeanUtils.copyProperties(ucUserSafari, response);
            responseList.add(response);
        }
        pageInfo.setCount(count);
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
        pageInfo.setResult(responseList);
        return pageInfo;
    }

    @Override
    public void deleteUserSafariHis(DeleteSafariHisRequest deleteRequest)
            throws BusinessException, SystemException {
        UcUserSafariHisCriteria example = new UcUserSafariHisCriteria();
        UcUserSafariHisCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(deleteRequest.getTenantId());
        criteria.andUserIdEqualTo(Long.parseLong(deleteRequest.getUserId().toString()));
        criteria.andSafariSeqIdIn(deleteRequest.getSafariHisIdList());
        userSafariHisAtomSV.deleteByExample(example);
    }
}
