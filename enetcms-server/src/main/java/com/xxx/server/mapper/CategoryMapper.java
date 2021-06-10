package com.xxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxx.server.pojo.Category;
import com.xxx.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * 获取列表
     * @param website_id
     * @return
     */
    List<Category> getCategoryList(Integer website_id);

    /**
     * 获取详情
     * @param id
     * @return
     */
    Category getCategoryInfo(Integer id);

    /**
     * 根据ID删除信息
     * @param id
     * @return
     */
    RespBean categoryDelete(Integer id);
}
