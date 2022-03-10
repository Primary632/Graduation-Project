package com.peng.elderlymanage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @projectName: Graduation-Project
 * @className: RtUser
 * @description:
 * @author: 空城丶
 * @create: 2022-03-03 09:18
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RtUser {
    private int id;
    private String username;
    private String password;
    private int role;
}
