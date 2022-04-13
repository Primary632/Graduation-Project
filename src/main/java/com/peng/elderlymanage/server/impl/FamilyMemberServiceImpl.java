package com.peng.elderlymanage.server.impl;


import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.peng.elderlymanage.dao.FamilyMemberDao;
import com.peng.elderlymanage.entity.ElderlyInfo;
import com.peng.elderlymanage.entity.FamilyMember;
import com.peng.elderlymanage.server.FamilyMemberService;
import com.peng.elderlymanage.vo.FamilyMemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
@Service
public class FamilyMemberServiceImpl implements FamilyMemberService {
    @Autowired
    private FamilyMemberDao familyMemberDao;
    @Override
    public IPage<FamilyMemberVo> getAllMember(IPage<FamilyMemberVo> page, String search) {
        LambdaQueryWrapper<FamilyMemberVo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(FamilyMemberVo::getStatus,"1");
        return familyMemberDao.getAllMember(page, wrapper);
    }

    @Override
    public int addMember(ElderlyInfo elderlyInfo) {
        FamilyMember familyMember = new FamilyMember();
        familyMember.setMname(elderlyInfo.getMember().getMname());
        familyMember.setSex(elderlyInfo.getMember().getSex());
        familyMember.setMphone(elderlyInfo.getMember().getMphone());
        familyMember.setCreatedTime(DateUtil.today());
        familyMemberDao.insertMember(familyMember);
        return familyMember.getId();
    }

    @Override
    public int update(ElderlyInfo elderlyInfo) {
        FamilyMember familyMember = new FamilyMember();
        familyMember.setId(elderlyInfo.getMember().getId());
        familyMember.setMname(elderlyInfo.getMember().getMname());
        familyMember.setSex(elderlyInfo.getMember().getSex());
        familyMember.setMphone(elderlyInfo.getMember().getMphone());
        familyMember.setUpdatedTime(DateUtil.today());
        return familyMemberDao.updateById(familyMember);
    }

    @Override
    public int deleteMember(ElderlyInfo elderlyInfo) {
        elderlyInfo.getMember().setUpdatedTime(DateUtil.today());

        return familyMemberDao.deleteMember(elderlyInfo.getMember().getId(),elderlyInfo.getMember().getUpdatedTime());
    }
}
