package com.tiantian.pojo;


import java.io.Serializable;

public class Odds implements Serializable {
  private static final long serialVersionUID = 1L;
  private Long oId;
  private Long pId;
  private Long oNumber;
  private Double oRate;

  public Odds() {
  }

  public Long getoId() {
    return oId;
  }

  public void setoId(Long oId) {
    this.oId = oId;
  }

  public Long getpId() {
    return pId;
  }

  public void setpId(Long pId) {
    this.pId = pId;
  }

  public Long getoNumber() {
    return oNumber;
  }

  public void setoNumber(Long oNumber) {
    this.oNumber = oNumber;
  }

  public Double getoRate() {
    return oRate;
  }

  public void setoRate(Double oRate) {
    this.oRate = oRate;
  }
}
