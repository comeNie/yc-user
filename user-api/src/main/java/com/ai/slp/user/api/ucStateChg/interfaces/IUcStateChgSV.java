package com.ai.slp.user.api.ucStateChg.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ucStateChg.param.QueryStateChgRequest;
import com.ai.slp.user.api.ucStateChg.param.QueryStateChgResponse;
import com.ai.slp.user.api.ucStateChg.param.UcStateChgParamsRequest;

public interface IUcStateChgSV {

    /**
     * 
     * 用户状态轨迹状态轨迹新增</br>
     * 
     * @param contactsGroup
     * @return
     * @author zhangyuehong
     * @ApiDocMethod
     */
    @interface InsertUcStateChgInfo {
    };

    BaseResponse insertUcStateChgInfo(UcStateChgParamsRequest ucStateChgParam);

    /**
     * 
     * 用户状态轨迹状态轨迹修改</br>
     * 
     * @param contactsGroup
     * @return
     * @author zhangyuehong
     * @ApiDocMethod
     */
    @interface UpdateUcStateChgInfo {
    };

    BaseResponse updateUcStateChgInfo(UcStateChgParamsRequest ucStateChgParam);

    /**
     * 用户状态轨迹状态轨迹获取
     * 
     * @param stateChgRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER
     */
    @interface QueryStateChg {
    }

    QueryStateChgResponse queryStateChg(QueryStateChgRequest stateChgRequest)
            throws BusinessException, SystemException;
}
