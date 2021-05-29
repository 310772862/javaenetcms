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
 * 简历投递表
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ENETCMS_DELIVERY")
@ApiModel(value="Delivery对象", description="简历投递表")
public class Delivery implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private Integer COMPANY_ID;

    private Integer USER_ID;

    private Integer JOBS_ID;

    private Integer CREATE_TIME;

    @ApiModelProperty(value = "状态")
    private Integer STATUS;

    @ApiModelProperty(value = "是否删除")
    private Integer IS_DEL;

    @ApiModelProperty(value = "1已查看")
    private Integer IS_VIEW;


}
