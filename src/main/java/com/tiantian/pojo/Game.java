package com.tiantian.pojo;


import com.tiantian.util.PojoModel;

import java.io.Serializable;

public class Game extends PojoModel implements Serializable {
  private static final long serialVersionUID = 1L;
  private Long gId;
  private String gName;
  private String gIntroduce;

  public Game() {
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

  public String getgIntroduce() {
    return gIntroduce;
  }

  public void setgIntroduce(String gIntroduce) {
    this.gIntroduce = gIntroduce;
  }
}
