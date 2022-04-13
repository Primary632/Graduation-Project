package com.peng.elderlymanage.collection;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.common.Result;
import com.peng.elderlymanage.entity.ElderlyInfo;
import com.peng.elderlymanage.entity.FamilyMember;
import com.peng.elderlymanage.entity.UserInfo;
import com.peng.elderlymanage.server.ElderlyInfoService;
import com.peng.elderlymanage.server.FamilyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @projectName: Graduation-Project
 * @className: ElderlyInfoController
 * @description: 老人基本信息模块
 * @author: 空城丶
 * @create: 2022-03-03 10:51
 **/
@RestController
@RequestMapping("/elderlyInfo")
public class ElderlyInfoController {
    @Autowired
    private ElderlyInfoService elderlyInfoService;
    @Autowired
    private FamilyMemberService familyMemberService;
    @Autowired
    private Result request;
    @GetMapping
    public Result selectAll(@RequestParam(defaultValue = "1") Integer  pageNum, @RequestParam(defaultValue = "10") Integer  pageSize, @RequestParam(defaultValue = "") String search){
        IPage<ElderlyInfo> infoPage = new Page<ElderlyInfo>(pageNum,pageSize);

        Page<ElderlyInfo>  pageList=elderlyInfoService.selectAll(infoPage,search);
        return request.success(200,"查询数据成功！",pageList);
    }
    @PostMapping
    public Result addElder(@RequestBody ElderlyInfo elderlyInfo){
       int id= familyMemberService.addMember(elderlyInfo);
        elderlyInfo.setMemberid(String.valueOf(id));
        int i=elderlyInfoService.addElder(elderlyInfo);
        if(i>0){
            return request.success(200,"添加老人信息成功",null);
        }else {
            return  request.fail("添加老人信息出现了无法预料的错误，请稍后再试一遍吧");
        }
    }

    @PutMapping
    public Result updateElder(@RequestBody ElderlyInfo elderlyInfo){
        int mm= familyMemberService.update(elderlyInfo);

        int i=elderlyInfoService.updateElder(elderlyInfo);
        if(i>0&&mm>0){
            return request.success(200,"更新老人信息成功",null);
        }else {
            return  request.fail("更新老人信息出现了无法预料的错误，请稍后再试一遍吧");
        }
    }
    @PostMapping("/deleteElder")
    public Result deleteElder(@RequestBody ElderlyInfo elderlyInfo){
        int mm= familyMemberService.deleteMember(elderlyInfo);

        int i=elderlyInfoService.deleteElder(elderlyInfo);
        if(i>0&&mm>0){
            return request.success(200,"删除老人信息成功",null);
        }else {
            return  request.fail("删除老人出现了无法预料的错误，请稍后再试一遍吧");
        }
    }
}
