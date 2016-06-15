package com.ai.slp.user.service.business.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.slp.user.api.keyinfo.param.InsertCustFileExtRequest;
import com.ai.slp.user.api.keyinfo.param.InsertGroupKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.SearchGroupKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.SearchGroupKeyInfoResponse;
import com.ai.slp.user.api.keyinfo.param.UpdateGroupKeyInfoRequest;
import com.ai.slp.user.dao.mapper.bo.CmCustFileExt;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfoCriteria;
import com.ai.slp.user.service.atom.interfaces.ICustFileAtomSV;
import com.ai.slp.user.service.atom.interfaces.IUcGroupKeyInfoAtomSV;
import com.ai.slp.user.service.business.interfaces.IUcGroupKeyInfoBusiSV;

@Service
@Transactional
public class UcGroupKeyInfoBusiSVImpl implements IUcGroupKeyInfoBusiSV{

    @Autowired
    private IUcGroupKeyInfoAtomSV ucGroupKeyInfoAtomSV;
    
    @Autowired
    private ICustFileAtomSV custFileAtomSV;
    
    @Override
    public int insertGroupKeyInfo(InsertGroupKeyInfoRequest request)
            throws SystemException, BusinessException {
        UcGroupKeyInfo record = new UcGroupKeyInfo();
        BeanUtils.copyProperties(request, record);
        return ucGroupKeyInfoAtomSV.insert(record);
    }

    @Override
    public int updateGroupKeyInfo(UpdateGroupKeyInfoRequest request)
            throws SystemException, BusinessException {
        UcGroupKeyInfoCriteria example = new UcGroupKeyInfoCriteria();
        UcGroupKeyInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(request.getTenantId());
        criteria.andUserIdEqualTo(request.getUserId());
        
        UcGroupKeyInfo record = new UcGroupKeyInfo();
        BeanUtils.copyProperties(request, record);
        return ucGroupKeyInfoAtomSV.updateByExampleSelective(record, example);
    }

    @Override
    public SearchGroupKeyInfoResponse searchGroupKeyInfo(SearchGroupKeyInfoRequest request)
            throws SystemException, BusinessException {
        UcGroupKeyInfoCriteria example = new UcGroupKeyInfoCriteria();
        UcGroupKeyInfoCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(request.getTenantId());
        criteria.andUserIdEqualTo(request.getCustName());
        
        List<UcGroupKeyInfo> list = ucGroupKeyInfoAtomSV.selectByExample(example);
        
        SearchGroupKeyInfoResponse response = new SearchGroupKeyInfoResponse();
        if(!list.isEmpty()){
            BeanUtils.copyProperties(list.get(0), response);
        }
        return response;
    }

    @Override
    public int insertCustFileExt(InsertCustFileExtRequest request)
            throws SystemException, BusinessException {
        
        CmCustFileExt cmCustFileExt = new CmCustFileExt();
        BeanUtils.copyProperties(request, cmCustFileExt);
        cmCustFileExt.setInfoExtId(SeqUtil.getNewId("CM_CUST_FILE_EXT$INFO_EXT$ID").toString());
        
        return custFileAtomSV.insert(cmCustFileExt);
    }

}
