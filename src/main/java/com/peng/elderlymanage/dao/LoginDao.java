package com.peng.elderlymanage.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peng.elderlymanage.entity.RoleUrl;
import com.peng.elderlymanage.entity.User;
import com.peng.elderlymanage.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Copyright (C) @2022 BeiJing Eshore Technology Co. Ltd
 *
 * @author: 空城丶
 * @version: 1.0
 * @date: 2022-03-03 09:28
 * @description:
 */
@Mapper
@Repository
public interface LoginDao extends BaseMapper<User> {
    @Update("update rt_user set status=#{user.status} ${ew.customSqlSegment} ")
    int updateStatus(User user, @Param("ew") LambdaQueryWrapper<User> wrapper);
}
