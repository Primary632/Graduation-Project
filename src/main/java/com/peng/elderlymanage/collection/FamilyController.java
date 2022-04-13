package com.peng.elderlymanage.collection;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.common.Result;
import com.peng.elderlymanage.server.FamilyMemberService;
import com.peng.elderlymanage.vo.FamilyMemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;

/**
 * @projectName: Graduation-Project
 * @className: FamlyController
 * @description: 家属模块
 * @author: 空城丶
 * @create: 2022-03-03 15:55
 **/
@RestController
@RequestMapping("/family")
public class FamilyController {
    @Autowired
    private FamilyMemberService familyMemberService;
    @Autowired
    private Result result;
    //1.根据自己对应的老人Id查看老人的健康信息

    //2.查询老人在养老院的花费情况
    //3.家属根据老人的缴费单为老人在线缴费
    //4.意见提交
    //5.获取家属信息
    public Result getAllMember(@RequestParam(defaultValue = "1") Integer  pageNum, @RequestParam(defaultValue = "10") Integer  pageSize, @RequestParam(defaultValue = "") String search){
        IPage<FamilyMemberVo> page = new Page<>(pageNum, pageSize);
        IPage<FamilyMemberVo> member=familyMemberService.getAllMember(page,search);
        return result.success(member);
    }
}
