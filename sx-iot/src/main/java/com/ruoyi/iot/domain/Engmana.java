package com.ruoyi.iot.domain;

import com.ruoyi.common.base.BaseEntity;

/**
 * @program
 * @description：能源管理终端采集信息表
 * @author：xcl
 * @date：2019-12-26
 */
public class Engmana extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 终端编号 */
    private Integer id;
    /** 终端设备IMEI */
    private String tid;
    /** 采集地址编号 */
    private String addrid;
    /** 采集时间 */
    private String colltime;
    /** 电池1电压 */
    private String fvoltage;
    /** 电池组电压 */
    private String gvoltage;
    /** 充电电流 */
    private String rechcurrent;
    /** 负载电流 */
    private String loadcurrent;
    /** 输出电压 */
    private String outvoltage;
    /** 外部电源电压 */
    private String extvoltage;
    /** 太阳能电压 */
    private String sunvoltage;
    /** 工作温度 */
    private String worktemp;
    /** 充电状态 */
    private Integer rechstatus;
    /** 工作状态 */
    private Integer workstatus;
    /** 信息状态 */
    private String remark;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getAddrid() {
        return addrid;
    }

    public void setAddrid(String addrid) {
        this.addrid = addrid;
    }

    public String getColltime() {
        return colltime;
    }

    public void setColltime(String colltime) {
        this.colltime = colltime;
    }

    public String getFvoltage() {
        return fvoltage;
    }

    public void setFvoltage(String fvoltage) {
        this.fvoltage = fvoltage;
    }

    public String getGvoltage() {
        return gvoltage;
    }

    public void setGvoltage(String gvoltage) {
        this.gvoltage = gvoltage;
    }

    public String getRechcurrent() {
        return rechcurrent;
    }

    public void setRechcurrent(String rechcurrent) {
        this.rechcurrent = rechcurrent;
    }

    public String getLoadcurrent() {
        return loadcurrent;
    }

    public void setLoadcurrent(String loadcurrent) {
        this.loadcurrent = loadcurrent;
    }

    public String getOutvoltage() {
        return outvoltage;
    }

    public void setOutvoltage(String outvoltage) {
        this.outvoltage = outvoltage;
    }

    public String getExtvoltage() {
        return extvoltage;
    }

    public void setExtvoltage(String extvoltage) {
        this.extvoltage = extvoltage;
    }

    public String getSunvoltage() {
        return sunvoltage;
    }

    public void setSunvoltage(String sunvoltage) {
        this.sunvoltage = sunvoltage;
    }

    public String getWorktemp() {
        return worktemp;
    }

    public void setWorktemp(String worktemp) {
        this.worktemp = worktemp;
    }

    public Integer getRechstatus() {
        return rechstatus;
    }

    public void setRechstatus(Integer rechstatus) {
        this.rechstatus = rechstatus;
    }

    public Integer getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(Integer workstatus) {
        this.workstatus = workstatus;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Engmana{" +
                "id=" + id +
                ", tid='" + tid + '\'' +
                ", addrid='" + addrid + '\'' +
                ", colltime='" + colltime + '\'' +
                ", fvoltage='" + fvoltage + '\'' +
                ", gvoltage='" + gvoltage + '\'' +
                ", rechcurrent='" + rechcurrent + '\'' +
                ", loadcurrent='" + loadcurrent + '\'' +
                ", outvoltage='" + outvoltage + '\'' +
                ", extvoltage='" + extvoltage + '\'' +
                ", sunvoltage='" + sunvoltage + '\'' +
                ", worktemp='" + worktemp + '\'' +
                ", rechstatus=" + rechstatus +
                ", workstatus=" + workstatus +
                ", remark='" + remark + '\'' +
                '}';
    }
}
