package com.peng.elderlymanage.common;


import cn.hutool.core.date.DateUtil;
import com.peng.elderlymanage.dao.ElderlyInfoDao;
import com.peng.elderlymanage.dao.TaskDao;
import com.peng.elderlymanage.entity.ElderlyInfo;
import com.peng.elderlymanage.entity.Task;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class SaticScheduleTask {
    @Autowired
    private ElderlyInfoDao elderlyInfoDao;
    @Autowired
    private TaskDao taskDao;
    //自动添加任务信息 每天8点执行
    @Scheduled(cron = "0 0 8 * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {
        List<ElderlyInfo> elderlyInfoList=  elderlyInfoDao.getAllElderWithID();
        int elderSize = elderlyInfoList.size()-1;
        int a=0;
        int id[]={};
        Task task = new Task();

        for(int i = 0;i<elderlyInfoList.size();i++){
            task.setId(i+1);
            task.setEid(elderlyInfoList.get(i).getId());
            task.setCreatedTime(DateUtil.today());
            int insert = taskDao.insert(task);
            if(insert>0){
                a++;
            }else{
                id[i]=elderlyInfoList.get(i).getId();
            }
        }

        if(elderSize+1==a){
            System.out.println("成功");
        }else{
            System.out.println(id.length);
        }




    }
}
