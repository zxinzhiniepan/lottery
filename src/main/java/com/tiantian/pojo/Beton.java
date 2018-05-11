package com.tiantian.pojo;


import java.io.Serializable;
import java.util.Date;

public class Beton implements Serializable {

  private Long boId;
  private Long uId;
  private Long anId;
  private Date boTime;

  public Beton() {
  }

  public Long getBoId() {
    return boId;
  }

  public void setBoId(Long boId) {
    this.boId = boId;
  }

  public Long getuId() {
    return uId;
  }

  public void setuId(Long uId) {
    this.uId = uId;
  }

  public Long getAnId() {
    return anId;
  }

  public void setAnId(Long anId) {
    this.anId = anId;
  }

  public Date getBoTime() {
    return boTime;
  }

  public void setBoTime(Date boTime) {
    this.boTime = boTime;
  }
}
