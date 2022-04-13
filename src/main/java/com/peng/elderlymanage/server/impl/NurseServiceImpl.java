package com.peng.elderlymanage.server.impl;


import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.dao.NurseDao;
import com.peng.elderlymanage.entity.Nurse;
import com.peng.elderlymanage.server.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-30
 */
@Service
public class NurseServiceImpl implements NurseService {
    @Autowired
    private NurseDao nurseDao;
    @Override
    public IPage<Nurse> getAllNurseInfo(Page<Nurse> page, String search) {
        LambdaQueryWrapper<Nurse> wrapper = new LambdaQueryWrapper();
        wrapper.like(Nurse::getNname,search);

        return nurseDao.selectAll(page,wrapper);
    }

    @Override
    public int updateNurse(Nurse nurse) {
        nurse.setUpdateTime(DateUtil.today());
        return nurseDao.updateById(nurse);
    }

    @Override
    public int addNurse(Nurse nurse) {
       nurse.setCreatedTime(DateUtil.today());
        return  nurseDao.insert(nurse);
    }

    @Override
    public int deleteNurse(Integer id) {
        LambdaQueryWrapper<Nurse> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Nurse::getId,id);
        String today = DateUtil.today();
        return nurseDao.updateByIdToStatus(wrapper,today);
    }
}
