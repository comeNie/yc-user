package com.ai.slp.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.api.specialinfo.param.InsertSpecialInfoRequest;
import com.ai.slp.user.api.specialinfo.param.InsertSpecialInfoResponse;
import com.ai.slp.user.api.specialinfo.param.QuerySpecialInfoRequest;
import com.ai.slp.user.api.specialinfo.param.QuerySpecialInfoResponse;
import com.ai.slp.user.api.specialinfo.param.UpdateSepcialInfoRequest;
import com.ai.slp.user.dao.mapper.bo.UcSpecialInfo;
import com.ai.slp.user.dao.mapper.bo.UcSpecialInfoCriteria;
import com.ai.slp.user.service.atom.interfaces.IUcSpecialInfoAtomSV;
import com.ai.slp.user.service.business.interfaces.IUcSpecialInfoBusiSV;
import com.ai.slp.user.util.DateUtils;

@Service
@Transactional
public class UcSpecialInfoBusiSVImpl implements IUcSpecialInfoBusiSV {

    @Autowired
    private IUcSpecialInfoAtomSV ucSpecialInfoAtomSV;

    @Override
    public InsertSpecialInfoResponse insertSpecialInfo(InsertSpecialInfoRequest specialInfoRequest)
            throws BusinessException, SystemException {
        UcSpecialInfo ucSpecialInfo = new UcSpecialInfo();
        BeanUtils.copyProperties(specialInfoRequest, ucSpecialInfo);
        ucSpecialInfo.setCreateTime(DateUtils.currTimeStamp());
        Integer responseId = 0;
        try {
            responseId = ucSpecialInfoAtomSV.insert(ucSpecialInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        InsertSpecialInfoResponse response = new InsertSpecialInfoResponse();
        response.setResponseId(responseId);
        return response;
    }

    @Override
    public void updateSpecialInfo(UpdateSepcialInfoRequest specialInfoRequest)
            throws BusinessException, SystemException {
        UcSpecialInfo ucSpecialInfo = new UcSpecialInfo();
        BeanUtils.copyProperties(specialInfoRequest, ucSpecialInfo);
        ucSpecialInfo.setUpdateTime(DateUtils.currTimeStamp());
        UcSpecialInfoCriteria example = new UcSpecialInfoCriteria();
        UcSpecialInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(specialInfoRequest.getTenantId());
        criteria.andUserIdEqualTo(specialInfoRequest.getUserId());
        criteria.andInfoSpecialIdEqualTo(specialInfoRequest.getInfoSpecialId());
        try {
            ucSpecialInfoAtomSV.updateByExampleSelective(ucSpecialInfo, example);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public QuerySpecialInfoResponse querySpecialInfo(QuerySpecialInfoRequest specialInfoRequest)
            throws BusinessException, SystemException {
        UcSpecialInfoCriteria example = new UcSpecialInfoCriteria();
        UcSpecialInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(specialInfoRequest.getTenantId());
        criteria.andUserIdEqualTo(specialInfoRequest.getUserId());
        criteria.andInfoSpecialIdEqualTo(specialInfoRequest.getSpecialInfoId());

        List<UcSpecialInfo> list = new ArrayList<UcSpecialInfo>();
        try {
            list = ucSpecialInfoAtomSV.selectByExample(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
        QuerySpecialInfoResponse response = new QuerySpecialInfoResponse();
        BeanUtils.copyProperties(list.get(0), response);
        return response;
    }

}
