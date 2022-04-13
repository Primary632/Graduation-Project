package com.peng.elderlymanage.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.peng.elderlymanage.entity.FamilyMember;
import com.peng.elderlymanage.vo.FamilyMemberVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.PatchMapping;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
@Mapper
public interface FamilyMemberDao extends BaseMapper<FamilyMember> {
    FamilyMember selectMemberByMid(Integer memberid);
    @Select("select m.*,e.name from rt_family_member m left join rt_elderly_info e on m.eid=e.id  ${ew.customSqlSegment}")
    IPage<FamilyMemberVo> getAllMember(IPage<FamilyMemberVo> page,@Param("ew") LambdaQueryWrapper<FamilyMemberVo> wrapper);

    int insertMember(FamilyMember familyMember);
    @Update("update rt_family_member set status='0',updated_time=#{updatedTime} where id=#{id}  ")
    int deleteMember(Integer id, String updatedTime);
}
