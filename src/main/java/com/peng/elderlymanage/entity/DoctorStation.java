package com.peng.elderlymanage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

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
@ToString
@AllArgsConstructor
@TableName("rt_doctor_station")
public class DoctorStation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 职位名称
     */
    private String stationName;



}
