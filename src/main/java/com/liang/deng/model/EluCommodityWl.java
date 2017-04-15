package com.liang.deng.model;

import java.util.Date;

public class EluCommodityWl extends EluCommodityWlKey {
    private Integer wlCommodityHscode;

    private Date updateTime;

    private Date createTime;

    private Boolean delFlag;

    public Integer getWlCommodityHscode() {
        return wlCommodityHscode;
    }

    public void setWlCommodityHscode(Integer wlCommodityHscode) {
        this.wlCommodityHscode = wlCommodityHscode;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }
}