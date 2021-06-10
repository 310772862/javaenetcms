package com.xxx.server.controller;


import com.xxx.server.pojo.RespBean;
import com.xxx.server.pojo.WebsiteModel;
import com.xxx.server.service.IWebsiteModelService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/website-model")
public class WebsiteModelController {

    @Autowired
    private IWebsiteModelService websiteModelService;

    /**
     * 获取网站模型列表
     * @return
     */
    @ApiOperation(value = "获取列表")
    @GetMapping("list")
    public RespBean getWebsiteModelList(){
        List<WebsiteModel> websiteModel = websiteModelService.getWebsiteModelList();
        if (null != websiteModel) {
            return RespBean.success("信息获取成功", websiteModel);
        } else {
            return RespBean.error("信息获取失败");
        }
    }
}
