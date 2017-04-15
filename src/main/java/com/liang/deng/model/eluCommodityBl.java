package com.liang.deng.model;

import java.util.Date;

public class EluCommodityBl extends EluCommodityBlKey {
    private Integer blCommodityHscode;

    private Date uploadTime;

    private Date createTime;

    private Boolean delFlag;

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