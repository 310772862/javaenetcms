package com.xxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxx.server.pojo.SystemMenu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
public interface SystemMenuMapper extends BaseMapper<SystemMenu> {

    /**
     * 通过后台用户ID查询菜单列表
     * @param id
     * @return
     */
    List<SystemMenu> getSystemMenusBySystemAdminId(Integer id);

}
