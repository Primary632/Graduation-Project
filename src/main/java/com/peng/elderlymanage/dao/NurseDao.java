package com.peng.elderlymanage.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.entity.Nurse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-30
 */
@Mapper
public interface NurseDao extends BaseMapper<Nurse> {
    IPage<Nurse> selectAll(Page<Nurse> page, @Param("ew")LambdaQueryWrapper<Nurse> wrappe);

    int updateByIdToStatus(@Param("ew") LambdaQueryWrapper<Nurse> wrapper,String today);
}
