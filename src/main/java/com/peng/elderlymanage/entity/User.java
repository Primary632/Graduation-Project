package com.peng.elderlymanage.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("rt_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    //加盐操作
    private String salt;
    /**
     * 1:管理员 2: 医生 3:护工 4:家属
     */
    private Integer role;
    private Integer status;
    private String token;
    private String createdTime;
    private String updatedTime;
    private Integer exid;

}
