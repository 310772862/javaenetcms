package com.xxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxx.server.pojo.WebsiteModel;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
public interface WebsiteModelMapper extends BaseMapper<WebsiteModel> {

    /**
     * 获取网站模型列表
     * @return
     */
    List<WebsiteModel> getWebsiteModelList();
}
