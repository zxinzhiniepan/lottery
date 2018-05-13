package com.tiantian.pojo;


import com.tiantian.util.PojoModel;

import java.io.Serializable;
import java.util.Date;

public class Awardnumber extends PojoModel implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long anId;
    private Long anNo;
    private Long gId;
    private Date anTime;
    private Integer gNumber1;
    private Integer gNumber2;
    private Integer gNumber3;
    private Integer gNumber4;
    private Integer gNumber5;
    private Integer gNumber6;

    public Awardnumber() {
    }

    public Long getAnId() {
        return anId;
    }

    public void setAnId(Long anId) {
        this.anId = anId;
    }

    public Long getAnNo() {
        return anNo;
    }

    public void setAnNo(Long anNo) {
        this.anNo = anNo;
    }

    public Long getgId() {
        return gId;
    }

    public void setgId(Long gId) {
        this.gId = gId;
    }

    public Date getAnTime() {
        return anTime;
    }

    public void setAnTime(Date anTime) {
        this.anTime = anTime;
    }

    public Integer getgNumber1() {
        return gNumber1;
    }

    public void setgNumber1(Integer gNumber1) {
        this.gNumber1 = gNumber1;
    }

    public Integer getgNumber2() {
        return gNumber2;
    }

    public void setgNumber2(Integer gNumber2) {
        this.gNumber2 = gNumber2;
    }

    public Integer getgNumber3() {
        return gNumber3;
    }

    public void setgNumber3(Integer gNumber3) {
        this.gNumber3 = gNumber3;
    }

    public Integer getgNumber4() {
        return gNumber4;
    }

    public void setgNumber4(Integer gNumber4) {
        this.gNumber4 = gNumber4;
    }

    public Integer getgNumber5() {
        return gNumber5;
    }

    public void setgNumber5(Integer gNumber5) {
        this.gNumber5 = gNumber5;
    }

    public Integer getgNumber6() {
        return gNumber6;
    }

    public void setgNumber6(Integer gNumber6) {
        this.gNumber6 = gNumber6;
    }
}
