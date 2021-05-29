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
@TableName("ENETCMS_ACCESS_PV")
@ApiModel(value="AccessPv对象", description="")
public class AccessPv implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "浏览者IP地址")
    private Integer IP_ID;

    @ApiModelProperty(value = "浏览器")
    private String BROWSER;

    @ApiModelProperty(value = "操作系统")
    private String OPERATING_SYSTEM;

    private String LANG;

    @ApiModelProperty(value = "访问地址")
    private String URL;

    @ApiModelProperty(value = "访问数量")
    private Integer VIEW;

    private String DATETIME;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;


}
