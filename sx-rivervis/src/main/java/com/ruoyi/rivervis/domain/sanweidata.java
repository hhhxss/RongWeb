package com.ruoyi.rivervis.domain;

import com.ruoyi.common.base.BaseEntity;

public class sanweidata extends BaseEntity {
    private Integer id;
    private String waterlevel;
    private String flow;
    private String terraindata;
    private String address;
    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWaterlevel() {
        return waterlevel;
    }

    public void setWaterlevel(String waterlevel) {
        this.waterlevel = waterlevel;
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public String getTerraindata() {
        return terraindata;
    }

    public void setTerraindata(String terraindata) {
        this.terraindata = terraindata;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "sanweidata{" +
                "id=" + id +
                ", waterlevel='" + waterlevel + '\'' +
                ", flow='" + flow + '\'' +
                ", terraindata='" + terraindata + '\'' +
                ", address='" + address + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
