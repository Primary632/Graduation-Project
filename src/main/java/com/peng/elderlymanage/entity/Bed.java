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
@TableName("rt_bed")
public class Bed implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 价格
     */
    private Float price;
    /**
     * 1:入住 0:未入住
     */
    private String isStayin;
    /**
     * 楼层
     */
    private String floorNum;
    /**
     * 房间号
     */
    private String roomNum;
    /**
     * 一间屋里面有几张床
     */
    private String bedNum;
    /**
     * 入住老人的信息
     */
    private Integer elderlyId;
    /**
     * 1: 可使用 2：移除
     */
    private String status;
    /**
     * 入住时间
     */
    private String stayinTime;
    /**
     * 退租时间
     */
    private String stayoutTime;
}
