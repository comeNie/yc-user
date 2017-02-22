package com.ai.yc.user.api.usercollectiontranslation.interfaces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoRequest;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoResponse;


@Path("/ycusercollection")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUserCollectionSV {
	/**
	 * 收藏译文
	 * @param 
	 * @return
	 * @ApiCode USR_0005
     * @RestRelativeURL ycusercollection/insertCollectionInfo
	 */
	public BaseResponse insertCollectionInfo(UserCollectionInfoRequest userInfoRequest)throws BusinessException,SystemException;
	/**
	 * 根据条件查询译文
	 * @param 
	 * @return
	 * @ApiCode USR_0005
     * @RestRelativeURL ycusercollection/queryCollectionInfo
	 */
	public UserCollectionInfoResponse queryCollectionInfo(UserCollectionInfoRequest userInfoRequest)throws BusinessException,SystemException;

	/**
	 * 更新译文
	 * @param 
	 * @return
	 * @ApiCode USR_0005
     * @RestRelativeURL ycusercollection/updateCollectionInfo
	 */
	public BaseResponse updateCollectionInfo(UserCollectionInfoRequest userInfoRequest)throws BusinessException,SystemException;
	
	/**
	 * 删除译文
	 * @param 
	 * @return
	 * @ApiCode USR_0005
     * @RestRelativeURL ycusercollection/deleteCollectionInfo
	 */
	public BaseResponse deleteCollectionInfo(List<String> collectionIds)throws BusinessException,SystemException;
}
