package com.xxx.server.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xxx.server.mapper.WebsiteMapper;
import com.xxx.server.pojo.RespBean;
import com.xxx.server.pojo.Website;
import com.xxx.server.service.IWebsiteService;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private WebsiteMapper websiteMapper;

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


    /**
     * 根据ID获取详细信息
     * @param id
     * @return
     */
    @ApiOperation(value = "根据ID获取详细信息")
    @GetMapping("info")
    public RespBean getWebsiteInfo(Integer id){
        Website website = websiteService.getWebsiteInfo(id);
        if (null != website) {
            return RespBean.success("信息获取成功", website);
        } else {
            return RespBean.error("信息不存在");
        }
    }

    /**
     * 数据保存
     * @param website
     * @return
     */
    @ApiOperation(value = "数据保存")
    @PostMapping("data_save")
    public RespBean websiteDataSave(@RequestBody Website website) {
        return websiteService.websiteDataSave(website);
    }

    /**
     * 设置状态
     * @param website
     * @param type
     * @return
     */
    @ApiOperation(value = "设置状态")
    @PostMapping("set_data")
    public RespBean setData(@RequestBody Website website,String type) {
        return websiteService.setData(website,type);
    }
}
