package com.peng.elderlymanage.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @projectName: Graduation-Project
 * @className: ElderBedVo
 * @description:
 * @author: 空城丶
 * @create: 2022-04-12 12:13
 **/
@Data
public class ElderBedVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Integer sex;
    private String floorNum;
    private String roomNum;
    private String createdTime;
    private String updatedTime;

}
