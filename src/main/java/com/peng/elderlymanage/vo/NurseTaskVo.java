package com.peng.elderlymanage.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @projectName: Graduation-Project
 * @className: NurseTaskVo
 * @description:
 * @author: 空城丶
 * @create: 2022-04-12 15:23
 **/
@Data
public class NurseTaskVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 体温表
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 老人ID
     */
    private Integer eid;
    /**
     * 填写日期
     */
    private String inputData;
    /**
     * 温度
     */
    private String temperature;
    /**
     * 血糖
     */
    private String bloodGlucose;
    /**
     * 血压
     */
    private String bloodPressure;
    /**
     * 血脂
     */
    private String bloodFat;
    /**
     * 修改人的ID
     */
    private String updatedId;
    /**
     * 上传体温的ID
     */
    private String nid;
    /**
     * 修改时间
     */
    private String updatedTime;
    /**
     * 创建时间
     */
    private String createdTime;
    /**
     * 删除时间
     */
    private String status;
    /**
     * 老人名字
     * */
    private String name;
    /**
     * 护士名字*/
   private String nname;
}
