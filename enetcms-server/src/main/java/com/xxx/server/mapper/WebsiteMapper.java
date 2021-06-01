package com.xxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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

    List<Website> getWebsiteList(Integer start_limit, Integer page_num, String name);

    Integer getWebsiteCount(String name);
}
