package com.peng.elderlymanage.server.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.dao.UserInfoDao;
import com.peng.elderlymanage.entity.UserInfo;
import com.peng.elderlymanage.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @projectName: Graduation-Project
 * @className: UserServiceImpl
 * @description:
 * @author: 空城丶
 * @create: 2022-03-18 18:08
 **/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserInfoDao userInfoDao;
    @Override
    public int addUser(UserInfo userInfo) {
        String strDateFormat = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        userInfo.setRegistrationTime(sdf.format(new Date()));
        return userInfoDao.insert(userInfo);
    }

    @Override
    public Page<UserInfo> findPage(IPage<UserInfo> infoPage, String search) {
        LambdaQueryWrapper<UserInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(UserInfo::getNickName,search);

        return userInfoDao.findPageByUser(infoPage,queryWrapper);



    }

    @Override
    public int updateUser(UserInfo userInfo) {
        LambdaQueryWrapper<UserInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserInfo::getId,userInfo.getId());
        return userInfoDao.updateUserById(userInfo,wrapper);
    }

}
