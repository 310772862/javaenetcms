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
@TableName("ENETCMS_JOBS")
@ApiModel(value="Jobs对象", description="")
public class Jobs implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "所属企业")
    private Integer COMPANY_ID;

    @ApiModelProperty(value = "职位名称")
    private String NAME;

    @ApiModelProperty(value = "职业类型")
    private Integer CATEGORY_ID;

    @ApiModelProperty(value = "学历")
    private Integer EDUCATION;

    @ApiModelProperty(value = "工作经验")
    private Integer WORK_EXPERIENCE;

    @ApiModelProperty(value = "薪资")
    private Integer EXPECTING_SALARY;

    @ApiModelProperty(value = "工作地点")
    private Integer WORK_PLACE;

    @ApiModelProperty(value = "联系人")
    private String CONTACT_NAME;

    @ApiModelProperty(value = "联系电话")
    private String CONTACT_PHONE;

    @ApiModelProperty(value = "职位介绍")
    private String CONTENT;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    @ApiModelProperty(value = "更新时间")
    private Integer UPDATE_TIME;

    @ApiModelProperty(value = "状态 1")
    private Integer STATUS;

    @ApiModelProperty(value = "0")
    private Integer SORT_ID;

    @ApiModelProperty(value = "是否删除")
    private Integer IS_DEL;

    private Integer VIEW;


}
