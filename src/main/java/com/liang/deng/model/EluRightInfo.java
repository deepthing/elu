package com.liang.deng.model;

import java.util.Date;

public class EluRightInfo {
    private Integer rightCode;

    private String rightName;

    private Integer rightParentCode;

    private String description;

    private Date updateTime;

    private Date createTime;

    private Boolean delFlag;

    public Integer getRightCode() {
        return rightCode;
    }

    public void setRightCode(Integer rightCode) {
        this.rightCode = rightCode;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    public Integer getRightParentCode() {
        return rightParentCode;
    }

    public void setRightParentCode(Integer rightParentCode) {
        this.rightParentCode = rightParentCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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