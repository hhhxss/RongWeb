package com.ruoyi.village.domain;

import com.ruoyi.common.base.BaseEntity;
/**
 * @program:
 * @description: 林地信息表
 * @author: xss
 * @create: 2019-12-17
 **/
public class Flandinfo extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /*林地数据编号*/
    private Integer fid;

    /*地域编号*/
    private String aid;

    /*组名*/
    private String grouptype;

    /*集体经营面积*/
    private String collective;

    /*承包到户面积*/
    private String contracted;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getGrouptype() {
        return grouptype;
    }

    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype;
    }

    public String getCollective() {
        return collective;
    }

    public void setCollective(String collective) {
        this.collective = collective;
    }

    public String getContracted() {
        return contracted;
    }

    public void setContracted(String contracted) {
        this.contracted = contracted;
    }

    @Override
    public String toString() {
        return "flandinfo{" +
                "fid=" + fid +
                ", aid='" + aid + '\'' +
                ", grouptype='" + grouptype + '\'' +
                ", collective='" + collective + '\'' +
                ", contracted='" + contracted + '\'' +
                '}';
    }
}
