package com.peng.elderlymanage.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.peng.elderlymanage.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: Graduation-Project
 * @className: UserInfo
 * @description:
 * @author: 空城丶
 * @create: 2022-04-02 18:08
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoVo {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nickName;
    private String phone;
    private String email;
    private String address;
    /**
     * 注册时间
     */
    private String registrationTime;
    /**
     * 用户登录信息ID
     */
    private Integer uid;
    private Integer sex;
    private User user;
}
