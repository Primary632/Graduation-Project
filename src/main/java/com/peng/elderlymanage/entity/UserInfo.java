package com.peng.elderlymanage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("rt_user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
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
    private User user;
    private String sex;

}
