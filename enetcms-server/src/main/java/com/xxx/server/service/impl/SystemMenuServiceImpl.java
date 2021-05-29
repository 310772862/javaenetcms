package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.SystemMenuMapper;
import com.xxx.server.pojo.SystemAdmin;
import com.xxx.server.pojo.SystemMenu;
import com.xxx.server.service.ISystemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class SystemMenuServiceImpl extends ServiceImpl<SystemMenuMapper, SystemMenu> implements ISystemMenuService {

    @Autowired
    private SystemMenuMapper systemMenuMapper;
    /**
     * 通过后台用户ID查询菜单列表
     * @return
     */
    @Override
    public List<SystemMenu> getSystemMenusBySystemAdminId() {
        List<SystemMenu> systemMenus = systemMenuMapper.getSystemMenusBySystemAdminId(((SystemAdmin) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getID());

        List<SystemMenu> menuList = new ArrayList<>();

        for(SystemMenu systemMenu : systemMenus) {
            // 一级菜单的printId是0
            if (systemMenu.getPARENT_ID() == 0) {
                menuList.add(systemMenu);
            }
        }

        // 为一级菜单设置菜单，getChild是递归调用
        for(SystemMenu systemMenu : menuList){
            systemMenu.setChildren(getChilde(systemMenu.getID(), systemMenus));
        }

        return menuList;
    }

    private List<SystemMenu> getChilde(Integer id, List<SystemMenu> rootList) {
        // 子菜单
        List<SystemMenu> childList = new ArrayList<>();
        for (SystemMenu systemMenu : rootList) {
            // 遍历所有节点，将父菜单id与传过来的ID比较
            if (systemMenu.getPARENT_ID().equals(id)) {
                childList.add(systemMenu);
            }
        }

        // 把子菜单的子菜单再循环一遍
        for(SystemMenu systemMenu : childList) {
            systemMenu.setChildren(getChilde(systemMenu.getID(),rootList));
        }

        // 递归退出条件
        if(childList.size() == 0){
            return null;
        }
        return childList;
    }
}
