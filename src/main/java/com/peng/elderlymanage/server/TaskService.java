package com.peng.elderlymanage.server;

import com.peng.elderlymanage.vo.NurseTaskVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-04-12
 */
public interface TaskService {

    int updateById(NurseTaskVo nurseTaskVo);
}
