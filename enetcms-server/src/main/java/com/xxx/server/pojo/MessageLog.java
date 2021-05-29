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
@TableName("ENETCMS_MESSAGE_LOG")
@ApiModel(value="MessageLog对象", description="")
public class MessageLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "企业ID")
    private Integer COMPANY_ID;

    @ApiModelProperty(value = "用户ID")
    private Integer USER_ID;

    @ApiModelProperty(value = "1代表发给企业 2代表发给用户")
    private Integer FOR_TYPE;

    @ApiModelProperty(value = "模块名称")
    private String MODEL_NAME;

    @ApiModelProperty(value = "对像ID")
    private Integer FOR_ID;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    @ApiModelProperty(value = "状态")
    private Integer STATUS;

    @ApiModelProperty(value = "是否删除")
    private Integer IS_DEL;

    @ApiModelProperty(value = "1代表已查看")
    private Integer IS_VIEW;


}
