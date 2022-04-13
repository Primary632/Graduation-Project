package com.peng.elderlymanage.server;

import com.peng.elderlymanage.entity.RoleUrl;
import com.peng.elderlymanage.entity.User;
import com.peng.elderlymanage.entity.UserInfo;

/**
 * Copyright (C) @2022 BeiJing Eshore Technology Co. Ltd
 *
 * @author: 空城丶
 * @version: 1.0
 * @date: 2022-03-02 15:10
 * @description:
 */
public interface LoginServer {
    /**
     *
     * @param User
     * 用户登录
     * @return
     * @author wyp
     * @date 2022/3/3
     * @version 1.0
    */
    Long loginUser(User User);
    User selectByName(User user);

    int changeStatus(UserInfo user);
}
