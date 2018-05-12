package com.tiantian.pojo;


import java.io.Serializable;

public class Message implements Serializable {
  private static final long serialVersionUID = 1L;
  private Long mId;
  private String mName;
  private Double mMoney;
  private Long anid;

  public Message() {
  }

  public Long getmId() {
    return mId;
  }

  public void setmId(Long mId) {
    this.mId = mId;
  }

  public String getmName() {
    return mName;
  }

  public void setmName(String mName) {
    this.mName = mName;
  }

  public Double getmMoney() {
    return mMoney;
  }

  public void setmMoney(Double mMoney) {
    this.mMoney = mMoney;
  }

  public Long getAnid() {
    return anid;
  }

  public void setAnid(Long anid) {
    this.anid = anid;
  }
}
