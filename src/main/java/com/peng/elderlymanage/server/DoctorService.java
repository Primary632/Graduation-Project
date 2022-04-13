package com.peng.elderlymanage.server;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.peng.elderlymanage.entity.Doctor;
import com.peng.elderlymanage.vo.DoctorVo;
import com.peng.elderlymanage.vo.ElderBedVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
public interface DoctorService  {

    IPage<DoctorVo> selectAll(IPage<DoctorVo> doctorPage, String search);

    int addDoctor(Doctor doctor);

    int deleteDoctor(String id);
    int updateDoctor(Doctor doctor);

    ElderBedVo getStayInfo(String id);
}
