package com.liang.deng.model;

import java.math.BigDecimal;

public class eluCommodityHscodeInfo {
    private String hsCode;

    private String goodsName;

    private String licenseCode;

    private BigDecimal generalRates;

    private BigDecimal preferentialTate;

    private String remark;

    private BigDecimal exprotTax;

    private BigDecimal consumptionTax;

    private BigDecimal valueAddedTax;

    private String unit1;

    private String unit2;

    public String getHsCode() {
        return hsCode;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public BigDecimal getGeneralRates() {
        return generalRates;
    }

    public void setGeneralRates(BigDecimal generalRates) {
        this.generalRates = generalRates;
    }

    public BigDecimal getPreferentialTate() {
        return preferentialTate;
    }

    public void setPreferentialTate(BigDecimal preferentialTate) {
        this.preferentialTate = preferentialTate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getExprotTax() {
        return exprotTax;
    }

    public void setExprotTax(BigDecimal exprotTax) {
        this.exprotTax = exprotTax;
    }

    public BigDecimal getConsumptionTax() {
        return consumptionTax;
    }

    public void setConsumptionTax(BigDecimal consumptionTax) {
        this.consumptionTax = consumptionTax;
    }

    public BigDecimal getValueAddedTax() {
        return valueAddedTax;
    }

    public void setValueAddedTax(BigDecimal valueAddedTax) {
        this.valueAddedTax = valueAddedTax;
    }

    public String getUnit1() {
        return unit1;
    }

    public void setUnit1(String unit1) {
        this.unit1 = unit1;
    }

    public String getUnit2() {
        return unit2;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2;
    }
}