package com.liang.deng.model;

import java.util.Date;

public class EluRouteDetail {
    private Integer id;

    private String routeCode;

    private String routeName;

    private String routeComment;

    private String supplier;

    private String supplierMethod;

    private String locationFrom;

    private String locationTo;

    private Date minCycleTime;

    private Date maxCycleTime;

    private String blCommodityGroup;

    private String wlCommodityGroup;

    private Long lostPercentage;

    private Long damagePercenteage;

    private Long successPercenteage;

    private Integer userRating;

    private Long minWeight;

    private Long maxWeight;

    private Long minVolume;

    private Long maxVolume;

    private Date creatTime;

    private Date updateTime;

    private Boolean delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getRouteComment() {
        return routeComment;
    }

    public void setRouteComment(String routeComment) {
        this.routeComment = routeComment;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSupplierMethod() {
        return supplierMethod;
    }

    public void setSupplierMethod(String supplierMethod) {
        this.supplierMethod = supplierMethod;
    }

    public String getLocationFrom() {
        return locationFrom;
    }

    public void setLocationFrom(String locationFrom) {
        this.locationFrom = locationFrom;
    }

    public String getLocationTo() {
        return locationTo;
    }

    public void setLocationTo(String locationTo) {
        this.locationTo = locationTo;
    }

    public Date getMinCycleTime() {
        return minCycleTime;
    }

    public void setMinCycleTime(Date minCycleTime) {
        this.minCycleTime = minCycleTime;
    }

    public Date getMaxCycleTime() {
        return maxCycleTime;
    }

    public void setMaxCycleTime(Date maxCycleTime) {
        this.maxCycleTime = maxCycleTime;
    }

    public String getBlCommodityGroup() {
        return blCommodityGroup;
    }

    public void setBlCommodityGroup(String blCommodityGroup) {
        this.blCommodityGroup = blCommodityGroup;
    }

    public String getWlCommodityGroup() {
        return wlCommodityGroup;
    }

    public void setWlCommodityGroup(String wlCommodityGroup) {
        this.wlCommodityGroup = wlCommodityGroup;
    }

    public Long getLostPercentage() {
        return lostPercentage;
    }

    public void setLostPercentage(Long lostPercentage) {
        this.lostPercentage = lostPercentage;
    }

    public Long getDamagePercenteage() {
        return damagePercenteage;
    }

    public void setDamagePercenteage(Long damagePercenteage) {
        this.damagePercenteage = damagePercenteage;
    }

    public Long getSuccessPercenteage() {
        return successPercenteage;
    }

    public void setSuccessPercenteage(Long successPercenteage) {
        this.successPercenteage = successPercenteage;
    }

    public Integer getUserRating() {
        return userRating;
    }

    public void setUserRating(Integer userRating) {
        this.userRating = userRating;
    }

    public Long getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(Long minWeight) {
        this.minWeight = minWeight;
    }

    public Long getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Long maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Long getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(Long minVolume) {
        this.minVolume = minVolume;
    }

    public Long getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(Long maxVolume) {
        this.maxVolume = maxVolume;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }
}