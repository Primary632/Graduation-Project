package com.peng.elderlymanage.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.entity.ElderlyInfo;
import com.peng.elderlymanage.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
@Mapper
public interface ElderlyInfoDao extends BaseMapper<ElderlyInfo> {
    Page<ElderlyInfo> findPageByElder(IPage<ElderlyInfo> infoPage, @Param("ew") LambdaQueryWrapper<ElderlyInfo> queryWrapper);
    @Update("update rt_elderly_info set status='0',updated_time=#{updatedTime} where id=#{id}")
    int updateElder(Integer id,String updatedTime);
    @Select("select id from rt_elderly_info")
    List<ElderlyInfo> getAllElderWithID();
}

