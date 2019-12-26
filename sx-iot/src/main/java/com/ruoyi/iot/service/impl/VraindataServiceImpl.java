package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Vraindata;
import com.ruoyi.iot.mapper.VraindataMapper;
import com.ruoyi.iot.service.IVraindataService;
import com.ruoyi.village.domain.pubObjApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program
 * @description： 村镇雨量表 服务层实现
 * @author：谢陈亮
 * @date：2019-12-22
 */
@Service
public class VraindataServiceImpl implements IVraindataService{
    @Autowired
    public VraindataMapper vraindataMapper;
    /**
     * 查询村镇雨量信息
     *
     * @param id
     * @return 村镇雨量信息
     */
//    @Override
//    @DataSource(value = DataSourceType.SXVILLAGE)
//    public Vraindata selectVraindataById(String id){
//        return vraindataMapper.selectVraindataById(id);}

    /**
     * 查询村镇雨量信息列表
     *
     * @param vraindata 村镇雨量信息
     * @return 村镇雨量信息集合
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Vraindata> selectVraindataList(Vraindata vraindata){
        return vraindataMapper.selectVraindataList(vraindata);
    }

//    @Override
//    @DataSource(value = DataSourceType.SXVILLAGE)
//    public List<Vraindata> selectVraindataListById(pubObjApi vraindata) {
//        return vraindataMapper.selectVraindataListById(vraindata);
//    }

    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Vraindata> selectVraindataByrname(){
        return vraindataMapper.selectVraindataByrname();
    }

}
