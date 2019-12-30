package com.ruoyi.broad.domain;

import com.ruoyi.common.base.BaseEntity;

/**
 * 终端流量使用信息表 terminal_traffic
 *
 * @author xcl
 * @date 2019-12-29
 */
public class Tertraffic extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 终端流量使用信息表-id */
    private Integer ttid;
    /** 终端编号 */
    private String tid;
    /** 使用流量，单位MB */
    private String usetraffic;
    /** 流量统计时间 */
    private String lasttime;
    /** 备注 */
    private String remark;

    public Integer getTtid() {
        return ttid;
    }

    public void setTtid(Integer ttid) {
        this.ttid = ttid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getUsetraffic() {
        return usetraffic;
    }

    public void setUsetraffic(String usetraffic) {
        this.usetraffic = usetraffic;
    }

    public String getLasttime() {
        return lasttime;
    }

    public void setLasttime(String lasttime) {
        this.lasttime = lasttime;
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
        return "Tertraffic{" +
                "ttid=" + ttid +
                ", tid='" + tid + '\'' +
                ", usetraffic='" + usetraffic + '\'' +
                ", lasttime='" + lasttime + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
