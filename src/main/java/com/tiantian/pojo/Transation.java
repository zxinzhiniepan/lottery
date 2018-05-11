package com.tiantian.pojo;


public class Transation {

  private long tId;
  private long uId;
  private long tClass;
  private long tAccount;
  private double money;
  private java.sql.Timestamp dTime;
  private java.sql.Timestamp cTime;
  private long tSuccess;
  private long mId;


  public long getTId() {
    return tId;
  }

  public void setTId(long tId) {
    this.tId = tId;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public long getTClass() {
    return tClass;
  }

  public void setTClass(long tClass) {
    this.tClass = tClass;
  }


  public long getTAccount() {
    return tAccount;
  }

  public void setTAccount(long tAccount) {
    this.tAccount = tAccount;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public java.sql.Timestamp getDTime() {
    return dTime;
  }

  public void setDTime(java.sql.Timestamp dTime) {
    this.dTime = dTime;
  }


  public java.sql.Timestamp getCTime() {
    return cTime;
  }

  public void setCTime(java.sql.Timestamp cTime) {
    this.cTime = cTime;
  }


  public long getTSuccess() {
    return tSuccess;
  }

  public void setTSuccess(long tSuccess) {
    this.tSuccess = tSuccess;
  }


  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = mId;
  }

}
