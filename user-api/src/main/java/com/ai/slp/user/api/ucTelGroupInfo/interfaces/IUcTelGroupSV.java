package com.ai.slp.user.api.ucTelGroupInfo.interfaces;


import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupParamsRequest;
import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupResponse;

public interface IUcTelGroupSV {
	 
	@interface InsertUcTelGroupInfo{}
	/**
	 * 
	 * 通讯录组新增</br>
	 * @param contactsGroup
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	 
	public BaseResponse insertUcTelGroupInfo (UcTelGroupParamsRequest telGroup) throws BusinessException, SystemException;
	
	@interface UpdateGroupInfo{}
	/**
	 * 
	 * 通讯录组修改   </br>
	 * @param contactsGroup
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse updateGroupInfo(UcTelGroupParamsRequest telGroup) throws BusinessException, SystemException;
	
	@interface DeleteGroupInfo{}
	/**
	 * 
	 * 通讯录组删除   </br>
	 * @param contactsGroup
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse deleteGroupInfo(String telGroupId) throws BusinessException, SystemException;

	@interface GetTelGroupInfo{}
	/**
	 * 通讯录组查询
	 * @param startPage
	 * @param limit
	 * @return
	 * @author zhangyh7
	 * @ApiDocMethod
	 */
	public UcTelGroupResponse getTelGroupInfo(int startPage,int limit) throws BusinessException, SystemException;
	
	
	@interface GetTelgroupCount{}
	/**
	 * 得到通讯录总数
	 * @param telGroup
	 * @return
	 * @author zhangyh7
	 * @ApiDocMethod
	 */
	public int getTelGroupCount(UcTelGroupParamsRequest telGroup) throws BusinessException, SystemException;
	
}
