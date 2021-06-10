package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.CategoryMapper;
import com.xxx.server.pojo.Category;
import com.xxx.server.pojo.RespBean;
import com.xxx.server.service.ICategoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 获取列表
     * @param website_id
     * @return
     */
    @Override
    public List<Category> getCategoryList(Integer website_id) {
        List<Category> categories =  categoryMapper.getCategoryList(website_id);

        List<Category> categoryList = new ArrayList<>();

        for(Category category : categories) {
            // 一级菜单的printId是0
            if (category.getPARENT_ID() == 0) {
                categoryList.add(category);
            }
        }

        // 为一级菜单设置菜单，getChild是递归调用
        for(Category category : categoryList){
            category.setChildren(getChilde(category.getID(), categories));
        }

        return categoryList;
    }

    private List<Category> getChilde(Integer id, List<Category> rootList) {
        // 子菜单
        List<Category> childList = new ArrayList<>();
        for (Category category : rootList) {
            // 遍历所有节点，将父菜单id与传过来的ID比较
            if (category.getPARENT_ID().equals(id)) {
                childList.add(category);
            }
        }

        // 把子菜单的子菜单再循环一遍
        for(Category category : childList) {
            category.setChildren(getChilde(category.getID(),rootList));
        }

        // 递归退出条件
        if(childList.size() == 0){
            return null;
        }
        return childList;
    }

    /**
     * 获取详情
     * @param id
     * @return
     */
    @Override
    public Category getCategoryInfo(Integer id) {
        return categoryMapper.getCategoryInfo(id);
    }

    @Override
    public RespBean categoryDataSave(Category category) {
        if (StringUtils.isEmpty(category.getNAME())) {
            return RespBean.error("请输入栏目名称");
        }

        if (null == category.getMODEL_ID() || category.getMODEL_ID() == 0){
            return RespBean.error("请选择栏目模型");
        }
        if (null == category.getID()) {
            String timestamp = String.valueOf(new Date().getTime()/1000);
            category.setCREATE_TIME(Integer.valueOf(timestamp));
        }

        if(this.saveOrUpdate(category)){
            return RespBean.success("信息保存成功");
        } else {
            return RespBean.error("信息保存失败");
        }
    }

    /**
     * 根据ID删除信息
     * @param id
     * @return
     */
    @Override
    public RespBean categoryDelete(Integer id) {
        if (null == id) {
            return RespBean.error("ID不能为空");
        }
        Category category = getCategoryInfo(id);
        if (null == category) {
            return RespBean.error("栏目不存在");
        }
        category.setIS_DEL(1);  // 1 代表已删除
        if(this.saveOrUpdate(category)) {
            return RespBean.success("删除成功");
        } else {
            return RespBean.error("删除失败");
        }
    }
}
