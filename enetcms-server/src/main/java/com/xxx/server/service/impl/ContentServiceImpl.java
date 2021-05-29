package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.ContentMapper;
import com.xxx.server.pojo.Content;
import com.xxx.server.service.IContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {

    @Resource
    ContentMapper contentMapper;

    @Override
    public List<Map> getList(String name, String keyword) {
        Map param = new HashMap();
        param.put("name", name);
        param.put("keyword", keyword);
        System.out.println(param);
        return contentMapper.getList(param);
    }
}
