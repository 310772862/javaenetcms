package com.xxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxx.server.pojo.Content;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
public interface ContentMapper extends BaseMapper<Content> {

    public List<Map> getList(Map param);

}
