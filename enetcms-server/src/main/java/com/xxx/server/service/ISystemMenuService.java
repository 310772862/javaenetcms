package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.SystemMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
public interface ISystemMenuService extends IService<SystemMenu> {

    /**
     * 通过后台用户ID查询菜单列表
     * @return
     */
    List<SystemMenu> getSystemMenusBySystemAdminId();

}
