package com.ai.slp.user.service.business.impl;

import java.util.List;
import java.util.Map;

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
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupParamsRequest;
import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupResponse;
import com.ai.slp.user.dao.mapper.bo.UcTelGroup;
import com.ai.slp.user.dao.mapper.bo.UcTelGroupCriteria;
import com.ai.slp.user.service.atom.interfaces.IUcTelGroupAtomSV;
import com.ai.slp.user.service.business.interfaces.IUcTelGroupBusiSV;

@Service
@Transactional
public class UcTelGroupBusiSVImpl implements IUcTelGroupBusiSV{
    
    static final Log LOG = LogFactory.getLog(UcTelGroupBusiSVImpl.class);
    
    @Autowired
    private IUcTelGroupAtomSV ucTelGroupAtomSv;
    
    
    @Override
    public BaseResponse insertUcTelGroupInfo(UcTelGroupParamsRequest contactsGroup)throws BusinessException, SystemException {
        UcTelGroup ucTelGroup =new UcTelGroup();
        BeanUtils.copyProperties(contactsGroup, ucTelGroup);
        BaseResponse reponse = new BaseResponse();
        ResponseHeader responseHeader;
       
        try{
            ucTelGroupAtomSv.insertUcTelGroupInfo(ucTelGroup);
            responseHeader = new ResponseHeader(true,"success","添加成功");
        }catch(Exception e){
            LOG.error("通讯录组添加失败",e);
            responseHeader = new ResponseHeader(false,"fail","添加失败");
        }
        reponse.setResponseHeader(responseHeader);
        return reponse;
    }

    @Override
    public BaseResponse deleteGroupInfo(String telGroupId)throws BusinessException, SystemException {
        BaseResponse reponse = new BaseResponse();
        ResponseHeader responseHeader;
        try{
            UcTelGroupCriteria ucTelGroupCriteria = new UcTelGroupCriteria();
            ucTelGroupCriteria.or().andTelGroupIdEqualTo(telGroupId);
            ucTelGroupAtomSv.deleteUcTelGroupInfo(ucTelGroupCriteria);
            responseHeader = new ResponseHeader(true,"success","删除成功");
        }catch(Exception e){
            responseHeader = new ResponseHeader(false,"fail","删除失败");
            LOG.error("通讯录组删除失败",e);
        }
        reponse.setResponseHeader(responseHeader);
        return reponse;
    }

  
    @Override
    public UcTelGroupResponse selectGroupInfo(int limitStart, int limitEnd)throws BusinessException, SystemException {
        
        UcTelGroupResponse reponse = new UcTelGroupResponse();
        UcTelGroupCriteria ucTelGroupCriteria = new UcTelGroupCriteria();
        
        int count = ucTelGroupAtomSv.countUcTelGroupInfo(ucTelGroupCriteria);
        
        ucTelGroupCriteria.setLimitStart(limitStart);
        ucTelGroupCriteria.setLimitEnd(limitEnd);
        
       
        
        ucTelGroupCriteria.or().andCreateChlIdBetween("telGroup.TEL_GROUP_ID", "books.TEL_GROUP_ID");
        ucTelGroupCriteria.or().andTelGroupIdEqualTo(("books.TEL_GROUP_ID"));
        List<UcTelGroup> map = ucTelGroupAtomSv.selectUcTelGroupInfo(ucTelGroupCriteria);
         
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>();
        //pageInfo.setResult(map);
        pageInfo.setCount(count);
        reponse.setPageInfo(pageInfo);
        
        return reponse;
    }

    @Override
    public BaseResponse updateUcTelGroupInfo(UcTelGroupParamsRequest contactsGroup)throws BusinessException, SystemException {
        
        BaseResponse reponse = new BaseResponse();
        ResponseHeader responseHeader;
        try{
            UcTelGroupCriteria ucTelGroupCriteria = new UcTelGroupCriteria();
            UcTelGroup ucTelGroup = new UcTelGroup();
            BeanUtils.copyProperties(ucTelGroup,contactsGroup);
            ucTelGroupCriteria.or().andTelGroupIdEqualTo(contactsGroup.getTelGroupId());
            ucTelGroupAtomSv.updateUcTelGroupInfo(ucTelGroup, ucTelGroupCriteria);
            responseHeader = new ResponseHeader(true,"success","修改成功");
        }catch(Exception e){
            responseHeader = new ResponseHeader(false,"fail","修改失败");
            LOG.error("通讯录组修改失败",e);
        }
        reponse.setResponseHeader(responseHeader);
        
        return reponse;
    }

    @Override
    public int getUcTelGroupCount(UcTelGroupParamsRequest contactsGroup)throws BusinessException, SystemException {
        
        UcTelGroupCriteria ucTelGroupCriteria = new UcTelGroupCriteria();
        
        UcTelGroupCriteria.Criteria criteria = ucTelGroupCriteria.createCriteria();
        
        if(!StringUtil.isBlank(contactsGroup.getTelGroupName())){
            criteria.andTelGroupNameLike(contactsGroup.getTelGroupName());
        }
        int count = ucTelGroupAtomSv.countUcTelGroupInfo(ucTelGroupCriteria);
        
        return count;
    }
    
    

}
