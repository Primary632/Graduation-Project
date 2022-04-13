package com.peng.elderlymanage.server;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.peng.elderlymanage.entity.BodyInfo;
import com.peng.elderlymanage.vo.BodyInfoVo;

/**
 * <p>
 * 身体信息表 服务类
 * </p>
 *
 * @author wangyapeng
 * @since 2022-03-10
 */
public interface BodyInfoService  {

    IPage<BodyInfoVo> getAll(IPage<BodyInfoVo> bodyPage, String search);
}
