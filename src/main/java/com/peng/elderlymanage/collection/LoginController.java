package com.peng.elderlymanage.collection;

import com.peng.elderlymanage.entity.RtUser;
import com.peng.elderlymanage.server.LoginServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @projectName: Graduation-Project
 * @className: LoginController
 * @description:  登录 注册 注销
 * @author: 空城丶
 * @create: 2022-03-02 15:09
 **/
@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private LoginServer loginServer;
    @PostMapping("/login")
    public String login(@RequestBody RtUser rtUser){
        int status=loginServer.loginUser(rtUser);
        if(status>0){
            return "成功";
        }else {
            return "失败";
        }

    }

    @PostMapping()
    public String registered(){
        return "";
    }

}
