package com.tiantian.pojo;


import java.io.Serializable;
import java.util.Date;

public class Betonnumber implements Serializable {

  private Long bonId;
  private Long boId;
  private Long bonKey;
  private Double bonMoney;
  private Date bonTime;
  private Double rate;

  public Betonnumber() {
  }

  public Long getBonId() {
    return bonId;
  }

  public void setBonId(Long bonId) {
    this.bonId = bonId;
  }

  public Long getBoId() {
    return boId;
  }

  public void setBoId(Long boId) {
    this.boId = boId;
  }

  public Long getBonKey() {
    return bonKey;
  }

  public void setBonKey(Long bonKey) {
    this.bonKey = bonKey;
  }

  public Double getBonMoney() {
    return bonMoney;
  }

  public void setBonMoney(Double bonMoney) {
    this.bonMoney = bonMoney;
  }

  public Date getBonTime() {
    return bonTime;
  }

  public void setBonTime(Date bonTime) {
    this.bonTime = bonTime;
  }

  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }
}
