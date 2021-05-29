package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.mapper.ContentMapper;
import com.xxx.server.pojo.Content;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Service
public interface IContentService extends IService<Content> {

    public List<Map> getList(String name, String keyword);
}
