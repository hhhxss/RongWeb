package com.ruoyi.iot.domain;

import com.ruoyi.common.base.BaseEntity;

public class DataAnalysis extends BaseEntity {
    private String rname;
    private String type1;
    private String data1;
    private String type2;
    private String data2;
    private String time;


    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "DataAnalysis{" +
                "rname='" + rname + '\'' +
                ", type1='" + type1 + '\'' +
                ", data1='" + data1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", data2='" + data2 + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
