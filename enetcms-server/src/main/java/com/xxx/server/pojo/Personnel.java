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
@TableName("ENETCMS_PERSONNEL")
@ApiModel(value="Personnel对象", description="")
public class Personnel implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private Integer CONTENT_ID;

    @ApiModelProperty(value = "封面")
    private String IMAGE;

    @ApiModelProperty(value = "性别 1男 2女 3保密")
    private Integer SEX;

    @ApiModelProperty(value = "年龄")
    private String AGE;

    @ApiModelProperty(value = "身高")
    private String HEIGHT;

    @ApiModelProperty(value = "手机号")
    private String PHONE;

    @ApiModelProperty(value = "电子邮箱")
    private String EMAIL;

    @ApiModelProperty(value = "职位")
    private String JOB;

    @ApiModelProperty(value = "公司/部门")
    private String COMPANY;

    @ApiModelProperty(value = "生日")
    private Integer BIRTHDAY;

    @ApiModelProperty(value = "户籍")
    private String CENSUS;

    @ApiModelProperty(value = "学历")
    private String EDUCATION;

    @ApiModelProperty(value = "描述")
    private String DESCRIPTION;

    @ApiModelProperty(value = "详情")
    private String CONTENT;


}
