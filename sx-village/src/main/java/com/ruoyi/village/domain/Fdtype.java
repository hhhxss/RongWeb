package com.ruoyi.village.domain;

import com.ruoyi.common.base.BaseEntity;

/**
 * @program
 * @description：反馈投诉表
 * @author：xcl
 * @date：2019-12-27
 */
public class Fdtype extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 投诉数据编号 */
    private Integer fbid;
    /** 投诉人编号 */
    private Integer fbuid;
    /** 投诉标题 */
    private String title;
    /** 投诉类型 */
    private String ftype;
    /** 投诉内容 */
    private String content;
    /** 投诉时间 */
    private String fbdatetime;
    /** 管理员是否已读 */
    private String isread;
    /** 回复内容 */
    private String opinion;
    /** 回复人编号 */
    private String uid;
    /** 回复人用户名 */
    private String uname;
    /** 回复时间 */
    private String datetime;
    /** 用户所属地区村社区 aid */
    private String aid;
    /** 是否有效 */
    private String remark;

    public Integer getFbid() {
        return fbid;
    }

    public void setFbid(Integer fbid) {
        this.fbid = fbid;
    }

    public Integer getFbuid() {
        return fbuid;
    }

    public void setFbuid(Integer fbuid) {
        this.fbuid = fbuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFbdatetime() {
        return fbdatetime;
    }

    public void setFbdatetime(String fbdatetime) {
        this.fbdatetime = fbdatetime;
    }

    public String getIsread() {
        return isread;
    }

    public void setIsread(String isread) {
        this.isread = isread;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
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
        return "Fdtype{" +
                "fbid=" + fbid +
                ", fbuid=" + fbuid +
                ", title='" + title + '\'' +
                ", ftype='" + ftype + '\'' +
                ", content='" + content + '\'' +
                ", fbdatetime='" + fbdatetime + '\'' +
                ", isread='" + isread + '\'' +
                ", opinion='" + opinion + '\'' +
                ", uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", datetime='" + datetime + '\'' +
                ", aid='" + aid + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
