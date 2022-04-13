package com.peng.elderlymanage.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @projectName: Graduation-Project
 * @className: BodyInfoVo
 * @description:
 * @author: 空城丶
 * @create: 2022-04-06 17:42
 **/
@Data
public class BodyInfoVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 老人ID
     */
    private Integer eid;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String updateTime;
    /**
     * 舒张压:低压
     */
    private Integer lowBloodPressure;
    /**
     * 收缩压：高压
     */
    private Integer highBloodPressure;
    /**
     * 心率
     */
    private Integer heartRate;
    /**
     * 听力
     */
    private Double hearing;
    /**
     * 体重
     */
    private Double weight;
    /**
     * 状态 1：未删除 2：删除
     */
    private Integer status;

    private String name;
    private String dname;

}
