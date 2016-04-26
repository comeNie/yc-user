package com.ai.slp.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.slp.user.api.ucUserPhonebooks.param.UcPhoneBooksParamsRequest;
import com.ai.slp.user.api.ucUserPhonebooks.param.UcPhoneBooksParamsResponse;
import com.ai.slp.user.dao.mapper.bo.UcUserPhonebooks;
import com.ai.slp.user.dao.mapper.bo.UcUserPhonebooksCriteria;
import com.ai.slp.user.service.atom.interfaces.IUcUserPhoneBooksAtomSV;
import com.ai.slp.user.service.business.interfaces.IUcUserPhoneBooksBusiSv;

@Service
@Transactional
public class UcUserPhoneBooksBusiSVImpl implements IUcUserPhoneBooksBusiSv{

    @Autowired
    private IUcUserPhoneBooksAtomSV ucUserPhoneBooksAtomSv;
    
    static final Log LOG = LogFactory.getLog(UcUserPhoneBooksBusiSVImpl.class);
        
    @Override
    public BaseResponse phoneBooksManuallyInfo(UcPhoneBooksParamsRequest contactsGroup) {
        
        BaseResponse reponse = new BaseResponse();
        
        ResponseHeader responseHeader ;
        try{
            UcUserPhonebooks userPhoneBook = new UcUserPhonebooks();
            BeanUtils.copyProperties(userPhoneBook,contactsGroup);
            ucUserPhoneBooksAtomSv.insertUserPhoneBooksInfo(userPhoneBook);
            responseHeader = new ResponseHeader(true,"success","通讯录添加成功");
        }catch(Exception e){
            responseHeader = new ResponseHeader(false,"fail","通讯录添加失败");
            LOG.error("通讯录添加失败",e);
        }
        reponse.setResponseHeader(responseHeader);
        
        return reponse;
    }

    @Override
    public BaseResponse phoneBooksImportCvsInfo(String filePath) {
        return null;
    }

    @Override
    public BaseResponse phoneBooksImportXlsInfo(String filePath) {
        return null;
    }

    @Override
    public BaseResponse phoneBooksImportXlsxInfo(String filePath) {
        return null;
    }

    @Override
    public BaseResponse updatePhoneBooksInfo(UcPhoneBooksParamsRequest contactsGroup) {
        
        BaseResponse reponse = new BaseResponse();
        
        ResponseHeader responseHeader ;
        
        try{
            UcUserPhonebooksCriteria criteria = new UcUserPhonebooksCriteria();
            
            criteria.or().andTelNoEqualTo(contactsGroup.getTelNo());
            
            UcUserPhonebooks userPhoneBook = new UcUserPhonebooks();
            
            BeanUtils.copyProperties(userPhoneBook,contactsGroup);
            
            ucUserPhoneBooksAtomSv.updateUserPhoneBooksInfo(userPhoneBook, criteria);
            
            responseHeader = new ResponseHeader(true,"success","通讯录修改成功");
            
        }catch(Exception e){
            responseHeader = new ResponseHeader(false,"fail","通讯录修改失败");
            LOG.error("通讯录修改失败",e);
        }
        
        reponse.setResponseHeader(responseHeader);
        return reponse;
    }

    @Override
    public BaseResponse deletePhoneBooksInfo(String telNo) {
        
        BaseResponse reponse = new BaseResponse();
        
        ResponseHeader responseHeader ;
        
        try{
            UcUserPhonebooksCriteria criteria = new UcUserPhonebooksCriteria();
            
            criteria.or().andTelNoEqualTo(telNo);
            
            
            ucUserPhoneBooksAtomSv.deleteUserPhoneBooksInfo(criteria);
            
            responseHeader = new ResponseHeader(true,"success","通讯录删除成功");
            
        }catch(Exception e){
            responseHeader = new ResponseHeader(false,"fail","通讯录删除失败");
            LOG.error("通讯录修改失败",e);
        }
        
        reponse.setResponseHeader(responseHeader);
        return reponse;
    }

    @Override
    public BaseResponse exportPhoneBooks(String filepath) {
        return null;
    }

    @Override
    public UcPhoneBooksParamsResponse getPhoneBooksInfo(UcPhoneBooksParamsRequest phoneBook,
            int startPage, int limit) {
        
        UcPhoneBooksParamsResponse response = new UcPhoneBooksParamsResponse();
        
        UcUserPhonebooksCriteria criteria = new UcUserPhonebooksCriteria();
        
        UcUserPhonebooksCriteria.Criteria cr = criteria.createCriteria();
        
        cr.andTelGroupIdEqualTo(phoneBook.getTelGroupId());
        
        if(!StringUtils.isBlank(phoneBook.getCityCode())){
            cr.andCitypCodeEqualTo(phoneBook.getCityCode());
        }
        
        if(!StringUtils.isBlank(phoneBook.getBasicBasicOrgId())){
            cr.andBasicOrgIdEqualTo(phoneBook.getBasicBasicOrgId());
        }
        
        if(!StringUtils.isBlank(phoneBook.getTelName())||!StringUtils.isBlank(phoneBook.getTelMp())){
            cr.andTelNameLike(phoneBook.getTelName());
            criteria.or().andTelMpLike(phoneBook.getTelMp());
        }
        
        /**
         * 获取到总数
         */
        int count = ucUserPhoneBooksAtomSv.countUcTelGroupInfo(criteria);
        
        criteria.setLimitStart(startPage);
        criteria.setLimitEnd(limit);
        List<UcUserPhonebooks> ucUserPhonebookds = ucUserPhoneBooksAtomSv.selectUcTelGroupInfo(criteria);
        
        PageInfo<UcPhoneBooksParamsResponse> pageInfo = getUserPhoneBooksList(ucUserPhonebookds);
        pageInfo.setPageNo(startPage);
        pageInfo.setPageSize(limit);
        pageInfo.setCount(count);
        response.setPageInfo(pageInfo);
        
        return response;
    }

    
    @Override
    public UcPhoneBooksParamsResponse getAllPhoneBooksInfo(UcPhoneBooksParamsRequest phoneBook) {
        
        UcPhoneBooksParamsResponse response = new UcPhoneBooksParamsResponse();
        
        UcUserPhonebooksCriteria criteria = new UcUserPhonebooksCriteria();
        
        UcUserPhonebooksCriteria.Criteria cr = criteria.createCriteria();
        
        cr.andTelGroupIdEqualTo(phoneBook.getTelGroupId());
        
        if(!StringUtils.isBlank(phoneBook.getCityCode())){
            cr.andCitypCodeEqualTo(phoneBook.getCityCode());
        }
        
        if(!StringUtils.isBlank(phoneBook.getBasicBasicOrgId())){
            cr.andBasicOrgIdEqualTo(phoneBook.getBasicBasicOrgId());
        }
        
        if(!StringUtils.isBlank(phoneBook.getTelName())||!StringUtils.isBlank(phoneBook.getTelMp())){
            cr.andTelNameLike(phoneBook.getTelName());
            criteria.or().andTelMpLike(phoneBook.getTelMp());
        }
        
        
        List<UcUserPhonebooks> ucUserPhonebookds = ucUserPhoneBooksAtomSv.selectUcTelGroupInfo(criteria);
        
        PageInfo<UcPhoneBooksParamsResponse> pageInfo = getUserPhoneBooksList(ucUserPhonebookds);
        pageInfo.setPageNo(1);
        pageInfo.setPageSize(ucUserPhonebookds.size());
        pageInfo.setCount(ucUserPhonebookds.size());
        response.setPageInfo(pageInfo);
        
        return response;
    }
    
    @Override
    public BaseResponse DownloadPhoneBooksTemplate(String path) {
        return null;
    }

    @Override
    public UcPhoneBooksParamsResponse GetAllPhoneBooksInfo(String contactsGroupId) {
        
        
        
        return null;
    }

    
   public PageInfo<UcPhoneBooksParamsResponse> getUserPhoneBooksList(List<UcUserPhonebooks> list){
        
        List<UcPhoneBooksParamsResponse> phoneBooksList = new ArrayList<UcPhoneBooksParamsResponse>();
        
        if(!CollectionUtil.isEmpty(list)){
            for(UcUserPhonebooks phoneBooks :list){
                UcPhoneBooksParamsResponse phoneBook=new UcPhoneBooksParamsResponse();
                BeanUtils.copyProperties(phoneBook,phoneBooks);
                phoneBooksList.add(phoneBook);
            }
        }
        PageInfo<UcPhoneBooksParamsResponse> pageInfo = new PageInfo<UcPhoneBooksParamsResponse>();
        pageInfo.setResult(phoneBooksList);
        return pageInfo;
    }
   
   
}
