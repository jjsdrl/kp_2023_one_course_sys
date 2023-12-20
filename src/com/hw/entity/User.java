package com.hw.entity;

import java.util.Date;

public class User {
    private int userId;
    private String userAccount;
    private String userPassword;
    private String userName;
    private String userGender;
    private Date userBirth;
    private int userAge;
    private String userAddress;
    private String userType;
    private String userPhone;

    public User() {
    }

    public User(int userId, String userAccount, String userPassword, String userName, String userGender, Date userBirth, int userAge, String userAddress, String userType, String userPhone) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userGender = userGender;
        this.userBirth = userBirth;
        this.userAge = userAge;
        this.userAddress = userAddress;
        this.userType = userType;
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userBirth=" + userBirth +
                ", userAge=" + userAge +
                ", userAddress='" + userAddress + '\'' +
                ", userType='" + userType + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
