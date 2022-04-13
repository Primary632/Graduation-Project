package com.peng.elderlymanage.dao;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.peng.elderlymanage.entity.BodyInfo;
import com.peng.elderlymanage.vo.BodyInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 身体信息表 Mapper 接口
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
@Mapper
public interface BodyInfoDao extends BaseMapper<BodyInfo> {
    @Select("SELECT b.*,e.`name`,d.`dname` from (rt_body_info b LEFT JOIN rt_elderly_info e on b.eid=e.id) left join rt_doctor d on b.created_people=d.id where b.`status`=1 ")
    IPage<BodyInfoVo> getAllBodyInfo(IPage<BodyInfoVo> bodyPage);
}
