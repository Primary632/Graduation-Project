package com.peng.elderlymanage.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
public interface UserInfoDao extends BaseMapper<UserInfo> {
    Page<UserInfo> findPageByUser(IPage<UserInfo> infoPage, @Param("ew") LambdaQueryWrapper<UserInfo> queryWrapper);
    int updateUserById(UserInfo userInfo,@Param("ew") LambdaQueryWrapper<UserInfo> queryWrapper);
}
