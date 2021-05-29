package com.xxx.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Clob;

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
@TableName("ENETCMS_ARTICLE")
@ApiModel(value="Article对象", description="")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private Integer CONTENT_ID;

    @ApiModelProperty(value = "封面")
    private String IMAGE;

    @ApiModelProperty(value = "图片集")
    private String PIC;

    private String PIC_TITLE;

    @ApiModelProperty(value = "作者")
    private String AUTHOR;

    @ApiModelProperty(value = "描述")
    private String DESCRIPTION;

    @ApiModelProperty(value = "详情")
    private String CONTENT;


}
