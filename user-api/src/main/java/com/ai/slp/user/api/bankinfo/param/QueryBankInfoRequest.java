package com.ai.slp.user.api.bankinfo.param;

import com.ai.opt.base.vo.BaseInfo;
import com.sun.istack.internal.NotNull;

/**
 * 查询用户银行信息入参 Date: 2016年4月28日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class QueryBankInfoRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * userId
     */
    @NotNull
    private Long userId;

    private Integer pageNo;

    private Integer pageSize;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
