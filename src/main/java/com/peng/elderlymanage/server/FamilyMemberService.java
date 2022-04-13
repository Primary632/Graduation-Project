package com.peng.elderlymanage.server;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.peng.elderlymanage.entity.ElderlyInfo;
import com.peng.elderlymanage.vo.FamilyMemberVo;

import java.lang.annotation.ElementType;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
public interface FamilyMemberService  {

    IPage<FamilyMemberVo> getAllMember(IPage<FamilyMemberVo> page, String search);

    int addMember(ElderlyInfo elderlyInfo);
    int update(ElderlyInfo elderlyInfo);
    int deleteMember(ElderlyInfo elderlyInfo);
}
