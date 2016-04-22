package com.ai.slp.user.api.ucTelGroupInfo.interfaces;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ucTelGroupInfo.param.UcTelGroupParamsRequest;

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
	 
	public BaseResponse insertUcTelGroupInfo(UcTelGroupParamsRequest contactsGroup);
	
	@interface UpdateGroupInfo{}
	/**
	 * 
	 * 通讯录组修改   </br>
	 * @param contactsGroup
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse updateGroupInfo(UcTelGroupParamsRequest contactsGroup);
	
	@interface DeleteGroupInfo{}
	/**
	 * 
	 * 通讯录组删除   </br>
	 * @param contactsGroup
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse deleteGroupInfo(UcTelGroupParamsRequest contactsGroup);

	@interface GetContactsGroupInfo{}
	/**
	 * 通讯录组查询
	 */
	public List<UcTelGroupParamsRequest> getContactsGroupInfo();
}
