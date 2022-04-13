package com.peng.elderlymanage.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peng.elderlymanage.entity.RoleUrl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyapeng
 * @since 2022-04-04
 */
@Mapper
public interface RoleUrlDao extends BaseMapper<RoleUrl> {
    List<RoleUrl> selectMenu(@Param("ew")LambdaQueryWrapper wrapper);
}
