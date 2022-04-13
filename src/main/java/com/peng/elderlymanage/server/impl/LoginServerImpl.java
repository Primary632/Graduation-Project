package com.peng.elderlymanage.server.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.peng.elderlymanage.common.Md5Config;
import com.peng.elderlymanage.dao.LoginDao;
import com.peng.elderlymanage.dao.RoleUrlDao;
import com.peng.elderlymanage.entity.RoleUrl;
import com.peng.elderlymanage.entity.User;
import com.peng.elderlymanage.entity.UserInfo;
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
    @Autowired
    private RoleUrlDao roleUrlDao;
    @Override
    public Long loginUser(User user) {
        User userSalt = selectByName(user);
        if(null==userSalt){
            return 0L;
        }else{
            String password = Md5Config.createMd5Code(user.getPassword() + " ");
            QueryWrapper<User> query = new QueryWrapper<User>();
            query.eq("username",user.getUsername());

            query.eq("password",password);
            return loginDao.selectCount(query);
        }


    }

    @Override
    public User selectByName(User user) {
        QueryWrapper<User> query = new QueryWrapper<User>();
        query.eq("username",user.getUsername());
        return loginDao.selectOne(query);
    }

    @Override
    public int changeStatus(UserInfo user) {
        User user1 = new User();
        user1.setId(Integer.valueOf(user.getUser().getId()));
        user1.setStatus(user.getUser().getStatus());
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper();
        wrapper.eq(User::getId,user1.getId());
        return loginDao.updateStatus(user1,wrapper);
    }

}
