package com.tiantian.pojo;


import java.io.Serializable;

public class Playlaw implements Serializable {

  private Long pId;
  private Long gId;
  private String gName;
  private String pIntroduce;

  public Playlaw() {
  }

  public Long getpId() {
    return pId;
  }

  public void setpId(Long pId) {
    this.pId = pId;
  }

  public Long getgId() {
    return gId;
  }

  public void setgId(Long gId) {
    this.gId = gId;
  }

  public String getgName() {
    return gName;
  }

  public void setgName(String gName) {
    this.gName = gName;
  }

  public String getpIntroduce() {
    return pIntroduce;
  }

  public void setpIntroduce(String pIntroduce) {
    this.pIntroduce = pIntroduce;
  }
}
