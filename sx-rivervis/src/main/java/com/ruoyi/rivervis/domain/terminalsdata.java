package com.ruoyi.rivervis.domain;

import com.ruoyi.common.base.BaseEntity;
import java.util.Date;
/**
 * 能源管理终端采集信息表energy
 *
 * @author 薛莎莎
 * @date 2019-12-24
 */
public class terminalsdata extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /**/
    private Integer id;

    /*终端设备IMEI*/
    private String tid;

    /*终端设备名称*/
    private String tname;

    /*所属分组ID*/
    private String aid;

    /*所属用户编号*/
    private String userid;

    /*安装地址*/
    private String address;

    /*备注*/
    private String note;

    /*终端管理员名称*/
    private String manager;

    /*终端管理员电话*/
    private String managertel;

    /*创建时间*/
    private String createdtime;

    /*是否可用*/
    private String isuse;

    /*终端手机号码*/
    private String phone;

    /*湿度*/
    private String hum;

    /*温度*/
    private String temp;

    /*电压*/
    private String ele;

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

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManagertel() {
        return managertel;
    }

    public void setManagertel(String managertel) {
        this.managertel = managertel;
    }

    public String getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(String createdtime) {
        this.createdtime = createdtime;
    }

    public String getIsuse() {
        return isuse;
    }

    public void setIsuse(String isuse) {
        this.isuse = isuse;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        return "terminalsdata{" +
                "id=" + id +
                ", tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", aid='" + aid + '\'' +
                ", userid='" + userid + '\'' +
                ", address='" + address + '\'' +
                ", note='" + note + '\'' +
                ", manager='" + manager + '\'' +
                ", managertel='" + managertel + '\'' +
                ", createdtime='" + createdtime + '\'' +
                ", isuse='" + isuse + '\'' +
                ", phone='" + phone + '\'' +
                ", hum='" + hum + '\'' +
                ", temp='" + temp + '\'' +
                ", ele='" + ele + '\'' +
                '}';
    }
}
