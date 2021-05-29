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
@TableName("ENETCMS_WEBSITE_MODEL")
@ApiModel(value="WebsiteModel对象", description="")
public class WebsiteModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "标记名称")
    private String NAME;

    private String TAG;

    private String CONTENT;

    @ApiModelProperty(value = "默认模板")
    private String CATEGORY_TEMPLATE;

    @ApiModelProperty(value = "列表模板")
    private String LIST_TEMPLATE;

    @ApiModelProperty(value = "展示模板")
    private String SHOW_TEMPLATE;

    private String DEFAULT_TEMPLATE;

    @ApiModelProperty(value = "状态")
    private Integer STATUS;

    private String ICON;

    @ApiModelProperty(value = "排序号")
    private Integer SORT_ID;

    private Integer CREATE_TIME;

    @ApiModelProperty(value = "1删除进入回收站")
    private String IS_DEL;


}
