package com.peng.elderlymanage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peng.elderlymanage.entity.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
public interface UserDao extends BaseMapper<User> {
   User selectUserByUid(int uid);
}
