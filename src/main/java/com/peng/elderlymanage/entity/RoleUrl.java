package com.peng.elderlymanage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author wangyapeng
 * @since 2022-04-04
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName("rt_role_url")
public class RoleUrl implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 权限ID
     */
    private Integer rid;
    /**
     * 请求路径
     */
    private String path;
    /**
     * 路径名字
     */
    private String name;
    /**
     * 标签名字
     */
    private String label;
    /**
     * 标签图标
     */
    private String icon;
    /**
     * 页面路径
     */
    private String url;
    /**
     * 子路径
     */
    private String childrenid;
    private String redirest;
    private List<RoleChildren> children;


}
