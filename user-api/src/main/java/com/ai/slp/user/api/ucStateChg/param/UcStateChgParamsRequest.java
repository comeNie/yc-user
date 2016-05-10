package com.ai.slp.user.api.ucStateChg.param;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.ucStateChg.interfaces.IUcStateChgSV;

public class UcStateChgParamsRequest extends BaseInfo implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @NotNull(message = "用户ID不能为空", groups = { IUcStateChgSV.InsertUcStateChgInfo.class,
            IUcStateChgSV.UpdateUcStateChgInfo.class })
    @Size(max = 18, groups = { IUcStateChgSV.InsertUcStateChgInfo.class,
            IUcStateChgSV.UpdateUcStateChgInfo.class })
    private Long userId;

    /**
     * 状态变更流水ID
     */
    @NotNull(message = "状态变更流水ID不能为空", groups = { IUcStateChgSV.InsertUcStateChgInfo.class,
            IUcStateChgSV.UpdateUcStateChgInfo.class })
    @Size(max = 32, groups = { IUcStateChgSV.InsertUcStateChgInfo.class,
            IUcStateChgSV.UpdateUcStateChgInfo.class })
    private String stateChgId;

    /**
     * 业务操作类型
     */
    private String operType;

    /**
     * 原状态
     */
    private String oldState;

    /**
     * 新状态
     */
    private String newState;

    /**
     * 状态原因描述
     */
    private String chgdesc;

    /**
     * 状态变化时间
     */
    private Timestamp chgTime;

    /**
     * 操作渠道
     */
    private String chlId;

    /**
     * 操作员
     */
    private long operId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStateChgId() {
        return stateChgId;
    }

    public void setStateChgId(String stateChgId) {
        this.stateChgId = stateChgId;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public String getOldState() {
        return oldState;
    }

    public void setOldState(String oldState) {
        this.oldState = oldState;
    }

    public String getNewState() {
        return newState;
    }

    public void setNewState(String newState) {
        this.newState = newState;
    }

    public String getChgdesc() {
        return chgdesc;
    }

    public void setChgdesc(String chgdesc) {
        this.chgdesc = chgdesc;
    }

    public Timestamp getChgTime() {
        return chgTime;
    }

    public void setChgTime(Timestamp chgTime) {
        this.chgTime = chgTime;
    }

    public String getChlId() {
        return chlId;
    }

    public void setChlId(String chlId) {
        this.chlId = chlId;
    }

    public long getOperId() {
        return operId;
    }

    public void setOperId(long operId) {
        this.operId = operId;
    }

}
