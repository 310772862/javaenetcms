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
 * 操作日志
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ENETCMS_SYSTEM_LOG")
@ApiModel(value="SystemLog对象", description="操作日志")
public class SystemLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "操作名称")
    private String NAME;

    private String MODEL;

    @ApiModelProperty(value = "操作地址")
    private String URL;

    @ApiModelProperty(value = "操作用户ID")
    private Integer USER_ID;

    @ApiModelProperty(value = "操作参数")
    private String PARAMETER;

    private String DATA;

    @ApiModelProperty(value = "操作时间")
    private Integer CREATE_TIME;

    @ApiModelProperty(value = "操作IP")
    private String IP;

    @ApiModelProperty(value = "删除")
    private Integer IS_DEL;

    @ApiModelProperty(value = "1正常")
    private Integer STATUS;


}
