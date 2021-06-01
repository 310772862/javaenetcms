package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.WebsiteMapper;
import com.xxx.server.pojo.Website;
import com.xxx.server.service.IWebsiteService;
import io.swagger.models.auth.In;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
public class WebsiteServiceImpl extends ServiceImpl<WebsiteMapper, Website> implements IWebsiteService {

    @Autowired
    private WebsiteMapper websiteMapper;

    @Value("${website.page_num}")
    private Integer page_num;

    @Override
    public List<Website> getWebsiteList(Integer page, Integer limit, String name) {
        Integer this_page = page < 1 ? 1 : page;
        page_num = limit <= 0 || limit == null ? page_num : limit;
        Integer start_limit = (this_page-1)*page_num;
        return websiteMapper.getWebsiteList(start_limit, page_num, name);
    }

    @Override
    public Integer getWebsiteCount(String name) {
        return websiteMapper.getWebsiteCount(name);
    }
}
