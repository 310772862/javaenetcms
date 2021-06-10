package com.xxx.server.controller;


import com.xxx.server.pojo.RespBean;
import com.xxx.server.service.IAuditRuleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@RestController
@RequestMapping("/audit-rule")
public class AuditRuleController {

    @Autowired
    private IAuditRuleService auditRuleService;

    @ApiOperation(value = "获取审核流程")
    @GetMapping("list")
    public RespBean getAuditRuleList()
    {
        return auditRuleService.getAuditRuleList();
    }
}
