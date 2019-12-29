package com.ruoyi.iot.domain;


public class terminaltel{
    private Integer telid;
    private String tid;
    private String Tel;
    private String IsUse;

    public Integer getTelid() {
        return telid;
    }

    public void setTelid(Integer telid) {
        this.telid = telid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getIsUse() {
        return IsUse;
    }

    public void setIsUse(String isUse) {
        IsUse = isUse;
    }
}
