package com.ai.yc.user.api.userservice.param;

import java.lang.reflect.Field;
import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月2日 上午11:27:41 
 * @version 
 * @since  
 */
public class YCUserInfoResponse extends BaseResponse {


	@Override
	public String toString() {
		return "YCUserInfoResponse [responseCode=" + responseCode + ", userId=" + userId + ", nickname=" + nickname
				+ ", sex=" + sex + ", birthday=" + birthday + ", mobilePhone=" + mobilePhone + ", qq=" + qq
				+ ", address=" + address + ", cnCity=" + cnCity + ", province=" + province + ", country=" + country
				+ ", isRanslator=" + isRanslator + ", isAdmin=" + isAdmin + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2997865058532181384L;

	private String responseCode;
	
    private String userId;

    private String nickname;

    private Integer sex;

    private Timestamp birthday;

    private String mobilePhone;

    private String qq;

    private String address;

    private String cnCity;

    private String province;

    private String country;

    private Integer isRanslator;

    private Integer isAdmin;

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
	
}
