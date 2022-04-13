package com.peng.elderlymanage.collection;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.common.MyPage;
import com.peng.elderlymanage.common.Result;
import com.peng.elderlymanage.dao.ElderlyInfoDao;
import com.peng.elderlymanage.dao.NurseDao;
import com.peng.elderlymanage.dao.NurseLevelDao;
import com.peng.elderlymanage.dao.TaskDao;
import com.peng.elderlymanage.entity.*;
import com.peng.elderlymanage.server.NurseService;
import com.peng.elderlymanage.server.TaskService;
import com.peng.elderlymanage.vo.NurseTaskVo;
import com.peng.elderlymanage.vo.UserInfoVo;
import com.sun.jmx.snmp.tasks.TaskServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.util.List;

/**
 * @projectName: Graduation-Project
 * @className: NurseController
 * @description: 护工模块
 * @author: 空城丶
 * @create: 2022-03-03 10:48
 **/
@RestController
@RequestMapping("/nurse")
public class NurseController {
    @Autowired
    private NurseService nurseService;
    @Autowired
    private NurseLevelDao nurseLevelDao;
    @Autowired
    private TaskDao taskDao;
    @Autowired
    private TaskService taskService;
    private Result result = new Result();

    @GetMapping
    public Result getAllInfo(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize, @RequestParam("") String search) {
        Page<Nurse> page = new Page<>(pageNum, pageSize);
        IPage<Nurse> nurseInfo = nurseService.getAllNurseInfo(page, search);
        System.out.println(nurseInfo);
        if(nurseInfo.getRecords().size()==0){
        return result.success(200, "阿哦~ 数据中暂时还没有你需要的护士信息", null);
        }else {
            return result.success(nurseInfo);
        }
    }
    //增加护士信息
    @PostMapping
    public Result addNurse(@RequestBody Nurse nurse){
       int i= nurseService.addNurse(nurse);
       if(i>0){
           return result.success(200,"增加护士信息成功",null);
       }else {
           return result.fail(400,"增加失败，请确认页面信息是否有误",null);
       }
    }
    //删除护士信息
    @DeleteMapping
    public Result deleteNurse(@RequestParam Integer id){
        int i= nurseService.deleteNurse(id);
        if(i>0){
return result.success(200,"删除护士成功",null);
        }else {
            return result.fail(400,"删除护士失败，请重试",null);
        }
    }
    @GetMapping("/level")
    public Result getLevel(){
        List<NurseLevel> nurseLevels = nurseLevelDao.selectList(null);
        if(nurseLevels.size()>0){
            return result.success(200,"查询成功",nurseLevels);
        }else{
            return result.fail(400,"暂时还没有护士等级",null);
        }

    }
    //修改护士信息
    @PutMapping
    public Result updateNurse(@RequestBody Nurse nurse){
        int i= nurseService.updateNurse(nurse);
        if(i>0){
            return result.success(200,"修改护士信息成功",null);
        }else {
            return result.fail(400,"修改护士信息失败",null);
        }
    }

    @GetMapping("/task")
    public Result testInsert(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize, @RequestParam(defaultValue = "") String search) {
        IPage<NurseTaskVo> page = new Page<>(pageNum, pageSize);
//    if(user.getRole()==1){
        return result.success(taskDao.selectAllTask(page, search));
//    }else{
//        IPage<NurseTaskVo> nurseTask=taskDao.selectAllTaskByNid(page,search,user.getExid());
//        return result.success(nurseTask);
//    }

    }



    @PostMapping("/task")
    public Result insertTask(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize, @RequestParam(defaultValue = "") String search,@RequestBody User user) {
        IPage<NurseTaskVo> page = new Page<>(pageNum,pageSize);
        if (user.getRole() == 1) {
            return result.success(taskDao.selectAllTask(page, search));
        } else {
            IPage<NurseTaskVo> nurseTask = taskDao.selectAllTaskByNid(page, search, user.getExid());
            return result.success(nurseTask);
        }
    }
    @PostMapping("/upData")
    public Result upWorkedData(@RequestBody NurseTaskVo nurseTaskVo){

       int i= taskService.updateById(nurseTaskVo);
       if(i>0){
           return  result.success(200,"更新日常数据成功",null);
       }else{
           return  result.fail(400,"更新日常数据失败",null);
       }
    }
}
