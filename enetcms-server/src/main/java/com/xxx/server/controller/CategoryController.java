package com.xxx.server.controller;


import com.xxx.server.pojo.Category;
import com.xxx.server.pojo.RespBean;
import com.xxx.server.service.ICategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    /**
     * 获取列表
     * @param website_id
     * @return
     */
    @ApiOperation(value = "获取列表")
    @GetMapping("list")
    public RespBean getCategoryList(Integer website_id){
        List<Category> categoryList = categoryService.getCategoryList(website_id);
        return RespBean.success("信息获取成功", categoryList);
    }

    /**
     * 根据ID获取详情
     * @param id
     * @return
     */
    @ApiOperation(value = "根据ID获取详情")
    @GetMapping("info")
    public RespBean getCategoryInfo(Integer id){
        Category category = categoryService.getCategoryInfo(id);
        if (null != category) {
            return RespBean.success("信息获取成功", category);
        } else {
            return RespBean.success("信息不存在");
        }
    }

    /**
     * 保存信息
     * @param category
     * @return
     */
    @ApiOperation(value = "保存信息")
    @PostMapping("data_save")
    public RespBean categoryDataSave(@RequestBody Category category){
        return categoryService.categoryDataSave(category);
    }

    @ApiOperation(value = "根据ID删除信息")
    @GetMapping("delete")
    public RespBean categoryDelete(Integer id){
        return categoryService.categoryDelete(id);
    }

}
