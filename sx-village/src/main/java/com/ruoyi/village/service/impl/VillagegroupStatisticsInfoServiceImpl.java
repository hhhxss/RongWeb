package com.ruoyi.village.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.village.mapper.VillagegroupStatisticsInfoMapper;
import com.ruoyi.village.domain.VillagegroupStatisticsInfo;
import com.ruoyi.village.service.IVillagegroupStatisticsInfoService;
import com.ruoyi.common.support.Convert;

/**
 * 村组统计 服务层实现
 * 
 * @author 张鸿权
 * @date 2019-05-02
 */
@Service
public class VillagegroupStatisticsInfoServiceImpl implements IVillagegroupStatisticsInfoService
{
	@Autowired
	public VillagegroupStatisticsInfoMapper villagegroupStatisticsInfoMapper;

	/**
     * 查询村组统计信息
     * 
     * @param vgsid 村组统计ID
     * @return 村组统计信息
     */
    @Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public VillagegroupStatisticsInfo selectVillagegroupStatisticsInfoById(Integer vgsid)
	{
	    return villagegroupStatisticsInfoMapper.selectVillagegroupStatisticsInfoById(vgsid);
	}
	
	/**
     * 查询村组统计列表
     * 
     * @param villagegroupStatisticsInfo 村组统计信息
     * @return 村组统计集合
     */
	@Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public List<VillagegroupStatisticsInfo> selectVillagegroupStatisticsInfoList(VillagegroupStatisticsInfo villagegroupStatisticsInfo)
	{
	    return villagegroupStatisticsInfoMapper.selectVillagegroupStatisticsInfoList(villagegroupStatisticsInfo);
	}

	@Override
	public List<VillagegroupStatisticsInfo> selectVillagegrouparea() {
		return villagegroupStatisticsInfoMapper.selectVillagegrouparea();
	}

	@Override
	public List<VillagegroupStatisticsInfo> selectVillagegroupGtype() {
		return villagegroupStatisticsInfoMapper.selectVillagegroupGtype();
	}
	@Override
	public List<VillagegroupStatisticsInfo> selectVillagegroupfarmland() {
		return villagegroupStatisticsInfoMapper.selectVillagegroupfarmland();
	}
	@Override
	public List<VillagegroupStatisticsInfo> selectVillagegroupplowland() {
		return villagegroupStatisticsInfoMapper.selectVillagegroupplowland();
	}
	@Override
	public List<VillagegroupStatisticsInfo> selectVillagegrouporchard() {
		return villagegroupStatisticsInfoMapper.selectVillagegrouporchard();
	}
	@Override
	public List<VillagegroupStatisticsInfo> selectVillagegroupforest() {
		return villagegroupStatisticsInfoMapper.selectVillagegroupforest();
	}
	@Override
	public List<VillagegroupStatisticsInfo> selectVillagegroupfland() {
		return villagegroupStatisticsInfoMapper.selectVillagegroupfland();
	}
	@Override
	public List<VillagegroupStatisticsInfo> selectVillagegroupaqarea() {
		return villagegroupStatisticsInfoMapper.selectVillagegroupaqarea();
	}
	@Override
	public List<VillagegroupStatisticsInfo> selectVillagegroupotherland() {
		return villagegroupStatisticsInfoMapper.selectVillagegroupotherland();
	}
	/**
    /**
     * 新增村组统计
     * 
     * @param villagegroupStatisticsInfo 村组统计信息
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public int insertVillagegroupStatisticsInfo(VillagegroupStatisticsInfo villagegroupStatisticsInfo)
	{
	    return villagegroupStatisticsInfoMapper.insertVillagegroupStatisticsInfo(villagegroupStatisticsInfo);
	}
	
	/**
     * 修改村组统计
     * 
     * @param villagegroupStatisticsInfo 村组统计信息
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public int updateVillagegroupStatisticsInfo(VillagegroupStatisticsInfo villagegroupStatisticsInfo)
	{
	    return villagegroupStatisticsInfoMapper.updateVillagegroupStatisticsInfo(villagegroupStatisticsInfo);
	}

	/**
     * 删除村组统计对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXBAODIAN)
	public int deleteVillagegroupStatisticsInfoByIds(String ids) {
		return villagegroupStatisticsInfoMapper.deleteVillagegroupStatisticsInfoByIds(Convert.toStrArray(ids));
	}
}
