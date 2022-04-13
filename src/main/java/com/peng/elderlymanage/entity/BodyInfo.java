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
 * 身体信息表
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("rt_body_info")
public class BodyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

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

}
