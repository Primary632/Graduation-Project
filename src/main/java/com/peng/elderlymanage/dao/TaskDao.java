package com.peng.elderlymanage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.peng.elderlymanage.entity.Task;
import com.peng.elderlymanage.vo.NurseTaskVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyapeng
 * @since 2022-04-12
 */
@Mapper
public interface TaskDao extends BaseMapper<Task> {
    @Select("select n.nname,e.name, t.* from (rt_task t left join rt_elderly_info e on t.eid=e.id) left JOIN rt_nurse n on t.nid=n.id where t.status='1' and e.name like CONCAT('%',#{search})")
   IPage<NurseTaskVo> selectAllTask(IPage<NurseTaskVo> page,String search);
    @Select("SELECT i.name, n.nname, t.* from ((rt_care c INNER Join rt_nurse n on c.nid=n.id) INNER JOIN rt_task t on t.eid=c.eid ) LEFT JOIN rt_elderly_info i on t.eid=i.id where c.nid=#{id}  and i.name like CONCAT('%',#{search})")
    IPage<NurseTaskVo> selectAllTaskByNid(IPage<NurseTaskVo> page,String search,Integer id);
    int updateByTid(NurseTaskVo nurseTaskVo);
}
