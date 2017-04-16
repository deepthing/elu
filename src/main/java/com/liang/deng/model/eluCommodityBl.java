package com.liang.deng.model;

import java.util.Date;

public class EluCommodityBl {
    private Integer routeCode;

    private Integer blCommodityHscode;

    private Date uploadTime;

    private Date createTime;

    private Boolean delFlag;

    public Integer getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(Integer routeCode) {
        this.routeCode = routeCode;
    }

    public Integer getBlCommodityHscode() {
        return blCommodityHscode;
    }

    public void setBlCommodityHscode(Integer blCommodityHscode) {
        this.blCommodityHscode = blCommodityHscode;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
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