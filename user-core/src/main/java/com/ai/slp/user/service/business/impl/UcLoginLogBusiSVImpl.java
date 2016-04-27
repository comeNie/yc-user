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
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.slp.user.api.ucLoginLog.param.UcLoginLogParamsRequest;
import com.ai.slp.user.api.ucLoginLog.param.UcLoginLogResponse;
import com.ai.slp.user.dao.mapper.bo.UcLoginLog;
import com.ai.slp.user.dao.mapper.bo.UcLoginLogCriteria;
import com.ai.slp.user.service.atom.interfaces.IUcLoginLogAtomSV;
import com.ai.slp.user.service.business.interfaces.IUcLoginLogBusiSV;

@Service
@Transactional
public class UcLoginLogBusiSVImpl implements IUcLoginLogBusiSV {

    
    @Autowired
    private IUcLoginLogAtomSV ucLoginLogAtomSV;
    
    static final Log LOG = LogFactory.getLog(UcLoginLogBusiSVImpl.class);
    
    @Override
    public BaseResponse insertUcLoginLogInfo(UcLoginLogParamsRequest ucLoginLogParam) {
        BaseResponse reponse = new BaseResponse();
        ResponseHeader responseHeader;
        try{
            UcLoginLog ucLoginLog = new UcLoginLog();
            BeanUtils.copyProperties(ucLoginLog, ucLoginLogParam);
            ucLoginLogAtomSV.insertUcLoginLogInfo(ucLoginLog);
            responseHeader = new ResponseHeader(true,"success","添加成功");
        }catch(Exception e){
            responseHeader = new ResponseHeader(false,"fail","添加失败");
            
        }
        reponse.setResponseHeader(responseHeader);
        return null;
    }

    @Override
    public PageInfo<UcLoginLogResponse> getUcLoginLogInfo(UcLoginLogParamsRequest ucLoginLogParam,int limitStart,int limitEnd) {
       
        UcLoginLogCriteria criteria = new UcLoginLogCriteria();
        int count = ucLoginLogAtomSV.countUcTelGroupInfo(criteria);
        criteria.setLimitStart(limitStart);
        criteria.setLimitEnd(limitEnd);
        List<UcLoginLog> list = ucLoginLogAtomSV.selectUcTelGroupInfo(criteria);
        PageInfo<UcLoginLogResponse> pageInfo = getUserPhoneBooksList(list);
        pageInfo.setCount(count);
        return null;
        
    }

    public PageInfo<UcLoginLogResponse> getUserPhoneBooksList(List<UcLoginLog> list)throws BusinessException, SystemException{
        
        List<UcLoginLogResponse> loginLogList = new ArrayList<UcLoginLogResponse>();
        if(!CollectionUtil.isEmpty(list)){
            for(UcLoginLog phoneBooks :list){
                UcLoginLogResponse loginLogResponse=new UcLoginLogResponse();
                BeanUtils.copyProperties(loginLogResponse,phoneBooks);
                loginLogList.add(loginLogResponse);
            }
        }
        PageInfo<UcLoginLogResponse> pageInfo = new PageInfo<UcLoginLogResponse>();
        pageInfo.setResult(loginLogList);
        return pageInfo;
    }
}
