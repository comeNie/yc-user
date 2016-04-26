package com.ai.slp.user.api.ucUserPhonebooks.impl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.slp.user.api.ucUserPhonebooks.interfaces.IUcUserPhoneBooksSV;
import com.ai.slp.user.api.ucUserPhonebooks.param.UcPhoneBooksParamsRequest;
import com.ai.slp.user.api.ucUserPhonebooks.param.UcPhoneBooksParamsResponse;
import com.ai.slp.user.dao.mapper.bo.UcUserPhonebooks;
import com.ai.slp.user.service.business.interfaces.IUcUserPhoneBooksBusiSv;

@Service
public class PhoneBooksSVImpl implements IUcUserPhoneBooksSV {
    
    @Autowired
    private IUcUserPhoneBooksBusiSv ucUserPhoneBooksBusiSv; 
   
    @Override
    public BaseResponse phoneBooksManuallyInfo(UcPhoneBooksParamsRequest contactsGroup) {
        
        return ucUserPhoneBooksBusiSv.phoneBooksManuallyInfo(contactsGroup);
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
        return ucUserPhoneBooksBusiSv.updatePhoneBooksInfo(contactsGroup);
    }

    @Override
    public BaseResponse deletePhoneBooksInfo(String telNo) {
        return ucUserPhoneBooksBusiSv.deletePhoneBooksInfo(telNo);
    }

    @Override
    public BaseResponse exportPhoneBooks(String filepath) {
        
        
        
        return null;
    }

    @Override
    public UcPhoneBooksParamsResponse getPhoneBooksInfo(UcPhoneBooksParamsRequest telGroup,
            int startPage, int limit) {
        
        return ucUserPhoneBooksBusiSv.getPhoneBooksInfo(telGroup, startPage, limit);
    }

    @Override
    public UcPhoneBooksParamsResponse GetAllPhoneBooksInfo(UcPhoneBooksParamsRequest phoneBookParam) {
        
        return  ucUserPhoneBooksBusiSv.getAllPhoneBooksInfo(phoneBookParam);
    }

    @Override
    public BaseResponse DownloadPhoneBooksTemplate(String path) {
        
        return null;
    }

    public PageInfo<UcPhoneBooksParamsRequest> getUserPhoneBooksList(List<UcUserPhonebooks> list){
        
        List<UcPhoneBooksParamsRequest> phoneBooksList = new ArrayList<UcPhoneBooksParamsRequest>();
        
        if(!CollectionUtil.isEmpty(list)){
            for(UcUserPhonebooks phoneBooks :list){
                UcPhoneBooksParamsRequest phoneBook=new UcPhoneBooksParamsRequest();
                BeanUtils.copyProperties(phoneBook,phoneBooks);
                phoneBooksList.add(phoneBook);
            }
        }
        PageInfo<UcPhoneBooksParamsRequest> pageInfo = new PageInfo<UcPhoneBooksParamsRequest>();
        pageInfo.setResult(phoneBooksList);
        return pageInfo;
    }
    
    
}
