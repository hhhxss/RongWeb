package com.ruoyi.iot.domain;

public class menus {
    private Integer mid;
    private Integer parentmid;
    private Integer mlevel;
    private String mname;
    private String murl;
    private String micon;
    private String isopen;
    private String isenabled;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getParentmid() {
        return parentmid;
    }

    public void setParentmid(Integer parentmid) {
        this.parentmid = parentmid;
    }

    public Integer getMlevel() {
        return mlevel;
    }

    public void setMlevel(Integer mlevel) {
        this.mlevel = mlevel;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }

    public String getMicon() {
        return micon;
    }

    public void setMicon(String micon) {
        this.micon = micon;
    }

    public String getIsopen() {
        return isopen;
    }

    public void setIsopen(String isopen) {
        this.isopen = isopen;
    }

    public String getIsenabled() {
        return isenabled;
    }

    public void setIsenabled(String isenabled) {
        this.isenabled = isenabled;
    }

    @Override
    public String toString() {
        return "menus{" +
                "mid=" + mid +
                ", parentmid=" + parentmid +
                ", mlevel=" + mlevel +
                ", mname='" + mname + '\'' +
                ", murl='" + murl + '\'' +
                ", micon='" + micon + '\'' +
                ", isopen='" + isopen + '\'' +
                ", isenabled='" + isenabled + '\'' +
                '}';
    }
}
