package com.ai.slp.user.api.keyinfo.param;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class QueryGroupInfoResponse extends BaseResponse {

    private static final long serialVersionUID = 1L;

    PageInfo<UcGroupKeyInfoVo> pageInfo;

    public PageInfo<UcGroupKeyInfoVo> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<UcGroupKeyInfoVo> pageInfo) {
        this.pageInfo = pageInfo;
    }

}
