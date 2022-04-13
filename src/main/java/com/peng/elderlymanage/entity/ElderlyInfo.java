package com.peng.elderlymanage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.lang.reflect.Member;

/**
 * <p>
 *
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
@TableName("rt_elderly_info")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ElderlyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
    private Integer sex;
    private String address;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 自理等级
     */
    private String selfcareLevel;
    /**
     * 是否患有重大疾病
     */
    private Integer isillness;
    /**
     * 疾病内容
     */
    private String content;
    /**
     * 家属id
     */
    private String memberid;
    private  String createdTime;
    private  String updatedTime;
    private String status;
    @TableField(exist = false)
    private FamilyMember member;

}
