package com.peng.elderlymanage.server;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.peng.elderlymanage.entity.ElderlyInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
public interface ElderlyInfoService  {

    Page<ElderlyInfo> selectAll(IPage<ElderlyInfo> infoPage, String search);

    int addElder(ElderlyInfo elderlyInfo);

    int updateElder(ElderlyInfo elderlyInfo);
    int deleteElder(ElderlyInfo elderlyInfo);
}
