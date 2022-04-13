package com.peng.elderlymanage.collection;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.common.Result;
import com.peng.elderlymanage.entity.UserInfo;
import com.peng.elderlymanage.server.UserService;
import com.peng.elderlymanage.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @projectName: Graduation-Project
 * @className: UserController
 * @description:
 * @author: 空城丶
 * @create: 2022-03-18 18:04
 **/
@RestController
@RequestMapping("/userInfo")
public class UserController {
    @Autowired
   private UserService userService;

   private Result<UserInfo> result =new Result<>();;
    @PostMapping("/addUser")
    public Result addUser(@RequestBody UserInfo userInfo){

        int i = userService.addUser(userInfo);
        System.out.println("返回的成功条数：：：："+i);
        if(i>0){
           return result.success(200,"添加成功",null);
        }else{
         return    result.fail("添加用户失败");
        }

    }
    @GetMapping
    public Result<UserInfo> findUserByPage(@RequestParam(defaultValue = "1") Integer  pageNum, @RequestParam(defaultValue = "10") Integer  pageSize, @RequestParam(defaultValue = "") String search){

        IPage<UserInfo> infoPage = new Page<UserInfo>(pageNum,pageSize);
        Page<UserInfo> user=userService.findPage(infoPage,search);

        return result.success(200,"根据昵称:"+search+"查询成功！！",user);
    }
    @PutMapping("/updateUser")
    public Result updateUser(@RequestBody UserInfo userInfo){

        int i = userService.updateUser(userInfo);
        if(i>0){
          return   result.success(200,"更新成功",null);
        }else {
            return result.fail("更新失败");
        }
    }
//    @GetMapping("/test")
//    public List<UserInfo> test(){
//
//
//            List<UserInfo> pageByUser = userService.findPage();
//            System.out.println("一对一：：："+pageByUser);
//            return pageByUser;
//    }
}
