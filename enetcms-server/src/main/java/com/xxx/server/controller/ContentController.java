package com.xxx.server.controller;


import com.xxx.server.service.impl.ContentServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
@RequestMapping("/content")
public class ContentController {

    @Resource
    private ContentServiceImpl contentService;

    @RequestMapping("/list")
    public List<Map> getList(String name, String keyword){
        return contentService.getList(name,keyword);
    }

}
