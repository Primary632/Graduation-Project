package com.peng.elderlymanage.server;

import com.peng.elderlymanage.collection.DoctorStationController;
import com.peng.elderlymanage.entity.DoctorStation;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-30
 */
public interface DoctorStationService  {
    DoctorStation selectOne(int stationid);

    List<DoctorStation> getAllStation();
}
