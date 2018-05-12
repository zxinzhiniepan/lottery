package com.tiantian.pojo;


import com.tiantian.util.PojoModel;

import java.io.Serializable;
import java.util.Date;

public class Manager extends PojoModel implements Serializable {
  private static final long serialVersionUID = 1L;
  private Long mId;
  private Long uId;
  private Long recharge;
  private Long modifiedPwd;
  private Long subordinate;
  private Long bill;
  private Long transactionLog;
  private Date addTime;

  public Manager() {
  }

  public Long getmId() {
    return mId;
  }

  public void setmId(Long mId) {
    this.mId = mId;
  }

  public Long getuId() {
    return uId;
  }

  public void setuId(Long uId) {
    this.uId = uId;
  }

  public Long getRecharge() {
    return recharge;
  }

  public void setRecharge(Long recharge) {
    this.recharge = recharge;
  }

  public Long getModifiedPwd() {
    return modifiedPwd;
  }

  public void setModifiedPwd(Long modifiedPwd) {
    this.modifiedPwd = modifiedPwd;
  }

  public Long getSubordinate() {
    return subordinate;
  }

  public void setSubordinate(Long subordinate) {
    this.subordinate = subordinate;
  }

  public Long getBill() {
    return bill;
  }

  public void setBill(Long bill) {
    this.bill = bill;
  }

  public Long getTransactionLog() {
    return transactionLog;
  }

  public void setTransactionLog(Long transactionLog) {
    this.transactionLog = transactionLog;
  }

  public Date getAddTime() {
    return addTime;
  }

  public void setAddTime(Date addTime) {
    this.addTime = addTime;
  }
}
