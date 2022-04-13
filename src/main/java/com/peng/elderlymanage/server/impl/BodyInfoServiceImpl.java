package com.peng.elderlymanage.server.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.peng.elderlymanage.dao.BodyInfoDao;
import com.peng.elderlymanage.entity.BodyInfo;
import com.peng.elderlymanage.server.BodyInfoService;
import com.peng.elderlymanage.vo.BodyInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 身体信息表 服务实现类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
@Service
public class BodyInfoServiceImpl implements BodyInfoService {
    @Autowired
    private BodyInfoDao bodyInfoDao;
    @Override
    public IPage<BodyInfoVo> getAll(IPage<BodyInfoVo> bodyPage, String search) {

        return bodyInfoDao.getAllBodyInfo(bodyPage);
    }
}
