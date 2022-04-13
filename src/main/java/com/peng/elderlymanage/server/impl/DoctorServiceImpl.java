package com.peng.elderlymanage.server.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.peng.elderlymanage.dao.DoctorDao;
import com.peng.elderlymanage.entity.Doctor;
import com.peng.elderlymanage.server.DoctorService;
import com.peng.elderlymanage.vo.DoctorVo;
import com.peng.elderlymanage.vo.ElderBedVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
@Service
public class DoctorServiceImpl  implements DoctorService {
    @Autowired
    private DoctorDao doctorDao;
    @Override
    public IPage<DoctorVo> selectAll(IPage<DoctorVo> doctorPage, String search) {
        LambdaQueryWrapper<Doctor> query = new LambdaQueryWrapper<>();
        query.eq(Doctor::getStatus,"1");
        query.like(Doctor::getDname,search);
//        return doctorDao.selectPages(doctorPage,query);
        return doctorDao.selectPages(doctorPage,query);
    }

    @Override
    public int addDoctor(Doctor doctor) {
        if(doctor.getDname() !=null && doctor.getDname()!=""&& doctor.getEmail()!=null&&doctor.getFloor()!=null&&doctor.getPhone()!=null&&doctor.getRoom()!=null){
            String strDateFormat = "yyyy-MM-dd";
            SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
            doctor.setCreatedTime(sdf.format(new Date()));
            return doctorDao.insert(doctor);
        }else {
            return 0;
        }


    }

    @Override
    public int deleteDoctor(String id) {
        QueryWrapper<Doctor> wrapper = new QueryWrapper<>();
        String strDateFormat = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        wrapper.eq("id",id);
        String deleteTime=sdf.format(new Date());


        return doctorDao.deleteDoctor(wrapper,deleteTime);
    }

    @Override
    public int updateDoctor(Doctor doctor) {

        return doctorDao.updateById(doctor);
    }

    @Override
    public ElderBedVo getStayInfo(String id) {
        return doctorDao.getElderBed(id);
    }
}
