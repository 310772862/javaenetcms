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
@TableName("ENETCMS_LOGIN_LOG")
@ApiModel(value="LoginLog对象", description="")
public class LoginLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "1成功登录 2密码错误 3帐号不存在 4成功退出")
    private Integer TYPE;

    @ApiModelProperty(value = "操作IP")
    private String IP;

    @ApiModelProperty(value = "提交的用户名")
    private String USERNAME;

    private Integer ADMIN_ID;

    @ApiModelProperty(value = "1 成功 2代表失败")
    private Integer SUCCESS_STATUS;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    private Integer STATUS;

    private Integer IS_DEL;


}
