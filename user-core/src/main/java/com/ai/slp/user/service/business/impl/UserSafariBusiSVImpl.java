package com.ai.slp.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.safari.param.CreateUserSafariRequest;
import com.ai.slp.user.api.safari.param.CreateUserSafariResponse;
import com.ai.slp.user.api.safari.param.DeleteSafariRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoResponse;
import com.ai.slp.user.dao.mapper.bo.UcUserSafari;
import com.ai.slp.user.dao.mapper.bo.UcUserSafariCriteria;
import com.ai.slp.user.service.atom.interfaces.IUserSafariAtomSV;
import com.ai.slp.user.service.business.interfaces.IUserSafariBusiSV;
import com.ai.slp.user.util.DateUtils;

@Service
@Transactional
public class UserSafariBusiSVImpl implements IUserSafariBusiSV {
    private final static Log LOG = LogFactory.getLog(UserSafariBusiSVImpl.class);

    @Autowired
    private IUserSafariAtomSV iUserSafariAtomSV;

    @Override
    public CreateUserSafariResponse insertUserSafari(CreateUserSafariRequest request)
            throws BusinessException, SystemException {
        UcUserSafari ucUserSafari = new UcUserSafari();
        ucUserSafari.setTenantId(request.getTenantId());
        ucUserSafari.setUserId(Long.parseLong(request.getUserId().toString()));
        ucUserSafari.setProdId(request.getProdId());
        ucUserSafari.setState("1");
        ucUserSafari.setSafariTime(DateUtils.currTimeStamp());
        int responseId = iUserSafariAtomSV.insert(ucUserSafari);
        CreateUserSafariResponse response = new CreateUserSafariResponse();
        response.setResponseId(responseId);
        return response;
    }

    @Override
    public void deleteUserSafari(DeleteSafariRequest deleteSafariRequest)
            throws BusinessException, SystemException {
        UcUserSafariCriteria example = new UcUserSafariCriteria();
        UcUserSafariCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(deleteSafariRequest.getTenantId());
        criteria.andUserIdEqualTo(Long.parseLong(deleteSafariRequest.getUserId().toString()));
        criteria.andProdIdEqualTo(deleteSafariRequest.getProdId());
        try {
            iUserSafariAtomSV.deleteByExample(example);
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error("删除失败");
        }

    }

    @Override
    public PageInfo<UserSafariInfoResponse> queryUserSafari(
            UserSafariInfoRequest request) throws BusinessException, SystemException {
        UcUserSafariCriteria example = new UcUserSafariCriteria();
        UcUserSafariCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(request.getTenantId());
        criteria.andUserIdEqualTo(Long.parseLong(request.getUserId().toString()));
        //criteria.andSafariTimeBetween(value1, value2);
        PageInfo<UserSafariInfoResponse> pageInfo = new PageInfo<UserSafariInfoResponse>();
        List<UcUserSafari> queryList = new ArrayList<UcUserSafari>();
        List<UserSafariInfoResponse> responseList = new ArrayList<UserSafariInfoResponse>();
        
        Integer pageNo = request.getPageNo();
        Integer pageSize = request.getPageSize();
        int count = iUserSafariAtomSV.countByExample(example);
        queryList = iUserSafariAtomSV.selectByExample(example);
        UserSafariInfoResponse response = new UserSafariInfoResponse();
        for (UcUserSafari ucUserSafari : queryList) {
            response.setUserId(ucUserSafari.getUserId().intValue());
            response.setProdId(ucUserSafari.getProdId());
            response.setSafariSeqId(ucUserSafari.getSafariSeqId());
            response.setSafariTime(ucUserSafari.getSafariTime());
            response.setState(ucUserSafari.getState());
            responseList.add(response);
        }
        pageInfo.setCount(count);
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
        pageInfo.setResult(responseList);
        return pageInfo;
    }

}
