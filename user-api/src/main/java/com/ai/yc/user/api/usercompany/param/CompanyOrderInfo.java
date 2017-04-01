package com.ai.yc.user.api.usercompany.param;

import java.sql.Timestamp;
import java.util.List;

import com.ai.opt.base.vo.BaseInfo;


public class CompanyOrderInfo extends BaseInfo{


	private static final long serialVersionUID = 1L;
	/**
	 * 下单昵称
	 */
	private String orderNickName;
	/**
	 * 企业名称
	 */
	private String companyName;
	/**
	 * 企业角色
	 */
	private String companyRole;
	
	/**
	 * 订单ID
	 */
	private Long orderId;
	/**
	 * 业务标识
	 */

	private String flag;

	/**
	 * 用户类型
	 */
	private String userType;

	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 用户昵称
	 */
	private String userName;
	/**
	 * 订单来源
	 */
	private String chlId;
	/**
	 * 订单类型
	 */
	private String orderType;
	/**
	 * 业务类型
	 */
	private String busiType;
	/**
	 * 后场订单状态
	 */
	private String state;
	/**
	 * 译员类型
	 */
	private String interperType;
	/**
	 * lsp编号
	 */
	private String lspId;
	/**
	 * lsp名称
	 */
	private String lspName;
	
	/**
	 * 译员昵称
	 */
	private String interperName;
	/**
	 * 下单时间
	 */
	private Timestamp orderTime;

	/**
	 * 支付方式
	 */
	private String payStyle;
	/**
	 * 总费用
	 */
	private long totalFee;
	/**
	 * 平台佣金
	 */
	private long platFee;
	/**
	 * 译员佣金
	 */
	private long interperFee;
	/**
	 * 币种
	 */
	private String currencyUnit;

	/**
	 * 总优惠费用
	 */
	private Long discountFee;
	/**
	 * 译员级别
	 */
	private String interLevel;
	/**
	 * 译员账户
	 */
	private String translatorAccount;

	public Long getDiscountFee() {
		return discountFee;
	}

	public void setDiscountFee(Long discountFee) {
		this.discountFee = discountFee;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getChlId() {
		return chlId;
	}

	public void setChlId(String chlId) {
		this.chlId = chlId;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getBusiType() {
		return busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInterperType() {
		return interperType;
	}

	public void setInterperType(String interperType) {
		this.interperType = interperType;
	}

	public String getLspName() {
		return lspName;
	}

	public void setLspName(String lspName) {
		this.lspName = lspName;
	}


	public String getInterperName() {
		return interperName;
	}

	public void setInterperName(String interperName) {
		this.interperName = interperName;
	}

	public Timestamp getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}


	public String getPayStyle() {
		return payStyle;
	}

	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}


	public String getLspId() {
		return lspId;
	}

	public void setLspId(String lspId) {
		this.lspId = lspId;
	}

	public long getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(long totalFee) {
		this.totalFee = totalFee;
	}

	public String getCurrencyUnit() {
		return currencyUnit;
	}

	public void setCurrencyUnit(String currencyUnit) {
		this.currencyUnit = currencyUnit;
	}



	public String getInterLevel() {
		return interLevel;
	}

	public void setInterLevel(String interLevel) {
		this.interLevel = interLevel;
	}


	public long getPlatFee() {
		return platFee;
	}

	public void setPlatFee(long platFee) {
		this.platFee = platFee;
	}

	public long getInterperFee() {
		return interperFee;
	}

	public void setInterperFee(long interperFee) {
		this.interperFee = interperFee;
	}

	public String getOrderNickName() {
		return orderNickName;
	}

	public void setOrderNickName(String orderNickName) {
		this.orderNickName = orderNickName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyRole() {
		return companyRole;
	}

	public void setCompanyRole(String companyRole) {
		this.companyRole = companyRole;
	}

	public String getTranslatorAccount() {
		return translatorAccount;
	}

	public void setTranslatorAccount(String translatorAccount) {
		this.translatorAccount = translatorAccount;
	}
	
}
