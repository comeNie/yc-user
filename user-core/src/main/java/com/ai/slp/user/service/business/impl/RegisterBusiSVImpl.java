package com.ai.slp.user.service.business.impl;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.slp.user.api.register.param.UcGroupKeyInfoParams;
import com.ai.slp.user.api.register.param.UcUserParams;
import com.ai.slp.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.slp.user.dao.mapper.bo.UcStateChg;
import com.ai.slp.user.dao.mapper.bo.UcUser;
import com.ai.slp.user.dao.mapper.bo.UcUserAgree;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria.Criteria;
import com.ai.slp.user.service.atom.interfaces.IRegisterAtomSV;
import com.ai.slp.user.service.atom.interfaces.IUcGroupKeyInfoAtomSV;
import com.ai.slp.user.service.atom.interfaces.IUcStateChgAtomSV;
import com.ai.slp.user.service.atom.interfaces.IUcUserAgreeAtomSV;
import com.ai.slp.user.service.business.interfaces.IRegisterBusiSV;

@Service
public class RegisterBusiSVImpl implements IRegisterBusiSV {

    private static final Log LOG = LogFactory.getLog(RegisterBusiSVImpl.class);
    @Autowired
    public IRegisterAtomSV registerAtomSv;
    
    @Autowired
    public IUcUserAgreeAtomSV ucUserAgreeAtomSv;
    
    @Autowired
    public IUcStateChgAtomSV ucStateChgAtomSV;
    
    @Autowired
    public IUcGroupKeyInfoAtomSV ucGroupKeyInfoAtomSv;
    
    public String REGISTER_STATE = "11";
    
    public String NORMAL_STATE="10";
    
    public String FREEZE_STATE="12";
    
    @Override
    public BaseResponse insertUserInfo(UcUserParams userParams) {
            BaseResponse response = new BaseResponse();
            ResponseHeader responseHeader = null;
            /**
             * 用户名或者手机号是不是唯一
             */
            boolean flag = getUserInfoBycondition(userParams);
            
            if(flag){
                responseHeader = new ResponseHeader(false,"fail","请输入有效手机号");
                response.setResponseHeader(responseHeader);
                return response;
            }
            
            /**
             * 注册
             */
            UcUser ucUser = new UcUser();
            BeanUtils.copyProperties(ucUser, userParams);
            try{
                ucUser.setUserState("");
                //插入user主表
                int userId = registerAtomSv.insertUserInfo(ucUser);
                UcUserAgree ucUserAgree = new UcUserAgree();
                ucUserAgree.setUserId(Long.parseLong(String.valueOf(userId)));
                //用户状态变更
                UcStateChg ucStateChg = new UcStateChg();
                ucStateChg.setTenantId(userParams.getTenantId());
                ucStateChg.setUserId(Long.parseLong(String.valueOf(userParams.getUserId())));
                ucStateChg.setOperType(userParams.getUserType());
                ucStateChg.setOldState(userParams.getUserState());
                ucStateChgAtomSV.insertUcStateChgBusiInfo(ucStateChg);
                
                //插入用户协议表
                ucUserAgreeAtomSv.InsertUcUserAgreeAtomSv(ucUserAgree);
                responseHeader = new ResponseHeader(true,"success","注册成功");
            
            }catch(Exception e){
                responseHeader = new ResponseHeader(false,"fail","注册失败");
                LOG.error("注册失败", e);
            }
           response.setResponseHeader(responseHeader);
           return response;
    }

    @Override
    public BaseResponse getUserInfo(UcUserParams userParams) {
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader = null;
       
        boolean flag = getUserInfoBycondition(userParams);
       
        if(flag){
            responseHeader = new ResponseHeader(false,"fail","该用户已注册，请重新输入");
        }else{
            responseHeader = new ResponseHeader(true,"success","");
        }
        response.setResponseHeader(responseHeader);
        return response;
    }
    
    @Override
    public BaseResponse insertUcGroupKeyInfo(UcGroupKeyInfoParams ucGroupKeyInfoParams) {
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader = null;
       /* *//**
         * 用户名或者手机号是不是唯一
         *//*
        boolean flag = getUserInfoBycondition(userParams);
        
        if(flag){
            responseHeader = new ResponseHeader(false,"fail","请输入有效手机号");
            response.setResponseHeader(responseHeader);
            return response;
        }
        
        *//**
         * 注册
         *//*
        UcUser ucUser = new UcUser();
        BeanUtils.copyProperties(ucUser, userParams);
        try{
            
            //插入user主表
            int userId = registerAtomSv.insertUserInfo(ucUser);
            UcUserAgree ucUserAgree = new UcUserAgree();
            ucUserAgree.setUserId(Long.parseLong(String.valueOf(userId)));
           
            *//**
             * 企业注册
             *//*
            
            if(COMPANY_REGISTER.equals(userParams.getRegisterWay())){
                //企业客户关键信息表
                UcGroupKeyInfo ucGroupKeyInfo = new UcGroupKeyInfo();
                ucGroupKeyInfo.setTenantId(userParams.getTenantId());
                ucGroupKeyInfo.setUserId(Long.parseLong(String.valueOf(userParams.getUserId())));
                ucGroupKeyInfo.setUserType(userParams.getUserType());
                ucGroupKeyInfo.setCityCode(userParams.getCityCode());
                ucGroupKeyInfoAtomSv.insertUcGroupKeyInfo(ucGroupKeyInfo);
                //用户联系人表
                
                
                
            }
           
            
        }catch(Exception e){
            responseHeader = new ResponseHeader(false,"fail","注册失败");
            LOG.error("注册失败", e);
        }
       response.setResponseHeader(responseHeader);*/
        return null;
    }
    
    
    
    public boolean getUserInfoBycondition(UcUserParams userParams){
        UcUserCriteria criteria = new UcUserCriteria();
        Criteria cr = criteria.createCriteria();
        boolean flag = false;
        if(!StringUtils.isBlank(userParams.getUserMp())){
            cr.andUserMpEqualTo(userParams.getUserMp());
        }
        if(!StringUtils.isBlank(userParams.getUserLoginName())){
            cr.andUserLoginNameEqualTo(userParams.getUserLoginName());
        }
        
        List<UcUser> list = registerAtomSv.getUserInfo(criteria);
        /**
         * list.size()>0说明用户名或者手机不唯一，返回false
         */
        flag = list.size()>0?false:true;
        return flag;
        
    }

  
}
