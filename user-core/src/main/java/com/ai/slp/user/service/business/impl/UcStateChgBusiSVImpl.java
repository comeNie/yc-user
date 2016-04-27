package com.ai.slp.user.service.business.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.slp.user.api.ucStateChg.param.UcStateChgParamsRequest;
import com.ai.slp.user.dao.mapper.bo.UcStateChg;
import com.ai.slp.user.dao.mapper.bo.UcStateChgCriteria;
import com.ai.slp.user.service.atom.interfaces.IUcStateChgAtomSV;
import com.ai.slp.user.service.business.interfaces.IUcStateChgBusiSV;

@Service
@Transactional
public class UcStateChgBusiSVImpl implements IUcStateChgBusiSV{

    @Autowired
    private IUcStateChgAtomSV iUcStateChgAtomSV;
    
    static final Log LOG = LogFactory.getLog(UcStateChgBusiSVImpl.class);
    
    @Override
    public BaseResponse insertUcStateChgBusiInfo(UcStateChgParamsRequest ucStateChgParam) {
        
        BaseResponse reponse = new BaseResponse();
        ResponseHeader responseHeader;
        UcStateChg ucStateChg = new UcStateChg();
        BeanUtils.copyProperties(ucStateChg,ucStateChgParam);
        try{
            iUcStateChgAtomSV.insertUcStateChgBusiInfo(ucStateChg);
            responseHeader = new ResponseHeader(true,"success","添加成功");
        }catch(Exception e){
            LOG.error("用户状态添加失败",e);
            responseHeader = new ResponseHeader(false,"fail","添加失败");
        }
        reponse.setResponseHeader(responseHeader);
        return reponse;
    }

    @Override
    public BaseResponse updateUcStateChgBusiInfo(UcStateChgParamsRequest ucStateChgParam) {
        BaseResponse reponse = new BaseResponse();
        ResponseHeader responseHeader;
        try{
            UcStateChg ucStateChg = new UcStateChg();
            BeanUtils.copyProperties(ucStateChg,ucStateChgParam);
            UcStateChgCriteria criteria = new UcStateChgCriteria();
            criteria.or().andUserIdEqualTo(ucStateChgParam.getUserId());
            iUcStateChgAtomSV.updateUcStateChgBusiInfo(ucStateChg, criteria);
            responseHeader = new ResponseHeader(true,"success","添加成功");
        }catch(Exception e){
            responseHeader = new ResponseHeader(false,"fail","更新失败");
            LOG.error("修改失败",e);
        }
       reponse.setResponseHeader(responseHeader);
        return reponse;
    }
}
