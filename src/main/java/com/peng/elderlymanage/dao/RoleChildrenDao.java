package com.peng.elderlymanage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peng.elderlymanage.entity.RoleChildren;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyapeng
 * @since 2022-04-04
 */
public interface RoleChildrenDao extends BaseMapper<RoleChildren> {
    List<RoleChildren> selectChildrenMenu(Integer rid);
}
