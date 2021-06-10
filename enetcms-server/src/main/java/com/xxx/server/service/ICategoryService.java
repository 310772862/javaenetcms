package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.Category;
import com.xxx.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
public interface ICategoryService extends IService<Category> {

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
     * 保存信息
     * @param category
     * @return
     */
    RespBean categoryDataSave(Category category);

    /**
     * 根据ID删除信息
     * @param id
     * @return
     */
    RespBean categoryDelete(Integer id);
}
