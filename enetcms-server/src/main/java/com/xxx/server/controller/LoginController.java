package com.xxx.server.controller;

import com.xxx.server.pojo.RespBean;
import com.xxx.server.pojo.SystemAdmin;
import com.xxx.server.pojo.SystemAdminLoginParam;
import com.xxx.server.service.ISystemAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created with IntelliJ IDEA
 * User: Administrator
 * Date: 2021/5/28 0028
 * Time: 9:23
 * Description: 登录
 */

@Api(tags = "LoginController")
@RestController
public class LoginController {

    @Autowired
    private ISystemAdminService systemAdminService;

    @ApiOperation(value = "登录之后返回token")
    @PostMapping("/login")
    public RespBean login(@RequestBody SystemAdminLoginParam systemAdminLoginParam, HttpServletRequest request){
        return systemAdminService.login(systemAdminLoginParam.getUsername(), systemAdminLoginParam.getPassword(), systemAdminLoginParam.getCode(), request);
    }

    @ApiOperation(value = "获取当前登录用户的信息")
    @GetMapping("/system/admin_info")
    public RespBean getSystemAdminInfo(Principal principal){
        if (null == principal){
            return null;
        }
        String username = principal.getName();
        SystemAdmin systemAdmin = systemAdminService.getSystemAdminByUserName(username);
        systemAdmin.setPASSWORD(null);
        return RespBean.success("信息获取成功",systemAdmin);
    }


    @ApiOperation(value = "退出登录")
    @GetMapping("/logout")
    public RespBean logout(){
        return RespBean.success("注销成功！");
    }




}
