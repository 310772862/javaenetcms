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
@TableName("ENETCMS_SYSTEM_SAFETY")
@ApiModel(value="SystemSafety对象", description="")
public class SystemSafety implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "1开启日志记录 2关闭日志记录")
    private Integer IS_LOG;

    @ApiModelProperty(value = "默认关闭记录，因为是文件形式。")
    private Integer ERROR_LOG;

    @ApiModelProperty(value = "IP黑名单，禁止访问网站")
    private String IP_BLACKLIST;

    private String IP_WHITELIST;

    @ApiModelProperty(value = "1开启IP限制")
    private Integer IP_OPEN;

    @ApiModelProperty(value = "敏感字过滤表，含有非法信息都不能通过或转为星号")
    private String SENSITIVE_WORD;

    @ApiModelProperty(value = "1表示开启")
    private Integer WORD_OPEN;

    @ApiModelProperty(value = "状态")
    private Integer STATUS;

    @ApiModelProperty(value = "1表示放进回收站")
    private Integer IS_DEL;


}
