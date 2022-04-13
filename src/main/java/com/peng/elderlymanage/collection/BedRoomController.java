package com.peng.elderlymanage.collection;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.common.Result;
import com.peng.elderlymanage.entity.Bed;
import com.peng.elderlymanage.server.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @projectName: Graduation-Project
 * @className: BedRoomController
 * @description: 床位模块
 * @author: 空城丶
 * @create: 2022-03-03 10:50
 **/
@RestController
@RequestMapping("/beds")
public class BedRoomController {
    @Autowired
   private BedService bedService;
    private Result<Bed> result = new Result<>();
    //1.查看床位的住宿情况
    @GetMapping("/selectBedInfo")
    public Result selectBedInfo(@RequestParam(defaultValue = "1") Integer  pageNum, @RequestParam(defaultValue = "10") Integer  pageSize){
        IPage<Bed> objectPage = new Page<Bed>(pageNum,pageSize);
        IPage<Bed> bed = bedService.selectBedInfo(objectPage);

        return result.success(bed);
    }
    //2.增加床位后对数据进行更新
    @RequestMapping("/addBed")
    public void addBed(@RequestBody Bed bed){

        bedService.addBedInfo(bed);
    }
    //3.修改床位信息
    @RequestMapping("/updateBedToStayIn")
    public void updateBedToStayIn(){

    }
    //4.删除床位
    @RequestMapping("/updateBedToStatus")
    public void updateBedToStatus(@RequestBody Bed bed){

    }
}
