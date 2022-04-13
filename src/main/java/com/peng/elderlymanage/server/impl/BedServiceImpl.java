package com.peng.elderlymanage.server.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.peng.elderlymanage.dao.BedDao;
import com.peng.elderlymanage.entity.Bed;
import com.peng.elderlymanage.server.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @projectName: Graduation-Project
 * @className: BedServiceImpl
 * @description:
 * @author: 空城丶
 * @create: 2022-03-10 08:59
 **/
@Service
public class BedServiceImpl implements BedService {
    @Autowired
    private BedDao bedDao;
    @Override
    public  IPage<Bed> selectBedInfo(IPage<Bed> Page) {
        QueryWrapper<Bed> queryWrapper = new QueryWrapper<Bed>();
        queryWrapper.eq("status",1);

        return bedDao.selectPage(Page,queryWrapper);
    }

    @Override
    public int addBedInfo(Bed bed) {

        return  bedDao.insert(bed);
    }

    @Override
    public int updateBedToStayin(Bed bed) {
        return 0;
    }

    @Override
    public int updateBedToStatus(Bed bed) {
        return 0;
    }
}
