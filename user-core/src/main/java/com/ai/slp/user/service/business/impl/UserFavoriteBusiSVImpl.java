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
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.CreateUserFavoriteResponse;
import com.ai.slp.user.api.favorite.param.DeleteFavoriteListRequest;
import com.ai.slp.user.api.favorite.param.DeleteFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UcUserFavoriteParams;
import com.ai.slp.user.api.favorite.param.UserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.UserFavoriteResponse;
import com.ai.slp.user.dao.mapper.bo.UcUserFavorite;
import com.ai.slp.user.dao.mapper.bo.UcUserFavoriteCriteria;
import com.ai.slp.user.service.atom.interfaces.IUserFavoriteAtomSV;
import com.ai.slp.user.service.business.interfaces.IUserFavoriteBusiSV;
import com.ai.slp.user.util.DateUtils;

@Service
@Transactional
public class UserFavoriteBusiSVImpl implements IUserFavoriteBusiSV {

    private static final Log LOG = LogFactory.getLog(IUserFavoriteBusiSV.class);

    @Autowired
    private IUserFavoriteAtomSV iUserFavoriteAtomSV;

    @Override
    public CreateUserFavoriteResponse insertUcFavorite(
            CreateUserFavoriteRequest createUserFavoriteRequest)
                    throws BusinessException, SystemException {
        UcUserFavorite ucUserFavorite = new UcUserFavorite();
        ucUserFavorite.setTenantId(createUserFavoriteRequest.getTenantId());
        ucUserFavorite.setUserId(Long.parseLong(createUserFavoriteRequest.getUserId().toString()));
        ucUserFavorite.setFavoriteRelId(createUserFavoriteRequest.getFavoriteRelId());
        ucUserFavorite.setFavoriteType(createUserFavoriteRequest.getFavoriteType());
        ucUserFavorite.setFavoriteSeqId(createUserFavoriteRequest.getFavoriteReqId());
        ucUserFavorite.setState("1");
        try {
            ucUserFavorite.setCreateTime(DateUtils.currTimeStamp());
        } catch (Exception e) {
            LOG.error("插入操作失败");
        }
        int responseId = iUserFavoriteAtomSV.insert(ucUserFavorite);
        CreateUserFavoriteResponse response = new CreateUserFavoriteResponse();
        response.setResponseId(responseId);
        return response;
    }

    @Override
    public void updateFavorite(UcUserFavoriteParams ucUserFavoriteParams)
            throws SystemException, BusinessException {
        UcUserFavorite ucUserFavorite = new UcUserFavorite();
        ucUserFavorite.setFavoriteSeqId(ucUserFavoriteParams.getFavoriteSeqId());
        ucUserFavorite.setState(ucUserFavoriteParams.getState());
        ucUserFavorite.setUpdateTime(DateUtils.currTimeStamp());
        UcUserFavoriteCriteria ucUserFavoriteCriteria = new UcUserFavoriteCriteria();
        UcUserFavoriteCriteria.Criteria criteria = ucUserFavoriteCriteria.createCriteria();
        criteria.andUserIdEqualTo(Long.parseLong(ucUserFavoriteParams.getUserId().toString()));
        criteria.andTenantIdEqualTo(ucUserFavoriteParams.getTenantId());
        criteria.andFavoriteSeqIdEqualTo(ucUserFavorite.getFavoriteSeqId());
        try {
            iUserFavoriteAtomSV.updateByExampleSelective(ucUserFavorite, ucUserFavoriteCriteria);
        } catch (Exception e) {
            LOG.error("更新操作失败");
            e.printStackTrace();
        }
    }

    @Override
    public void deleteFavorite(DeleteFavoriteListRequest deleteFavoriteRequest)
            throws SystemException, BusinessException {
        List<String> list = new ArrayList<String>();
        list = deleteFavoriteRequest.getFavoriteReqIdList();
        DeleteFavoriteRequest request = new DeleteFavoriteRequest();
        request.setTenantId(deleteFavoriteRequest.getTenantId());
        request.setTenantPwd(deleteFavoriteRequest.getTenantPwd());
        request.setUserId(deleteFavoriteRequest.getUserId());
        for (String favoriteReqId : list) {
            request.setFavoriteReqId(favoriteReqId);
            deleteFavoriteSingle(request);
        }
    }

    public void deleteFavoriteSingle(DeleteFavoriteRequest deleteRequest)
            throws SystemException, BusinessException {
        UcUserFavoriteCriteria example = new UcUserFavoriteCriteria();
        UcUserFavoriteCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(deleteRequest.getTenantId());
        criteria.andUserIdEqualTo(Long.parseLong(deleteRequest.getUserId().toString()));
        criteria.andFavoriteSeqIdEqualTo(deleteRequest.getFavoriteReqId());
        try {
            iUserFavoriteAtomSV.deleteByExample(example);
        } catch (Exception e) {
            LOG.error("删除失败");
            e.printStackTrace();
        }
    }

    @Override
    public PageInfo<UserFavoriteResponse> queryFavorite(UserFavoriteRequest userFavoriteRequest)
            throws SystemException, BusinessException {
        UcUserFavoriteCriteria example = new UcUserFavoriteCriteria();
        UcUserFavoriteCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(userFavoriteRequest.getTenantId());
        criteria.andUserIdEqualTo(Long.parseLong(userFavoriteRequest.getUserId().toString()));
        criteria.andFavoriteSeqIdEqualTo(userFavoriteRequest.getFavoriteSeqId());
        List<UcUserFavorite> favoriteList = new ArrayList<UcUserFavorite>();
        Integer count = iUserFavoriteAtomSV.countByExample(example);
        List<UserFavoriteResponse> responseList = new ArrayList<UserFavoriteResponse>();
        favoriteList = iUserFavoriteAtomSV.selectByExample(example);
        UserFavoriteResponse response = new UserFavoriteResponse();
        Integer pageSize = userFavoriteRequest.getPageSize();
        Integer pageNo = userFavoriteRequest.getPageNo();
        for (UcUserFavorite ucUserFavorite : favoriteList) {
            response.setUserId(ucUserFavorite.getUserId().intValue());
            response.setTenantId(ucUserFavorite.getTenantId());
            response.setCreateTime(ucUserFavorite.getCreateTime());
            response.setFavoriteRelId(ucUserFavorite.getFavoriteRelId());
            response.setFavoriteSeqId(ucUserFavorite.getFavoriteSeqId());
            response.setFavoriteType(ucUserFavorite.getFavoriteType());
            response.setState(ucUserFavorite.getState());
            response.setUpdateTime(ucUserFavorite.getUpdateTime());
            responseList.add(response);
        }
        PageInfo<UserFavoriteResponse> pageInfo = new PageInfo<UserFavoriteResponse>();
        pageInfo.setResult(responseList);
        pageInfo.setCount(count);
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(pageSize);
        return pageInfo;
    }

}