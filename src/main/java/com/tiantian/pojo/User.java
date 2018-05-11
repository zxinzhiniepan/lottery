package com.tiantian.pojo;


public class User {

  private long uId;
  private String uName;
  private String uRealName;
  private String uPassword;
  private String uPhone;
  private String uWechat;
  private String uAlipay;
  private long uLeaderId;
  private java.sql.Timestamp uTime;
  private double balance;


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public String getUName() {
    return uName;
  }

  public void setUName(String uName) {
    this.uName = uName;
  }


  public String getURealName() {
    return uRealName;
  }

  public void setURealName(String uRealName) {
    this.uRealName = uRealName;
  }


  public String getUPassword() {
    return uPassword;
  }

  public void setUPassword(String uPassword) {
    this.uPassword = uPassword;
  }


  public String getUPhone() {
    return uPhone;
  }

  public void setUPhone(String uPhone) {
    this.uPhone = uPhone;
  }


  public String getUWechat() {
    return uWechat;
  }

  public void setUWechat(String uWechat) {
    this.uWechat = uWechat;
  }


  public String getUAlipay() {
    return uAlipay;
  }

  public void setUAlipay(String uAlipay) {
    this.uAlipay = uAlipay;
  }


  public long getULeaderId() {
    return uLeaderId;
  }

  public void setULeaderId(long uLeaderId) {
    this.uLeaderId = uLeaderId;
  }


  public java.sql.Timestamp getUTime() {
    return uTime;
  }

  public void setUTime(java.sql.Timestamp uTime) {
    this.uTime = uTime;
  }


  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

}
