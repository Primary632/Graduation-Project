package com.peng.elderlymanage.collection;

import com.peng.elderlymanage.dao.LoginDao;
import com.peng.elderlymanage.entity.RoleUrl;
import com.peng.elderlymanage.entity.User;
import com.peng.elderlymanage.entity.UserInfo;
import com.peng.elderlymanage.server.LoginServer;
import com.peng.elderlymanage.common.Result;
import com.peng.elderlymanage.server.RoleUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @projectName: Graduation-Project
 * @className: LoginController
 * @description: 登录 注册 注销
 * @author: 空城丶
 * @create: 2022-03-02 15:09
 **/
@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private LoginServer loginServer;
    @Autowired
    private RoleUrlService roleUrlService;
    @Autowired
    private LoginDao loginDao;
    @Autowired
    private Result result;

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        Result result = new Result();
        User user1 = loginServer.selectByName(user);
        if (user1 == null) {
            return result.fail("用户不存在！");
        } else {
            if (user1.getStatus()==1) {
                Long status = loginServer.loginUser(user);
                List<RoleUrl> menu = roleUrlService.getMenu(user1.getRole());

                if (status > 0) {
                    return result.tokenAndMenu(200, "登录成功", menu, user1);
                } else {
                    return result.fail("密码错误,请重试！！");
                }
            } else if(user1.getStatus()==0){
                return result.fail(99999,"此用户已被禁用，请联系管理员解除",null);
            }else {
                return result.fail("登录失败");
            }
        }

    }

    //注册
    @PostMapping("/register")
    public String registered(@RequestBody User user) {

        return "";
    }

    //注销
    @PostMapping("/logout")
    public String logout() {

        return "";
    }

    @PutMapping("/changeStatus")
    public Result changeStatus(@RequestBody UserInfo user) {
        int i = loginServer.changeStatus(user);
        if (i > 0) {
            return result.success(200, "恭喜啊，更新用户状态成功", null);
        } else {
            return result.fail("更新状态失败，请重试！");
        }

    }

}
