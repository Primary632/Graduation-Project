package com.peng.elderlymanage.server;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.entity.Nurse;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-30
 */
public interface NurseService  {

    IPage<Nurse> getAllNurseInfo(Page<Nurse> page, String search);

    int updateNurse(Nurse nurse);

    int addNurse(Nurse nurse);

    int deleteNurse(Integer id);
}
