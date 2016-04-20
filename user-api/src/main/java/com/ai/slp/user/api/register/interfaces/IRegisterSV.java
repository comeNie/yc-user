package com.ai.slp.user.api.register.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.register.param.UcBankKeyInfoParams;
import com.ai.slp.user.api.register.param.UcContactInfoParams;
import com.ai.slp.user.api.register.param.UcCustKeyInfoParams;
import com.ai.slp.user.api.register.param.UcGroupKeyInfoParams;
import com.ai.slp.user.api.register.param.UcUserAgreeParams;
import com.ai.slp.user.api.register.param.UcUserFileExtParams;
import com.ai.slp.user.api.register.param.UcUserParams;

/**
 * 用户注册 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhaogw
 */
public interface IRegisterSV {

    /**
     * 注册用户账户 </br>
     * @param request
     * @author zhaogw
     * @REG_0001
     */
    @interface InsertUcUser{}
    BaseResponse insertUcUser( UcUserParams ucUser, UcUserAgreeParams agreeInfo,UcContactInfoParams contactInfo);
    
    /**
     * 更新用户信息
     * Date: 2016年4月20日 <br>
     * Copyright (c) 2016 asiainfo.com <br>
     * 
     * @author zhaogw
     * @REG_0002
     */
    @interface UpdateUserInfo{}
    BaseResponse updateUserInfo(UcUserParams ucUser, UcUserAgreeParams agreeInfo,UcContactInfoParams contactInfo,UcUserFileExtParams userFileExt);
    
    /**
     * 查询单个用户信息</br> 
     *   
     * @param ucUser
     * @return
     * @author zhaogw
     * @REG_0003
     */
    BaseResponse searchUserInfo(UcUserParams ucUser);
    
    /**
     * 
     * 查询用户列表  </br> 
     * @param ucUser
     * @return
     * @author zhaogw
     * @REG_0004
     */
    BaseResponse searchUserIList(UcUserParams ucUser);
   
    /**
     * 
     * 新增个人客户详细信息  </br> 
     * @param ucCust
     * @return
     * @author zhaogw
     * @REG_0005
     */
    BaseResponse insertUcCustInfo(UcCustKeyInfoParams ucCust);
    
    /**
     * 
     *  查询用户详细信息</br> 
     * @param ucCust
     * @return
     * @author zhaogw
     * @REG_0006
     */
    BaseResponse searchUcCustInfo(UcCustKeyInfoParams ucCust);
    
    /**
     * 
     * 更新用户详细信息  </br> 
     * @param ucCust
     * @return
     * @author zhaogw
     * @REG_0007
     */
    BaseResponse updateUcCustInfo(UcCustKeyInfoParams ucCust);
    
    /**
     * 
     * 新增企业用户详细信息  </br> 
     * @param ucGroup
     * @return
     * @author zhaogw
     * @REG_0008
     */
    BaseResponse insertUcGroupInfo(UcGroupKeyInfoParams ucGroup);
    
    /**
     * 
     * 查询企业详细信息  </br> 
     * @param ucGroup
     * @return
     * @author zhaogw
     * @REG_0009
     */
    BaseResponse searchUcGroupInfo(UcGroupKeyInfoParams ucGroup);
    
    /**
     * 
     *  更新企业详细信息</br> 
     * @param ucGroup
     * @return
     * @author zhaogw
     * @REG_0010
     */
    BaseResponse updateUcGroupInfo(UcGroupKeyInfoParams ucGroup);
    
    /**
     * 
     *   新增用户联系人信息</br> 
     * @param ucContact
     * @return
     * @author zhaogw
     * @ApiDocMethod
     */
    BaseResponse insertUcContactInfo(UcContactInfoParams ucContact);
    
    /**
     * 
     *  查询用户联系人信息 </br> 
     * @param ucContact
     * @return
     * @author zhaogw
     * @ApiDocMethod
     */
    BaseResponse searchUcContactInfo(UcContactInfoParams ucContact);
    
    /**
     * 
     *  修改用户联系人信息  </br> 
     * @param ucContact
     * @return
     * @author zhaogw
     * @ApiDocMethod
     */
    BaseResponse updateUcContactInfo(UcContactInfoParams ucContact);
    
    /**
     * 
     *   插入用户银行卡信息</br> 
     * @param ucBank
     * @return
     * @author zhaogw
     * @ApiDocMethod
     */
    BaseResponse insertUcBankInfo(UcBankKeyInfoParams ucBank);
    
    /**
     * 
     * 查询用户银行卡信息  </br> 
     * @param ucBank
     * @return
     * @author zhaogw
     * @ApiDocMethod
     */
    BaseResponse searchUcBankInfo(UcBankKeyInfoParams ucBank);
    /**
     * 
     *   修改用户银行卡信息</br> 
     * @param ucBank
     * @return
     * @author zhaogw
     * @ApiDocMethod
     */
    BaseResponse updateUcBankInfo(UcBankKeyInfoParams ucBank);
    
    /**
     * 
     *   新增用户扩展信息</br> 
     * @param ucUserFileExt
     * @return
     * @author zhaogw
     * @ApiDocMethod
     */
    BaseResponse insertUcUserFileExtInfo(UcUserFileExtParams ucUserFileExt);
    
    /**
     * 
     *  查询用户扩展信息</br> 
     * @param ucUserFileExt
     * @return
     * @author zhaogw
     * @ApiDocMethod
     */
    BaseResponse searchUcUserFileExtInfo(UcUserFileExtParams ucUserFileExt);
    
    /**
     * 
     * 更新用户扩展信息  </br> 
     * @param ucUserFileExt
     * @return
     * @author zhaogw
     * @ApiDocMethod
     */
    BaseResponse updateUcUserFileExtInfo(UcUserFileExtParams ucUserFileExt);
    
    
    
}
