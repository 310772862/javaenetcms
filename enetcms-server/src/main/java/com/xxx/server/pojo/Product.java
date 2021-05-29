package com.xxx.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("ENETCMS_PRODUCT")
@ApiModel(value="Product对象", description="")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private Integer CONTENT_ID;

    @ApiModelProperty(value = "产品封面")
    private String IMAGE;

    private String PIC;

    private String PIC_TITLE;

    @ApiModelProperty(value = "品牌")
    private String BRAND;

    @ApiModelProperty(value = "产品类型")
    private String PRO_TYPE;

    @ApiModelProperty(value = "产品代码")
    private String PRODUCT_CODE;

    @ApiModelProperty(value = "OEM")
    private String OEM_CODE;

    @ApiModelProperty(value = "芯片")
    private String CHIP;

    @ApiModelProperty(value = "颜色")
    private String COLOR;

    @ApiModelProperty(value = "页面产量")
    private String PAGE_YIELD;

    @ApiModelProperty(value = "适用机型")
    private String SUITABLE_FOR;

    @ApiModelProperty(value = "库存")
    private Integer STOCK;

    @ApiModelProperty(value = "价格")
    private BigDecimal PRICE;

    @ApiModelProperty(value = "描述")
    private String DESCRIPTION;

    @ApiModelProperty(value = "参数说明")
    private String PARAMETER;

    @ApiModelProperty(value = "工作原理")
    private String PRINCIPLE;

    @ApiModelProperty(value = "产品组成")
    private String COMPOSITION;

    @ApiModelProperty(value = "详细说明")
    private String CONTENT;

    @ApiModelProperty(value = "宣传视频")
    private String VIDEO_URL;


}
