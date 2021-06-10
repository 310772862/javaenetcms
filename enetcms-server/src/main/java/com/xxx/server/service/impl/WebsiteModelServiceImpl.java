package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.WebsiteModelMapper;
import com.xxx.server.pojo.WebsiteModel;
import com.xxx.server.service.IWebsiteModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class WebsiteModelServiceImpl extends ServiceImpl<WebsiteModelMapper, WebsiteModel> implements IWebsiteModelService {

    @Autowired
    private WebsiteModelMapper websiteModelMapper;

    /**
     * 获取网站模型列表
     * @return
     */
    @Override
    public List<WebsiteModel> getWebsiteModelList() {
        return websiteModelMapper.getWebsiteModelList();
    }
}
