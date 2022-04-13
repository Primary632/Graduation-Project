package com.peng.elderlymanage.server;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.common.Result;
import com.peng.elderlymanage.entity.UserInfo;

import java.util.List;

/**
 * Copyright (C) @2022 BeiJing Eshore Technology Co. Ltd
 *
 * @author: 空城丶
 * @version: 1.0
 * @date: 2022-03-18 18:07
 * @description:
 */

public interface UserService {
    int addUser(UserInfo userInfo);



    Page<UserInfo> findPage(IPage<UserInfo> infoPage, String search);

    int updateUser(UserInfo userInfo);
    // List<UserInfo> findPage();
}
