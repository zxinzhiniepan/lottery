package com.sample;


public class Manager {

  private long mId;
  private long uId;
  private long recharge;
  private long modifiedPwd;
  private long subordinate;
  private long bill;
  private long transactionLog;
  private java.sql.Timestamp addTime;


  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = mId;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public long getRecharge() {
    return recharge;
  }

  public void setRecharge(long recharge) {
    this.recharge = recharge;
  }


  public long getModifiedPwd() {
    return modifiedPwd;
  }

  public void setModifiedPwd(long modifiedPwd) {
    this.modifiedPwd = modifiedPwd;
  }


  public long getSubordinate() {
    return subordinate;
  }

  public void setSubordinate(long subordinate) {
    this.subordinate = subordinate;
  }


  public long getBill() {
    return bill;
  }

  public void setBill(long bill) {
    this.bill = bill;
  }


  public long getTransactionLog() {
    return transactionLog;
  }

  public void setTransactionLog(long transactionLog) {
    this.transactionLog = transactionLog;
  }


  public java.sql.Timestamp getAddTime() {
    return addTime;
  }

  public void setAddTime(java.sql.Timestamp addTime) {
    this.addTime = addTime;
  }

}
