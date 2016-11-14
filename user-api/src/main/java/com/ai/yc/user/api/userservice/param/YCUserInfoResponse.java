package com.ai.yc.user.api.userservice.param;

import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月2日 上午11:27:41 
 * @version 
 * @since  
 */
public class YCUserInfoResponse extends BaseResponse {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2997865058532181384L;
	/**
	 * ucenter获取的用户名
	 */
	private String username;
	/**
	 * 用户Id
	 */
    private String userId;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 生日
     */
    private Timestamp birthday;
    /**
     * 手机
     */
    private String mobilePhone;
    /**
     * qq 
     */
    private String qq;
    /**
     * 地址
     */
    private String address;
    /**
     * 市
     */
    private String cnCity;
    /**
     * 省
     */
    private String province;
    /**
     * 国家
     */
    private String country;
    /**
     * 是否译员
     */
    private Integer isRanslator;
    
    private Integer isAdmin;
    /**
     * 姓名
     */
    private String fullName;
    /**
     * 头像id
     */
    private String portraitId;
    /**
     * 头像url
     */
    private String url;
    /**
     * 个人账户id
     */
    private long userAccountId;
    

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Timestamp getBirthday() {
		return birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCnCity() {
		return cnCity;
	}

	public void setCnCity(String cnCity) {
		this.cnCity = cnCity;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getIsRanslator() {
		return isRanslator;
	}

	public void setIsRanslator(Integer isRanslator) {
		this.isRanslator = isRanslator;
	}

	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPortraitId() {
		return portraitId;
	}

	public void setPortraitId(String portraitId) {
		this.portraitId = portraitId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(long userAccountId) {
		this.userAccountId = userAccountId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
