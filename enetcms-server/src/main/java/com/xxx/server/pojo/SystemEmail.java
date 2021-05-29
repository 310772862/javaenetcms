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
@TableName("ENETCMS_SYSTEM_EMAIL")
@ApiModel(value="SystemEmail对象", description="")
public class SystemEmail implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "邮件SMTP服务器")
    private String MAIL_SERVER;

    private String MAIL_PORT;

    @ApiModelProperty(value = "启用SMTP认证")
    private String MAIL_SMTPAUTH;

    @ApiModelProperty(value = "发件人姓名")
    private String MAIL_FROMNAME;

    @ApiModelProperty(value = "发件人地址")
    private String MAIL_FROM;

    @ApiModelProperty(value = "邮件帐号")
    private String MAIL_USER;

    @ApiModelProperty(value = "邮件密码")
    private String MAIL_PASSWORD;

    @ApiModelProperty(value = "邮件编码")
    private String MAIL_CHARSET;

    @ApiModelProperty(value = "是否HTML格式邮件")
    private String MAIL_ISHTML;

    @ApiModelProperty(value = "1表示删除")
    private Integer IS_DEL;


}
