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
 * 邀请表
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ENETCMS_INVITE")
@ApiModel(value="Invite对象", description="邀请表")
public class Invite implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "公司ID")
    private Integer COMPANY_ID;

    private Integer USER_ID;

    private Integer JOBS_ID;

    private String CONTENT;

    private Integer CREATE_TIME;

    private Integer STATUS;

    private Integer IS_DEL;

    @ApiModelProperty(value = "是否已看")
    private Integer IS_VIEW;


}
