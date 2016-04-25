package com.ai.slp.user.api.login.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * 登录服务出参 Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class LoginResponse extends BaseResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 返回值
     */
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
