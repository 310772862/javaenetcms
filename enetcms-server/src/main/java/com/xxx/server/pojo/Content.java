package com.xxx.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

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
@TableName("ENETCMS_CONTENT")
@ApiModel(value="Content对象", description="")
public class Content implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "分类ID")
    private Integer CATEGORY_ID;

    @ApiModelProperty(value = "自定义URL")
    private String DIR;

    @ApiModelProperty(value = "名称")
    private String NAME;

    @ApiModelProperty(value = "跳转地址")
    private String URL;

    @ApiModelProperty(value = "图标")
    private String ICON;

    @ApiModelProperty(value = "标签")
    private String TAGS;

    @ApiModelProperty(value = "meta标题")
    private String META_TITLE;

    @ApiModelProperty(value = "meta关键字")
    private String META_KEYWORDS;

    @ApiModelProperty(value = "meta描述")
    private String META_DESCRIPTION;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    @ApiModelProperty(value = "发布时间")
    private Integer RELEASE_TIME;

    @ApiModelProperty(value = "排序")
    private Integer SORT_ID;

    @ApiModelProperty(value = "审核 1通过 2不通过")
    private Integer AUDIT;

    @ApiModelProperty(value = "当前第几步")
    private Integer AUDIT_RULE_STEP;

    @ApiModelProperty(value = "当前审核管理员")
    private Integer AUDIT_RULE_ADMIN_ID;

    @ApiModelProperty(value = "发布人")
    private Integer ADMIN_ID;

    @ApiModelProperty(value = "状态 1正常 2关闭")
    private Integer STATUS;

    @ApiModelProperty(value = "是否新窗口打开")
    private Integer BLANK;

    @ApiModelProperty(value = "1推荐")
    private Integer IS_HOT;

    @ApiModelProperty(value = "置顶")
    private Integer IS_TOP;

    @ApiModelProperty(value = "1删除，放进回收站")
    private Integer IS_DEL;

    @ApiModelProperty(value = "2为草稿，1为非草稿")
    private Integer IS_DRAFT;

    @ApiModelProperty(value = "所属模型")
    private String MODEL;

    @ApiModelProperty(value = "浏览次数")
    private Integer VIEW;


}
