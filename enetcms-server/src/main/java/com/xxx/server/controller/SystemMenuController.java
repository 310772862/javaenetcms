package com.xxx.server.controller;


import com.xxx.server.pojo.SystemMenu;
import com.xxx.server.service.ISystemAdminService;
import com.xxx.server.service.ISystemMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
@RequestMapping("/system")
public class SystemMenuController {

    @Autowired
    private ISystemMenuService systemMenuService;

    @ApiOperation(value="通过后台用户ID查询菜单列表")
    @GetMapping("menu")
    public List<SystemMenu> getSystemMenusBySystemAdminId(){
        return systemMenuService.getSystemMenusBySystemAdminId();
    }

}
