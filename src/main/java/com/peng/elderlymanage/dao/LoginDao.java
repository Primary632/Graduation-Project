package com.peng.elderlymanage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peng.elderlymanage.entity.RtUser;
import org.apache.ibatis.annotations.Mapper;
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
public interface LoginDao extends BaseMapper<RtUser> {


}
