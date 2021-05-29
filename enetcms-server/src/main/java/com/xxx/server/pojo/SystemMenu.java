package com.xxx.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ENETCMS_SYSTEM_MENU")
@ApiModel(value="SystemMenu对象", description="")
public class SystemMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "父级ID")
    private Integer PARENT_ID;

    @ApiModelProperty(value = "名")
    private String NAME;

    @ApiModelProperty(value = "标题")
    private String TITLE;

    private String ICON;

    private String JUMP;

    @ApiModelProperty(value = "模型名称")
    private String MODEL;

    @ApiModelProperty(value = "控制器")
    private String CONTROLLER;

    @ApiModelProperty(value = "方法")
    private String ACTION;

    @ApiModelProperty(value = "1表示展示")
    private Integer IS_SHOW;

    @ApiModelProperty(value = "排序，越大越靠前")
    private Integer SORT_ID;

    @ApiModelProperty(value = "状态1正常 2关闭")
    private Integer STATUS;

    @ApiModelProperty(value = "是否删除1删除进入垃圾站")
    private Integer IS_DEL;

    @ApiModelProperty(value = "子菜单")
    @TableField(exist = false)
    private List<SystemMenu> children = new ArrayList<>();


}
