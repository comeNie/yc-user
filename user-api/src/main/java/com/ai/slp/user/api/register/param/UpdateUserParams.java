package com.ai.slp.user.api.register.param;

import java.io.Serializable;

/**
 * 注册用户信息参数 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhaogw
 */
public class UpdateUserParams implements Serializable {
    
    private UcContactInfoParams ucContactInfoParams ;
    
    private UcUserParams ucUserParams;
    
    private UcGroupKeyInfoParams ucGroupKeyInfoParams;
    
    private UcCustKeyInfoParams ucCustKeyInfoParams ;
    
    private UcBankKeyInfoParams ucBankKeyParams;

    public UcContactInfoParams getUcContactInfoParams() {
        return ucContactInfoParams;
    }

    public void setUcContactInfoParams(UcContactInfoParams ucContactInfoParams) {
        this.ucContactInfoParams = ucContactInfoParams;
    }

    public UcUserParams getUcUserParams() {
        return ucUserParams;
    }

    public void setUcUserParams(UcUserParams ucUserParams) {
        this.ucUserParams = ucUserParams;
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
    

}
