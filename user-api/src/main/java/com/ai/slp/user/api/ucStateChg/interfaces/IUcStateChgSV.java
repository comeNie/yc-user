package com.ai.slp.user.api.ucStateChg.interfaces;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ucStateChg.param.UcStateChgParamsRequest;


public interface IUcStateChgSV {
	
    /**
     * 
     * 用户状态轨迹状态轨迹新增</br>
     * @param contactsGroup
     * @return
     * @author zhangyuehong
     * @ApiDocMethod
     */
	@interface InsertUcStateChgInfo{};
	
	BaseResponse insertUcStateChgInfo(UcStateChgParamsRequest ucStateChgParam);
	
	  /**
     * 
     * 用户状态轨迹状态轨迹修改</br>
     * @param contactsGroup
     * @return
     * @author zhangyuehong
     * @ApiDocMethod
     */
    @interface UpdateUcStateChgInfo{};
    
    BaseResponse updateUcStateChgInfo(UcStateChgParamsRequest ucStateChgParam);
	
}
