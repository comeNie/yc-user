package com.ai.slp.user.api.register.impl;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.register.interfaces.IRegisterSV;
import com.ai.slp.user.api.register.param.RegisterParamsResponse;
import com.ai.slp.user.api.register.param.UcBankKeyInfoParams;
import com.ai.slp.user.api.register.param.UcContactInfoParams;
import com.ai.slp.user.api.register.param.UcCustKeyInfoParams;
import com.ai.slp.user.api.register.param.UcGroupKeyInfoParams;
import com.ai.slp.user.api.register.param.UcUserAgreeParams;
import com.ai.slp.user.api.register.param.UcUserFileExtParams;
import com.ai.slp.user.api.register.param.UcUserParams;

public class RegisterSVImpl implements IRegisterSV {

    @Override
    public BaseResponse insertUcUser(UcUserParams ucUser, UcUserAgreeParams agreeInfo,
            UcContactInfoParams contactInfo) {
        return null;
    }

    @Override
    public BaseResponse updateUserInfo(UcUserParams ucUser, UcUserAgreeParams agreeInfo,
            UcContactInfoParams contactInfo, UcUserFileExtParams userFileExt) {
        return null;
    }

    @Override
    public RegisterParamsResponse searchUserInfo(UcUserParams ucUser) {
        return null;
    }

    @Override
    public BaseResponse searchUserIList(UcUserParams ucUser) {
        return null;
    }

    @Override
    public BaseResponse insertUcCustInfo(UcCustKeyInfoParams ucCust) {
        return null;
    }

    @Override
    public BaseResponse searchUcCustInfo(UcCustKeyInfoParams ucCust) {
        return null;
    }

    @Override
    public BaseResponse updateUcCustInfo(UcCustKeyInfoParams ucCust) {
        return null;
    }

    @Override
    public BaseResponse insertUcGroupInfo(UcGroupKeyInfoParams ucGroup) {
        return null;
    }

    @Override
    public BaseResponse searchUcGroupInfo(UcGroupKeyInfoParams ucGroup) {
        return null;
    }

    @Override
    public BaseResponse updateUcGroupInfo(UcGroupKeyInfoParams ucGroup) {
        return null;
    }

    @Override
    public BaseResponse insertUcContactInfo(UcContactInfoParams ucContact) {
        return null;
    }

    @Override
    public BaseResponse searchUcContactInfo(UcContactInfoParams ucContact) {
        return null;
    }

    @Override
    public BaseResponse updateUcContactInfo(UcContactInfoParams ucContact) {
        return null;
    }

    @Override
    public BaseResponse insertUcBankInfo(UcBankKeyInfoParams ucBank) {
        return null;
    }

    @Override
    public BaseResponse searchUcBankInfo(UcBankKeyInfoParams ucBank) {
        return null;
    }

    @Override
    public BaseResponse updateUcBankInfo(UcBankKeyInfoParams ucBank) {
        return null;
    }

    @Override
    public BaseResponse insertUcUserFileExtInfo(UcUserFileExtParams ucUserFileExt) {
        return null;
    }

    @Override
    public BaseResponse searchUcUserFileExtInfo(UcUserFileExtParams ucUserFileExt) {
        return null;
    }

    @Override
    public BaseResponse updateUcUserFileExtInfo(UcUserFileExtParams ucUserFileExt) {
        return null;
    }

}
