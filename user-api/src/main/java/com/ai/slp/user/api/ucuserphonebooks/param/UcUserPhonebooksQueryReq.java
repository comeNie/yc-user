package com.ai.slp.user.api.ucuserphonebooks.param;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.opt.base.vo.PageInfo;

public class UcUserPhonebooksQueryReq extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 分页信息
     */
    PageInfo<UserPhonebook> pageInfo;

    /**
     * 省份编码
     */
    private String provinceCode;

    /**
     * 地市编码
     */
    private String cityCode;

    /**
     * 基础运营商编码
     */
    private String basicOrgId;

    /**
     * 电话号码
     */
    private String telNo;

    /**
     * 姓名
     */
    private String telName;

    public PageInfo<UserPhonebook> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<UserPhonebook> pageInfo) {
        this.pageInfo = pageInfo;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getBasicOrgId() {
        return basicOrgId;
    }

    public void setBasicOrgId(String basicOrgId) {
        this.basicOrgId = basicOrgId;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getTelName() {
        return telName;
    }

    public void setTelName(String telName) {
        this.telName = telName;
    }

}
