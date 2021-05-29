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
@TableName("ENETCMS_AD")
@ApiModel(value="Ad对象", description="")
public class Ad implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "模块ID")
    private Integer MODEL_ID;

    @ApiModelProperty(value = "名称")
    private String NAME;

    @ApiModelProperty(value = "图片")
    private String IMAGE;

    private String ICON;

    private String DESCRIPTION;

    @ApiModelProperty(value = "跳转URL")
    private String URL;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    @ApiModelProperty(value = "排序号，越大越靠前")
    private Integer SORT_ID;

    @ApiModelProperty(value = "状态 1正常 2关闭")
    private Integer STATUS;

    @ApiModelProperty(value = "所属语言")
    private Integer WEBSITE_ID;

    @ApiModelProperty(value = "放入回收站")
    private Integer IS_DEL;


}
