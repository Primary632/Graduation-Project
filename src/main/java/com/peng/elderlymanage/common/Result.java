package com.peng.elderlymanage.common;

import com.peng.elderlymanage.entity.RoleUrl;
import com.peng.elderlymanage.entity.User;
import lombok.Data;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @projectName: Graduation-Project
 * @className: Result
 * @description:
 * @author: 空城丶
 * @create: 2022-03-10 17:42
 **/

@Data
@Service
public class Result<T> implements Serializable {
    private int code;
    private String msg;
    private T data;
    private User user;
    private List<RoleUrl> menu;
    public  Result tokenAndMenu(int code, String msg, List<RoleUrl> menu, User user){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setUser(user);
        result.setMenu(menu);
        return result;
    }
    public Result success(int code,String msg,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return  result;
    }
    public Result fail(int code,String msg,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return  result;
    }
    public Result fail(String msg,Object data){
        return  fail(400,msg,data);
    }
    public Result fail(String msg){
        return  fail(400,msg,null);
    }
    public Result success(Object data){
        return success(200,"操作成功",data);
    }
}
