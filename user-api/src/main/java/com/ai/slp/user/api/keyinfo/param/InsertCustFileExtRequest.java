package com.ai.slp.user.api.keyinfo.param;

import java.util.List;

import com.ai.opt.base.vo.BaseInfo;

public class InsertCustFileExtRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    private List<CmCustFileExtVo> list;

    public List<CmCustFileExtVo> getList() {
        return list;
    }

    public void setList(List<CmCustFileExtVo> list) {
        this.list = list;
    }

}
