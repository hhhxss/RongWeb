package com.ruoyi.village.domain;

import com.ruoyi.common.base.BaseEntity;

/**
 * 榔梨街道河流水位监测表
 *
 * @author 贾欣如
 * @date 2019-12-27
 */
public class CunZhangC extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 数据id
     */
    private Integer id;
    /**
     * 党员名字
     */
    private String uname;
    /**
     * 党员名字
     */
    private  String note;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "CunZhangC{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}