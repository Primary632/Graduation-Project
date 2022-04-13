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
@TableName("rt_family_member")
public class FamilyMember implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
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
    private String updatedTime;
}
