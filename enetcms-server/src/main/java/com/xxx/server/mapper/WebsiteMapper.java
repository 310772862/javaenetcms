package com.xxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxx.server.pojo.RespBean;
import com.xxx.server.pojo.Website;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
public interface WebsiteMapper extends BaseMapper<Website> {

    /**
     * 站点管理列表
     * @param start_limit
     * @param page_num
     * @param name
     * @return
     */
    List<Website> getWebsiteList(Integer start_limit, Integer page_num, String name);

    /**
     * 获取数量
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
}
