package com.peng.elderlymanage.server.impl;

import com.peng.elderlymanage.dao.TaskDao;
import com.peng.elderlymanage.server.TaskService;
import com.peng.elderlymanage.vo.NurseTaskVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-04-12
 */
@Service
public class TaskServiceImpl  implements TaskService {
    @Autowired
    private TaskDao taskDao;
    @Override
    public int updateById(NurseTaskVo nurseTaskVo) {


        return taskDao.updateByTid(nurseTaskVo);
    }
}
