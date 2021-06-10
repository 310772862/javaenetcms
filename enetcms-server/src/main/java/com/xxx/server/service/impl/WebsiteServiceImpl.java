package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.WebsiteMapper;
import com.xxx.server.pojo.RespBean;
import com.xxx.server.pojo.Website;
import com.xxx.server.service.IWebsiteService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    @Override
    public Website getWebsiteInfo(Integer id) {
        return websiteMapper.getWebsiteInfo(id);
    }

    @Override
    public RespBean websiteDataSave(Website website) {
        if (StringUtils.isEmpty(website.getNAME())) {
            return RespBean.error("名称不能为空");
        }
        if (StringUtils.isEmpty(website.getLANGUAGE())) {
            return RespBean.error("语言标签不能为空");
        }
        if (null == website.getID()) {
            String timestamp = String.valueOf(new Date().getTime()/1000);
            website.setCREATE_TIME(Integer.valueOf(timestamp));
            if(null != this.getOne(new QueryWrapper<Website>().eq("LANGUAGE",website.getLANGUAGE()).last("limit 1"))){
                return RespBean.error("语言标签已存在");
            }
        } else {
            if(null != this.getOne(new QueryWrapper<Website>().eq("LANGUAGE",website.getLANGUAGE()).ne("ID",website.getID()).last("limit 1"))){
                return RespBean.error("语言标签已存在");
            }
        }

        if(this.saveOrUpdate(website)){
            return RespBean.success("信息保存成功");
        } else {
            return RespBean.error("信息保存失败");
        }
    }

    @Override
    public RespBean setData(Website website, String type) {
        if (null == type) {
            return RespBean.error("请求类型不能为空");
        }
        if (null == website.getID()) {
            return RespBean.error("ID不能为空");
        }
        List<Website> websiteList = null;
        switch (type) {
            case "status":
                break;
            case "is_default":
                // 如果是设置默认，获取过 往的默认信息，设置成功后要把这些信息设为非默认
                websiteList = websiteMapper.selectList(new QueryWrapper<Website>().eq("IS_DEFAULT", 1).ne("ID", website.getID()));
                break;
        }
        if(this.saveOrUpdate(website)) {
            switch (type) {
                case "is_default":  // 只有一个默认，所以要把其他信息设为非默认
                    for(int i = 0; i< websiteList.size(); i++){
                        websiteList.get(i).setIS_DEFAULT(2);
                        this.saveOrUpdate(websiteList.get(i));
                    }
                    break;
            }
            return RespBean.success("设置成功");
        } else {
            return RespBean.error("设置失败");
        }
    }
}
