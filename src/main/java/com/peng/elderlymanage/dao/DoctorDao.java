package com.peng.elderlymanage.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.peng.elderlymanage.entity.Doctor;
import com.peng.elderlymanage.vo.DoctorVo;
import com.peng.elderlymanage.vo.ElderBedVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
@Mapper
public interface DoctorDao extends BaseMapper<Doctor> {

    IPage<DoctorVo> selectPages(IPage<DoctorVo> doctorPage, @Param("ew") LambdaQueryWrapper<Doctor> query);

    int deleteDoctor(@Param("ew") QueryWrapper<Doctor> wrapper, String deleteTime);
    @Select("SELECT a.created_time,a.updated_time,b.`name`,b.id,b.sex,c.floor_num,c.room_num from (rt_bed_elder a INNER JOIN rt_elderly_info b on a.eid=b.id) INNER JOIN rt_bed c on a.bid=c.id where a.eid=#{id} and a.status='1'")
    ElderBedVo getElderBed(String id);
}
