package com.ai.yc.user.dao.mapper.bo;

public class TUserWithBLOBs extends TUser {
    private String goodArea;

    private String goodUse;

    public String getGoodArea() {
        return goodArea;
    }

    public void setGoodArea(String goodArea) {
        this.goodArea = goodArea == null ? null : goodArea.trim();
    }

    public String getGoodUse() {
        return goodUse;
    }

    public void setGoodUse(String goodUse) {
        this.goodUse = goodUse == null ? null : goodUse.trim();
    }
}