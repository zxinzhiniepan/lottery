package com.tiantian.pojo;


import com.tiantian.util.PojoModel;

import java.io.Serializable;

public class Transactionclass extends PojoModel implements Serializable {
  private static final long serialVersionUID = 1L;
  private Long tcId;
  private String tcName;

  public Transactionclass() {
  }

  public Long getTcId() {
    return tcId;
  }

  public void setTcId(Long tcId) {
    this.tcId = tcId;
  }

  public String getTcName() {
    return tcName;
  }

  public void setTcName(String tcName) {
    this.tcName = tcName;
  }
}
