package com.ruoyi.iot.domain;

import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 发送信息表
 *
 * @author 薛莎莎
 * @date 2019-12-25
 */
public class Sendmes extends BaseEntity{
    private static final long serialVersionUID = 1L;

    private Integer smid;

    private String smobile;

    private String scontent;

    private String issend;

    private String sendtime;

    private String tid;

    private String spelanguage;

    private String remark;

    public Integer getSmid() {
        return smid;
    }

    public void setSmid(Integer smid) {
        this.smid = smid;
    }

    public String getSmobile() {
        return smobile;
    }

    public void setSmobile(String smobile) {
        this.smobile = smobile;
    }

    public String getScontent() {
        return scontent;
    }

    public void setScontent(String scontent) {
        this.scontent = scontent;
    }

    public String getIssend() {
        return issend;
    }

    public void setIssend(String issend) {
        this.issend = issend;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getSpelanguage() {
        return spelanguage;
    }

    public void setSpelanguage(String spelanguage) {
        this.spelanguage = spelanguage;
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
        return "Sendmes{" +
                "smid=" + smid +
                ", smobile='" + smobile + '\'' +
                ", scontent='" + scontent + '\'' +
                ", issend='" + issend + '\'' +
                ", sendtime='" + sendtime + '\'' +
                ", tid='" + tid + '\'' +
                ", spelanguage='" + spelanguage + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
