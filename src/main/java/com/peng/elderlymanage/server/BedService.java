package com.peng.elderlymanage.server;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.peng.elderlymanage.entity.Bed;

import java.util.List;

/**
 * Copyright (C) @2022 BeiJing Eshore Technology Co. Ltd
 *
 * @author: 空城丶
 * @version: 1.0
 * @date: 2022-03-10 08:58
 * @description:
 */
public interface BedService {
    //查看所有正常床位的相关信息
    IPage<Bed> selectBedInfo(IPage<Bed> Page);
    //添加床位
    int addBedInfo(Bed bed);
    //更新床位的入住状态
    int updateBedToStayin(Bed bed);
    //删除床位
    int updateBedToStatus(Bed bed);
}
