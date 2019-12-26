package com.ruoyi.rivervis.domain;
import com.ruoyi.common.base.BaseEntity;

public class warnset extends BaseEntity {
    private Integer wid;
    private String  aid;
    private String aname;
    private String leveal;
    private String data;
    private String content;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getLeveal() {
        return leveal;
    }

    public void setLeveal(String leveal) {
        this.leveal = leveal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "warnset{" +
                "wid=" + wid +
                ", aid='" + aid + '\'' +
                ", aname='" + aname + '\'' +
                ", leveal='" + leveal + '\'' +
                ", data='" + data + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
