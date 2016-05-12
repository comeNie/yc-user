package com.ai.slp.user.api.register.param;

import java.io.Serializable;

/**
 * 注册用户信息参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhaogw
 */
public class RegisterParamsRequest implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private UcContactInfoParams ucContactInfoParams ;
    
    private UcUserParams ucUserParam;
    
    private UcGroupKeyInfoParams ucGroupKeyInfoParams;
    
    private UcCustKeyInfoParams ucCustKeyInfoParams ;
    
    private UcBankKeyInfoParams ucBankKeyParams;

    private UcUserAgreeParams agreeInfoParams;
    
    public UcContactInfoParams getUcContactInfoParams() {
        return ucContactInfoParams;
    }

    public void setUcContactInfoParams(UcContactInfoParams ucContactInfoParams) {
        this.ucContactInfoParams = ucContactInfoParams;
    }

    public UcUserParams getUcUserParam() {
        return ucUserParam;
    }

    public void setUcUserParam(UcUserParams ucUserParam) {
        this.ucUserParam = ucUserParam;
    }

    public UcGroupKeyInfoParams getUcGroupKeyInfoParams() {
        return ucGroupKeyInfoParams;
    }

    public void setUcGroupKeyInfoParams(UcGroupKeyInfoParams ucGroupKeyInfoParams) {
        this.ucGroupKeyInfoParams = ucGroupKeyInfoParams;
    }

    public UcCustKeyInfoParams getUcCustKeyInfoParams() {
        return ucCustKeyInfoParams;
    }

    public void setUcCustKeyInfoParams(UcCustKeyInfoParams ucCustKeyInfoParams) {
        this.ucCustKeyInfoParams = ucCustKeyInfoParams;
    }

    public UcBankKeyInfoParams getUcBankKeyParams() {
        return ucBankKeyParams;
    }

    public void setUcBankKeyParams(UcBankKeyInfoParams ucBankKeyParams) {
        this.ucBankKeyParams = ucBankKeyParams;
    }

    public UcUserAgreeParams getAgreeInfoParams() {
        return agreeInfoParams;
    }

    public void setAgreeInfoParams(UcUserAgreeParams agreeInfoParams) {
        this.agreeInfoParams = agreeInfoParams;
    }
    

}
