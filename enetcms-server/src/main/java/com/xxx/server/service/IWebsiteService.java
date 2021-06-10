package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.RespBean;
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

    /**
     * 获取数据数量
     * @param name
     * @return
     */
    Integer getWebsiteCount(String name);

    /**
     * 根据ID获取详细信息
     * @param id
     * @return
     */
    Website getWebsiteInfo(Integer id);

    /**
     * 数据保存
     * @param website
     * @return
     */
    RespBean websiteDataSave(Website website);

    /**
     * 设置数据
     * @param website
     * @param type
     * @return
     */
    RespBean setData(Website website, String type);
}
