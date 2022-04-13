package com.peng.elderlymanage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-30
 */
@Data
@TableName("rt_nurse")
public class Nurse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 护士姓名
     */
    private String nname;
    /**
     * 地址
     */
    private String address;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 工资
     */
    private Float salary;
    /**
     * 级别
     */
    private Integer level;
    /**
     * 入职时间
     */
    private String createdTime;
    /**
     * 离职时间
     */
    private String updateTime;
    /**
     * 1：在职 2：外派 3：离职
     */
    private String status;
    @TableField(exist = false)
    private NurseLevel nurseLevel;


}
