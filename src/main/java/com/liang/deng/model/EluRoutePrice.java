package com.liang.deng.model;

import java.util.Date;

public class EluRoutePrice extends EluRoutePriceKey {
    private Long unitPrice;

    private String currencyCode;

    private String priceMethod;

    private Long minQuantity;

    private Long maxQuantity;

    private Long unitQuantity;

    private String uom;

    private String taxIncluded;

    private String befIncluded;

    private String insuranceIncluded;

    private Date updateTime;

    private Date createTime;

    private Boolean delFlag;

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getPriceMethod() {
        return priceMethod;
    }

    public void setPriceMethod(String priceMethod) {
        this.priceMethod = priceMethod;
    }

    public Long getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(Long minQuantity) {
        this.minQuantity = minQuantity;
    }

    public Long getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(Long maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public Long getUnitQuantity() {
        return unitQuantity;
    }

    public void setUnitQuantity(Long unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getTaxIncluded() {
        return taxIncluded;
    }

    public void setTaxIncluded(String taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    public String getBefIncluded() {
        return befIncluded;
    }

    public void setBefIncluded(String befIncluded) {
        this.befIncluded = befIncluded;
    }

    public String getInsuranceIncluded() {
        return insuranceIncluded;
    }

    public void setInsuranceIncluded(String insuranceIncluded) {
        this.insuranceIncluded = insuranceIncluded;
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