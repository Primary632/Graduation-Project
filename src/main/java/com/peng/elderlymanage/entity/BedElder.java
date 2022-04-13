package com.peng.elderlymanage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @projectName: Graduation-Project
 * @className: BedElder
 * @description:
 * @author: 空城丶
 * @create: 2022-04-12 12:21
 **/
@TableName("rt_bed_elder")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BedElder implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String eid;
    private String bid;
    private String createdTime;
    private String updatedTime;
    private String status;
}
