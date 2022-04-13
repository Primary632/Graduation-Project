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
@TableName("rt_doctor")
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 医生姓名
     */
    private String dname;
    /**
     * 楼层
     */
    private String floor;
    /**
     * 房间
     */
    private String room;
    /**
     * 电话
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 职位
     */
    private int stationid;
    /**
     * 创建时间
     */
    private String createdTime;
    /**
     * 删除时间
     */
    private String deletedTime;
    /**
     * 状态
     */
    private String status;
    private DoctorStation station;




}
