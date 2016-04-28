package com.ai.slp.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.message.param.InsertUserMessageRequest;
import com.ai.slp.user.api.message.param.InsertUserMessageResponse;
import com.ai.slp.user.api.message.param.DeleteMessageRequest;
import com.ai.slp.user.api.message.param.QueryMessageRequest;
import com.ai.slp.user.api.message.param.QueryMessageResponse;
import com.ai.slp.user.api.message.param.UpdateMessageRequest;
import com.ai.slp.user.constants.OperMessageCodeConstants;
import com.ai.slp.user.dao.mapper.bo.UcUserMessage;
import com.ai.slp.user.dao.mapper.bo.UcUserMessageCriteria;
import com.ai.slp.user.service.atom.interfaces.IUserMessageAtomSV;
import com.ai.slp.user.service.business.interfaces.IUserMessageBusiSV;
import com.ai.slp.user.util.DateUtils;
import com.alibaba.dubbo.common.utils.StringUtils;

@Service
@Transactional
public class UserMessageBusiSVImpl implements IUserMessageBusiSV {

    @Autowired
    private IUserMessageAtomSV userMessageAtomSV;

    @Override
    public InsertUserMessageResponse insertUserMessage(InsertUserMessageRequest messageRequest)
            throws BusinessException, SystemException {
        UcUserMessage ucUserMessage = new UcUserMessage();
        BeanUtils.copyProperties(messageRequest, ucUserMessage);
        ucUserMessage.setCreateTime(DateUtils.currTimeStamp());

        int responseId = userMessageAtomSV.insert(ucUserMessage);
        InsertUserMessageResponse response = new InsertUserMessageResponse();
        response.setResponseId(responseId);
        return response;
    }

    @Override
    public void updateUserMessage(UpdateMessageRequest request)
            throws BusinessException, SystemException {

        UcUserMessageCriteria example = new UcUserMessageCriteria();
        UcUserMessageCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(request.getTenantId());
        criteria.andUserIdEqualTo(request.getUserId());
        UcUserMessage ucUserMessage = new UcUserMessage();

        // 判断更新read flag还是更新state
        if (request.getOperCode().equals(OperMessageCodeConstants.DELETE)) {
            if (!StringUtils.isBlank(request.getOperId())) {
                criteria.andInfoSeqIdEqualTo(request.getOperId());
            }
            ucUserMessage.setUpdateTime(DateUtils.currTimeStamp());
            ucUserMessage.setState("11");
            updateMessageSingle(ucUserMessage, example);
        }
        if (request.getOperCode().equals(OperMessageCodeConstants.UPDATE)) {
            if (!StringUtils.isBlank(request.getOperId())) {
                criteria.andInfoSeqIdEqualTo(request.getOperId());
            }
            ucUserMessage.setReadTime(DateUtils.currTimeStamp());
            ucUserMessage.setReadFlag("10");
            updateMessageSingle(ucUserMessage, example);
        }

    }

    public void updateMessageSingle(UcUserMessage ucUserMessage, UcUserMessageCriteria example) {
        try {
            userMessageAtomSV.updateByExampleSelective(ucUserMessage, example);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public PageInfo<QueryMessageResponse> queryUserMessage(QueryMessageRequest queryRequest)
            throws BusinessException, SystemException {
        UcUserMessageCriteria example = new UcUserMessageCriteria();
        UcUserMessageCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(queryRequest.getTenantId());
        criteria.andUserIdEqualTo(queryRequest.getUserId());
        //判断查询条件
        if(!StringUtils.isBlank(queryRequest.getInfoType())){
            criteria.andInfoTypeEqualTo(queryRequest.getInfoType());
        }else{
            if(!StringUtils.isBlank(queryRequest.getReadFlag())){
                criteria.andReadFlagEqualTo(queryRequest.getReadFlag());
            }
        }
        List<UcUserMessage> list = new ArrayList<UcUserMessage>();
        int count = 0;
        Integer pageNo = queryRequest.getPageNo();
        Integer pageSize = queryRequest.getPageSize();
        try {
            count = userMessageAtomSV.countByExample(example);
            list = userMessageAtomSV.selectByExample(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
        PageInfo<QueryMessageResponse> pageInfo = new PageInfo<QueryMessageResponse>();
        List<QueryMessageResponse> responseList = new ArrayList<QueryMessageResponse>();
        QueryMessageResponse response = new QueryMessageResponse();
        for (UcUserMessage ucUserMessage : list) {
            BeanUtils.copyProperties(ucUserMessage, response);
            responseList.add(response);
        }
        pageInfo.setCount(count);
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
        pageInfo.setResult(responseList);
        return pageInfo;
    }

    @Override
    public void deleteMessage(DeleteMessageRequest deleteRequest)
            throws BusinessException, SystemException {
        UcUserMessageCriteria example = new UcUserMessageCriteria();
        UcUserMessageCriteria.Criteria criteria = example.createCriteria();
        
        criteria.andTenantIdEqualTo(deleteRequest.getTenantId());
        criteria.andUserIdEqualTo(deleteRequest.getUserId());
        criteria.andInfoSeqIdIn(deleteRequest.getList());
        try {
            userMessageAtomSV.deleteByExample(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
