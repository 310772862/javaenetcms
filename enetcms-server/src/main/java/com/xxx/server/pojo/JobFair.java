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
@TableName("ENETCMS_JOB_FAIR")
@ApiModel(value="JobFair对象", description="")
public class JobFair implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "展会分类")
    private Integer CATEGORY_ID;

    @ApiModelProperty(value = "展会名称")
    private String NAME;

    @ApiModelProperty(value = "举办开始时间")
    private Integer HOLD_TIME_START;

    @ApiModelProperty(value = "举办结束时间")
    private Integer HOLD_TIME_END;

    @ApiModelProperty(value = "报名开始时间")
    private Integer SIGNUP_TIME_START;

    @ApiModelProperty(value = "报名结束时间")
    private Integer SIGNUP_TIME_END;

    @ApiModelProperty(value = "地址")
    private String ADDRESS;

    @ApiModelProperty(value = "地址坐标")
    private String ADDRESS_MAP;

    @ApiModelProperty(value = "主办方")
    private String ORGANIZER;

    @ApiModelProperty(value = "位置前序")
    private String PROLOGUE;

    @ApiModelProperty(value = "展位数量")
    private Integer POSITION_NUM;

    @ApiModelProperty(value = "预留位置 多个用,分开")
    private String RESERVED;

    @ApiModelProperty(value = "活动介绍")
    private String CONTENT;

    @ApiModelProperty(value = "展位预订")
    private String BOOKING_CONTENT;

    @ApiModelProperty(value = "提供服务项目")
    private String SERVICE;

    @ApiModelProperty(value = "参加企业")
    private String PARTICIPATE_COMPANY;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    @ApiModelProperty(value = "更新时间")
    private Integer UPDATE_TIME;

    @ApiModelProperty(value = "状态")
    private Integer STATUS;

    @ApiModelProperty(value = "排序号")
    private Integer SORT_ID;

    @ApiModelProperty(value = "1已删除")
    private Integer IS_DEL;

    private Integer VIEW;


}
