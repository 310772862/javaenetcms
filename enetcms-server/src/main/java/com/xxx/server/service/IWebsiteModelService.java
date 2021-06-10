package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.WebsiteModel;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
public interface IWebsiteModelService extends IService<WebsiteModel> {

    /**
     * 获取网站模块列表
     * @return
     */
    List<WebsiteModel> getWebsiteModelList();
}
