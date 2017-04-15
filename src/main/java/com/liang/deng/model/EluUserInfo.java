package com.liang.deng.model;

import java.util.Date;

public class EluUserInfo {
    private Integer userCode;

    private String userName;

    private Integer userEmailNumber;

    private Integer userPhoneNumber;

    private String userPassword;

    private String userCompany;

    private Boolean userAccountType;

    private Long userAccountBalance;

    private Long userAccountDeposit;

    private String userCountry;

    private String userBandAlipay;

    private String userBandWechat;

    private Boolean isActive;

    private Integer loginCount;

    private Date lastLoginDate;

    private Date createDate;

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(Integer userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserEmailNumber() {
        return userEmailNumber;
    }

    public void setUserEmailNumber(Integer userEmailNumber) {
        this.userEmailNumber = userEmailNumber;
    }

    public Integer getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(Integer userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    public Boolean getUserAccountType() {
        return userAccountType;
    }

    public void setUserAccountType(Boolean userAccountType) {
        this.userAccountType = userAccountType;
    }

    public Long getUserAccountBalance() {
        return userAccountBalance;
    }

    public void setUserAccountBalance(Long userAccountBalance) {
        this.userAccountBalance = userAccountBalance;
    }

    public Long getUserAccountDeposit() {
        return userAccountDeposit;
    }

    public void setUserAccountDeposit(Long userAccountDeposit) {
        this.userAccountDeposit = userAccountDeposit;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserBandAlipay() {
        return userBandAlipay;
    }

    public void setUserBandAlipay(String userBandAlipay) {
        this.userBandAlipay = userBandAlipay;
    }

    public String getUserBandWechat() {
        return userBandWechat;
    }

    public void setUserBandWechat(String userBandWechat) {
        this.userBandWechat = userBandWechat;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}