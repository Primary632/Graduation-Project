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
 * 健康信息配置表
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("rt_health_config")
public class HealthConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 创建人id
     */
    private Integer creator;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改人
     */
    private Integer updater;
    /**
     * 修改时间
     */
    private String updateTime;
    /**
     * 最小低血压
     */
    private Integer minLowBloodPressure;
    /**
     * 最高低血压
     */
    private Integer maxLowBloodPressure;
    /**
     * 最小高血压
     */
    private Integer minHighBloodPressure;
    /**
     * 最大高血压
     */
    private Integer maxHighBloodPressure;
    /**
     * 最小心率
     */
    private Integer minHeartRate;
    /**
     * 最大心率
     */
    private Integer maxHeartRate;
    /**
     * 最低体温
     */
    private Double minTemperature;
    /**
     * 最高体温
     */
    private Double maxTemperature;
    /**
     * 老人ID
     */
    private Integer eid;



}
