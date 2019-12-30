package com.ruoyi.broad.domain;

/**
 * 终端管理员信息 terminals
 *
 * @author xss
 * @date 2019-12-29
 */

import com.ruoyi.common.base.BaseEntity;

public class Terminals extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /*终端设备IMEI*/
    private String tid;

    /*终端设备名称*/
    private String tname;

    /*管理员名称*/
    private String manager;

    /*管理员电话*/
    private String managertel;

    /*创建时间*/
    private String createdtime;

    /*是否可用*/
    private String isuse;

    /*1:应急广播终端,2:后备能源型终端,3:发射机型终端*/
    private String terminaltype;

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

    public String getTerminaltype() {
        return terminaltype;
    }

    public void setTerminaltype(String terminaltype) {
        this.terminaltype = terminaltype;
    }

    @Override
    public String toString() {
        return "Terminals{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", manager='" + manager + '\'' +
                ", managertel='" + managertel + '\'' +
                ", createdtime='" + createdtime + '\'' +
                ", isuse='" + isuse + '\'' +
                ", terminaltype='" + terminaltype + '\'' +
                '}';
    }
}


