package com.xxx.server.controller;


import com.xxx.server.pojo.RespBean;
import com.xxx.server.pojo.Website;
import com.xxx.server.service.IWebsiteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@RestController
@RequestMapping("/website")
public class WebsiteController {
    @Autowired
    private IWebsiteService websiteService;

    /**
     * 获取站点管理列表
     * @param page
     * @return
     */
    @ApiOperation(value = "站点管理列表")
    @GetMapping("list")
    public RespBean getWebsiteList(Integer page, Integer limit, String name){
        List<Website> websiteList = websiteService.getWebsiteList(page, limit, name);
        Integer websiteCount = websiteService.getWebsiteCount(name);
        return RespBean.success("信息获取成功", websiteList, websiteCount);
    }
}
