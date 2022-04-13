package com.peng.elderlymanage.server.impl;


import com.peng.elderlymanage.dao.DoctorStationDao;
import com.peng.elderlymanage.entity.DoctorStation;
import com.peng.elderlymanage.server.DoctorStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-30
 */
@Service
public class DoctorStationServiceImpl  implements DoctorStationService {
    @Autowired
    private DoctorStationDao doctorStationDao;
    @Override
    public DoctorStation selectOne(int stationid) {
        return doctorStationDao.selectOneById(stationid);
    }

    @Override
    public List<DoctorStation> getAllStation() {
        return doctorStationDao.selectList(null);
    }
}
