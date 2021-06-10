package com.xxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxx.server.pojo.AuditRule;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
public interface AuditRuleMapper extends BaseMapper<AuditRule> {

    /**
     * 获取审核流程
     * @return
     */
    List<AuditRule> getAuditRuleList();
}
