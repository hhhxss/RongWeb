package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.Anshan;

import java.util.List;

/**
 * 安山镇温度监测表
 *
 * @author 彭子涵
 * @date 2019-12-22
 */
public interface AnshanMapper{
        /**
         * 查询环境监测信息
         *
         * @param id 环境监测ID
         * @return 环境监测信息
         */
        public Anshan selectAnshanById(Integer id);

        /**
         * 查询环境监测列表
         *
         * @param : Quantan环境监测信息
         * @return 环境监测集合
         */
        public List<Anshan> selectAnshanList(Anshan anshan);

        public List<Anshan> selectAnshanListBytime();
}
