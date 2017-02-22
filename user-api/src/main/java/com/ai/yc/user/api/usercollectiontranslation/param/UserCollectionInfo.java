package com.ai.yc.user.api.usercollectiontranslation.param;

import com.ai.opt.base.vo.BaseResponse;

public class UserCollectionInfo extends BaseResponse{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 主键Id
	 */
	private String id;
	/**
	 * 用户Id
	 */
	private String userId;
	/**
	 * 原文
	 */
	private String  original;
	/**
	 * 译文
	 */
	private String translation;
	/**
	 * 收藏时间
	 */
	private String collectTime;
	
	/**
	 * 源语言
	 */
	private String sourceLanguage;
	/**
	 * 目标语言
	 */
	private String targetLanguage;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOriginal() {
		return original;
	}
	public void setOriginal(String original) {
		this.original = original;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	public String getCollectTime() {
		return collectTime;
	}
	public void setCollectTime(String collectTime) {
		this.collectTime = collectTime;
	}
	public String getSourceLanguage() {
		return sourceLanguage;
	}
	public void setSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
	}
	public String getTargetLanguage() {
		return targetLanguage;
	}
	public void setTargetLanguage(String targetLanguage) {
		this.targetLanguage = targetLanguage;
	}
	
}
