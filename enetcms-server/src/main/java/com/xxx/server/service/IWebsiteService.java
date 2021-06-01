package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.Website;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
public interface IWebsiteService extends IService<Website> {

    /**
     * 获取站点管理列表
     * @param page
     * @return
     */
    List<Website> getWebsiteList(Integer page, Integer limit, String name);

    Integer getWebsiteCount(String name);
}
