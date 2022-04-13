package com.peng.elderlymanage.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @projectName: Graduation-Project
 * @className: FamilyMemberVo
 * @description:
 * @author: 空城丶
 * @create: 2022-04-10 22:25
 **/
@Data
public class FamilyMemberVo {


    private Integer id;
    private String mname;
    private String mphone;
    /**
     * 老人ID
     */
    private Integer eid;
    /**
     * 1:男，2:女
     */
    private Integer sex;
    /**
     * 登录用户ID
     */
    private String status;
    private String createdTime;
    private String updateTime;
    /*老人名字*/
    private Integer name;

}
