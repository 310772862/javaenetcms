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
@TableName("ENETCMS_AREA")
@ApiModel(value="Area对象", description="")
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private Integer CONTENT_ID;

    @ApiModelProperty(value = "开放时间")
    private String OPENING_HOURS;

    @ApiModelProperty(value = "封面")
    private String IMAGE;

    private String HOME_IMAGE;

    @ApiModelProperty(value = "卡通形像")
    private String PIC;

    @ApiModelProperty(value = "游戏说明地图")
    private String BIG_PIC;

    @ApiModelProperty(value = "描述")
    private String DESCRIPTION;

    @ApiModelProperty(value = "详情")
    private String CONTENT;


}
