package com.peng.elderlymanage.collection;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.common.MyPage;
import com.peng.elderlymanage.common.Result;
import com.peng.elderlymanage.entity.Doctor;
import com.peng.elderlymanage.server.DoctorService;
import com.peng.elderlymanage.vo.DoctorVo;
import com.peng.elderlymanage.vo.ElderBedVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;

/**
 * @projectName: Graduation-Project
 * @className: DoctorController
 * @description: 医生模块
 * @author: 空城丶
 * @create: 2022-03-03 10:46
 **/
@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private Result result;

    @PostMapping
    public Result addDoctor(@RequestBody Doctor doctor){
        int i =doctorService.addDoctor(doctor);
        if(i>0){
            return result.success(null);
        }else {
            return result.fail("失败");
        }
    }
    @GetMapping("/info")
    public Result<DoctorVo> selectAll(@RequestParam(defaultValue = "1") Integer  pageNum, @RequestParam(defaultValue = "5") Integer  pageSize, @RequestParam(defaultValue = "") String search){

        IPage<DoctorVo> doctorPage = new Page<>(pageNum,pageSize);
        IPage<DoctorVo> doctor=doctorService.selectAll(doctorPage,search);
        return result.success(200,"查询数据成功！",doctor);
    }
    @DeleteMapping
    public Result deleteDoctor(@RequestParam("id") String id){
        if(id!= null|| id!=""){
            int i = doctorService.deleteDoctor(id);
            if(i>0){
                return result.success(null);
            }else{
               return  result.fail("请再试一次，如果无法删除请联系管理员");
            }
        }else{
            return  result.fail("ID是不能为空的哦");
        }
    }
    @PutMapping
    public Result updateDoctor(@RequestBody Doctor doctor){
        int i = doctorService.updateDoctor(doctor);
        if(i>0){
            return  result.success(null);
        }else {
            return result.fail("更新失败");
        }
    }


    /**
     *
     * 医生管理的老人信息
     * */
    @GetMapping("/getStayInfo")
    public Result getElderBed(@RequestParam String id){
      ElderBedVo elderBedVo= doctorService.getStayInfo(id);
     return result.success(200,"查询成功",elderBedVo);
    }

}
