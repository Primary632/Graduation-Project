package com.peng.elderlymanage.server.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.peng.elderlymanage.dao.LoginDao;
import com.peng.elderlymanage.entity.RtUser;
import com.peng.elderlymanage.server.LoginServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: Graduation-Project
 * @className: LoginServerImpl
 * @description:
 * @author: 空城丶
 * @create: 2022-03-02 15:10
 **/
@Service
public class LoginServerImpl implements LoginServer {
    @Autowired
    private LoginDao loginDao;
    @Override
    public int loginUser(RtUser rtUser) {
        QueryWrapper<RtUser> query = new QueryWrapper<RtUser>();
        query.eq("username",rtUser.getUsername());
        query.eq("password",rtUser.getPassword());
        return loginDao.selectCount(query);
    }
}
