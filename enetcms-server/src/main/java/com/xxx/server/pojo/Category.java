package com.xxx.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Clob;
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
@TableName("ENETCMS_CATEGORY")
@ApiModel(value="Category对象", description="")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private String TYPE;

    @JsonProperty("video_url")
    private String VIDEO_URL;

    @JsonProperty("audit_rule_id")
    @ApiModelProperty(value = "审核流程，默认以系统为主,只应用到当前栏目，不影响下级")
    private Integer AUDIT_RULE_ID;

    @JsonProperty("parent_id")
    @ApiModelProperty(value = "父级ID")
    private Integer PARENT_ID;

    @ApiModelProperty(value = "自定义URL")
    private String DIR;

    @ApiModelProperty(value = "分类名称")
    private String NAME;

    @ApiModelProperty(value = "图标")
    private String ICON;

    @ApiModelProperty(value = "栏目别名")
    private String ALIAS;

    @ApiModelProperty(value = "图片")
    private String IMAGE;

    @ApiModelProperty(value = "图集")
    private String PIC;

    @JsonProperty("pic_title")
    private String PIC_TITLE;

    @ApiModelProperty(value = "描述")
    private String DESCRIPTION;

    @ApiModelProperty(value = "详细内容")
    private String CONTENT;

    @JsonProperty("meta_title")
    @ApiModelProperty(value = "SEO标题")
    private String META_TITLE;

    @JsonProperty("meta_keywords")
    @ApiModelProperty(value = "SEO关键字")
    private String META_KEYWORDS;

    @JsonProperty("meta_description")
    @ApiModelProperty(value = "SEO描述")
    private String META_DESCRIPTION;

    @ApiModelProperty(value = "指向地址")
    private String URL;

    @JsonProperty("category_template")
    @ApiModelProperty(value = "默认模板")
    private String CATEGORY_TEMPLATE;

    @JsonProperty("list_template")
    @ApiModelProperty(value = "列表模板")
    private String LIST_TEMPLATE;

    @JsonProperty("show_template")
    @ApiModelProperty(value = "详细展示模板")
    private String SHOW_TEMPLATE;

    @JsonProperty("template_child")
    @ApiModelProperty(value = "是否应用到下级 1代表应用")
    private Integer TEMPLATE_CHILD;

    @JsonProperty("menu_show")
    @ApiModelProperty(value = "主导航是否展示 1显示 2否")
    private Integer MENU_SHOW;

    @ApiModelProperty(value = "新窗口打开 1是 2否")
    private Integer BLANK;

    @JsonProperty("model_id")
    @ApiModelProperty(value = "所属模块ID")
    private Integer MODEL_ID;

    @JsonProperty("page_type")
    @ApiModelProperty(value = "页面类型 1列表 2单页")
    private Integer PAGE_TYPE;

    @JsonProperty("page_num")
    @ApiModelProperty(value = "每数显示数量")
    private Integer PAGE_NUM;

    @JsonProperty("website_id")
    @ApiModelProperty(value = "所属站点ID")
    private Integer WEBSITE_ID;

    @JsonProperty("sort_id")
    @ApiModelProperty(value = "排序，越大越靠前")
    private Integer SORT_ID;


    @JsonProperty("view_num")
    @ApiModelProperty(value = "浏览数量")
    private Integer VIEW_NUM;

    @JsonProperty("create_time")
    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    @ApiModelProperty(value = "1正常 2关闭")
    private Integer STATUS;

    @JsonProperty("pic_width")
    @ApiModelProperty(value = "内容封面宽度像素")
    private String PIC_WIDTH;

    @JsonProperty("pic_height")
    @ApiModelProperty(value = "内容图片高度像素")
    private String PIC_HEIGHT;

    @JsonProperty("is_year")
    @ApiModelProperty(value = "1开启日期显示")
    private Integer IS_YEAR;

    @JsonProperty("is_del")
    @ApiModelProperty(value = "是否已删除 1是 0否 先进入回收站")
    private Integer IS_DEL;

    @JsonProperty("is_member")
    @ApiModelProperty(value = "是否会员栏目")
    private Integer IS_MEMBER;

    @ApiModelProperty(value = "自定义扩展输入框")
    private String JSON;

    @ApiModelProperty(value = "子菜单")
    @TableField(exist = false)
    private List<Category> children = new ArrayList<>();


}
