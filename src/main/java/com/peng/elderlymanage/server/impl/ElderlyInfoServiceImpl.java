package com.peng.elderlymanage.server.impl;



import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.dao.ElderlyInfoDao;
import com.peng.elderlymanage.entity.ElderlyInfo;
import com.peng.elderlymanage.server.ElderlyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
@Service
public class ElderlyInfoServiceImpl  implements ElderlyInfoService {
    @Autowired
    private ElderlyInfoDao elderlyInfoDao;
    @Override
    public Page<ElderlyInfo> selectAll(IPage<ElderlyInfo> infoPage, String search) {
        LambdaQueryWrapper<ElderlyInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(ElderlyInfo::getStatus,"1");
        wrapper.like(ElderlyInfo::getName, search);
        return elderlyInfoDao.findPageByElder(infoPage,wrapper);
    }

    @Override
    public int addElder(ElderlyInfo elderlyInfo) {
        elderlyInfo.setCreatedTime(DateUtil.today());
        return elderlyInfoDao.insert(elderlyInfo);
    }

    @Override
    public int updateElder(ElderlyInfo elderlyInfo) {
        elderlyInfo.setUpdatedTime(DateUtil.today());
        return elderlyInfoDao.updateById(elderlyInfo);
    }

    @Override
    public int deleteElder(ElderlyInfo elderlyInfo) {
        elderlyInfo.setUpdatedTime(DateUtil.today());
        if(elderlyInfo.getId()!=0){
            return elderlyInfoDao.updateElder(elderlyInfo.getId(), elderlyInfo.getUpdatedTime());
        }else{
            return 0;
        }
    }
}
