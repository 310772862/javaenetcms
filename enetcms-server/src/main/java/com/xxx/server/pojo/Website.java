package com.xxx.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@TableName("ENETCMS_WEBSITE")
@ApiModel(value="Website对象", description="")
public class Website implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private String NAME;

    @ApiModelProperty(value = "语言")
    private String LANGUAGE;

    @ApiModelProperty(value = "SEO标题")
    private String TITLE;

    @ApiModelProperty(value = "SEO关键字")
    private String KEYWORDS;

    @ApiModelProperty(value = "SEO描述")
    private String DESCRIPTION;

    private String TEL;

    private String EMAIL;

    private String FAX;

    private String ADDRESS;

    @ApiModelProperty(value = "备案")
    private String MIIBEIAN;

    @ApiModelProperty(value = "权")
    private String COPY;

    @ApiModelProperty(value = "第三方代码")
    private String CODE;

    @JsonProperty("is_default")
    @ApiModelProperty(value = "是否默认")
    private Integer IS_DEFAULT;

    @JsonProperty("create_time")
    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    @JsonProperty("sort_id")
    @ApiModelProperty(value = "排序")
    private Integer SORT_ID;

    @ApiModelProperty(value = "状态")
    private Integer STATUS;

    @JsonProperty("is_del")
    @ApiModelProperty(value = "是否删除")
    private Integer IS_DEL;
}
