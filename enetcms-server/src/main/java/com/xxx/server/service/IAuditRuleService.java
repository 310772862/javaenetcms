package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.AuditRule;
import com.xxx.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
public interface IAuditRuleService extends IService<AuditRule> {

    /**
     * 获取审核流程列表
     * @return
     */
    RespBean getAuditRuleList();
}
