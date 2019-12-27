package com.ruoyi.rivervis.domain;

import com.ruoyi.common.base.BaseEntity;

public class TerminalsData extends BaseEntity {
    private Integer id;
    private String hum;
    private String temp;
    private String ele;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getEle() {
        return ele;
    }

    public void setEle(String ele) {
        this.ele = ele;
    }

    @Override
    public String toString() {
        return "TerminalsData{" +
                "id=" + id +
                ", hum='" + hum + '\'' +
                ", temp='" + temp + '\'' +
                ", ele='" + ele + '\'' +
                '}';
    }
}
