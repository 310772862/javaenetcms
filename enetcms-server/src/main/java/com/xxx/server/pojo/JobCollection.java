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
 * 职位收藏表
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ENETCMS_JOB_COLLECTION")
@ApiModel(value="JobCollection对象", description="职位收藏表")
public class JobCollection implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "用户ID")
    private Integer USER_ID;

    @ApiModelProperty(value = "职位ID")
    private Integer JOBS_ID;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    @ApiModelProperty(value = "状态")
    private Integer STATUS;

    @ApiModelProperty(value = "1代表已删除")
    private Integer IS_DEL;

    @ApiModelProperty(value = "操作IP地址")
    private String IP;


}
