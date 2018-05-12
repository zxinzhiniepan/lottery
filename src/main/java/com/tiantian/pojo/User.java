package com.tiantian.pojo;


import com.tiantian.util.PojoModel;

import java.io.Serializable;
import java.util.Date;

public class User extends PojoModel implements Serializable {
  private static final long serialVersionUID = 1L;
  private Long uId;
  private String uName;
  private String uRealName;
  private String uPassword;
  private String uPhone;
  private String uWechat;
  private String uAlipay;
  private Long uLeaderId;
  private Date uTime;
  private Double balance;

  public User() {
  }

  public Long getuId() {
    return uId;
  }

  public void setuId(Long uId) {
    this.uId = uId;
  }

  public String getuName() {
    return uName;
  }

  public void setuName(String uName) {
    this.uName = uName;
  }

  public String getuRealName() {
    return uRealName;
  }

  public void setuRealName(String uRealName) {
    this.uRealName = uRealName;
  }

  public String getuPassword() {
    return uPassword;
  }

  public void setuPassword(String uPassword) {
    this.uPassword = uPassword;
  }

  public String getuPhone() {
    return uPhone;
  }

  public void setuPhone(String uPhone) {
    this.uPhone = uPhone;
  }

  public String getuWechat() {
    return uWechat;
  }

  public void setuWechat(String uWechat) {
    this.uWechat = uWechat;
  }

  public String getuAlipay() {
    return uAlipay;
  }

  public void setuAlipay(String uAlipay) {
    this.uAlipay = uAlipay;
  }

  public Long getuLeaderId() {
    return uLeaderId;
  }

  public void setuLeaderId(Long uLeaderId) {
    this.uLeaderId = uLeaderId;
  }

  public Date getuTime() {
    return uTime;
  }

  public void setuTime(Date uTime) {
    this.uTime = uTime;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

}
