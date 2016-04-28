package com.ai.slp.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.favorite.param.InsertUserFavoriteRequest;
import com.ai.slp.user.api.favorite.param.InsertUserFavoriteResponse;
import com.ai.slp.user.api.favorite.param.DeleteFavoriteListRequest;
import com.ai.slp.user.api.favorite.param.UpdateFavoriteRequest;
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
    private IUserFavoriteAtomSV userFavoriteAtomSV;

    @Override
    public InsertUserFavoriteResponse insertUcFavorite(
            InsertUserFavoriteRequest favoriteRequest)
                    throws BusinessException, SystemException {
        UcUserFavorite ucUserFavorite = new UcUserFavorite();
        BeanUtils.copyProperties(favoriteRequest, ucUserFavorite);
        ucUserFavorite.setUserId(favoriteRequest.getUserId());
        ucUserFavorite.setState("0");
        try {
            ucUserFavorite.setCreateTime(DateUtils.currTimeStamp());
        } catch (Exception e) {
            LOG.error("插入操作失败");
        }
        int responseId = userFavoriteAtomSV.insert(ucUserFavorite);
        InsertUserFavoriteResponse response = new InsertUserFavoriteResponse();
        response.setResponseId(responseId);
        return response;
    }

    @Override
    public void updateFavorite(UpdateFavoriteRequest updateRequest)
            throws SystemException, BusinessException {
        UcUserFavorite ucUserFavorite = new UcUserFavorite();
        List<String> list = new ArrayList<String>();
        list = updateRequest.getFavoriteList();
        UcUserFavoriteCriteria example = new UcUserFavoriteCriteria();
        UcUserFavoriteCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(updateRequest.getTenantId());
        criteria.andUserIdEqualTo(updateRequest.getUserId());
        criteria.andFavoriteSeqIdIn(list);
        ucUserFavorite.setState("1");
        ucUserFavorite.setUpdateTime(DateUtils.currTimeStamp());
        try {
            userFavoriteAtomSV.updateByExampleSelective(ucUserFavorite, example);
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

        UcUserFavoriteCriteria example = new UcUserFavoriteCriteria();
        UcUserFavoriteCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(deleteFavoriteRequest.getTenantId());
        criteria.andUserIdEqualTo(deleteFavoriteRequest.getUserId());
        criteria.andFavoriteSeqIdIn(list);
        try {
            userFavoriteAtomSV.deleteByExample(example);
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
        criteria.andUserIdEqualTo(userFavoriteRequest.getUserId());
        List<UcUserFavorite> favoriteList = new ArrayList<UcUserFavorite>();
        Integer count = userFavoriteAtomSV.countByExample(example);
        List<UserFavoriteResponse> responseList = new ArrayList<UserFavoriteResponse>();
        favoriteList = userFavoriteAtomSV.selectByExample(example);
        UserFavoriteResponse response = new UserFavoriteResponse();
        Integer pageSize = userFavoriteRequest.getPageSize();
        Integer pageNo = userFavoriteRequest.getPageNo();
        for (UcUserFavorite ucUserFavorite : favoriteList) {
            BeanUtils.copyProperties(ucUserFavorite, response);
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