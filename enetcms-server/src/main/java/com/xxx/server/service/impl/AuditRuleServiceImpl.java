package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.AuditRuleMapper;
import com.xxx.server.pojo.AuditRule;
import com.xxx.server.pojo.RespBean;
import com.xxx.server.service.IAuditRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Service
public class AuditRuleServiceImpl extends ServiceImpl<AuditRuleMapper, AuditRule> implements IAuditRuleService {
    @Autowired
    private AuditRuleMapper auditRuleMapper;
    @Override
    public RespBean getAuditRuleList() {
        List<AuditRule> auditRuleList = auditRuleMapper.getAuditRuleList();
        return RespBean.success("信息获取成功", auditRuleList);
    }
}
