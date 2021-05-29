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
@TableName("ENETCMS_USER")
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "注册邮箱")
    private String EMAIL;

    @ApiModelProperty(value = "用户名")
    private String USERNAME;

    @ApiModelProperty(value = "密码")
    private String PASSWORD;

    @ApiModelProperty(value = "求职编号")
    private String JOB_NUMBER;

    @ApiModelProperty(value = "姓名")
    private String NAME;

    @ApiModelProperty(value = "身份证件号码")
    private String ID_NUMBER;

    @ApiModelProperty(value = "身份证正面照")
    private String ID_NUMBER_POSITIVE_PIC;

    @ApiModelProperty(value = "身份证反面照")
    private String ID_NUMBER_NEGATIVE_PIC;

    @ApiModelProperty(value = "性别 1男 2女")
    private Integer GENDER;

    @ApiModelProperty(value = "生日")
    private Integer BIRTHDAY;

    @ApiModelProperty(value = "身高")
    private String HEIGHT;

    @ApiModelProperty(value = "工作经验")
    private String WORK_EXPERIENCE;

    @ApiModelProperty(value = "工作开始时间")
    private Integer WORK_START_TIME;

    @ApiModelProperty(value = "现居住地")
    private String ADDRESS;

    @ApiModelProperty(value = "毕业学校")
    private String GRADUATED_SCHOOL;

    @ApiModelProperty(value = "1未婚 2已婚")
    private Integer MARITAL_STATUS;

    @ApiModelProperty(value = "学历")
    private Integer EDUCATION;

    @ApiModelProperty(value = "主修专业")
    private Integer MAJOR;

    @ApiModelProperty(value = "电脑水平")
    private Integer COMPUTER_LEVEL;

    @ApiModelProperty(value = "英语水平")
    private Integer ENGLISH_LEVEL;

    @ApiModelProperty(value = "意向工作岗位")
    private String AIMS_JOB_POSITION;

    @ApiModelProperty(value = "目标新资要求")
    private Integer AIMS_SALARY_REQUIREMENTS;

    @ApiModelProperty(value = "目标工作地点")
    private Integer AIMS_WORK_PLACE;

    @ApiModelProperty(value = "目标职业类型")
    private Integer AIMS_JOBS_TYPE;

    @ApiModelProperty(value = "求职状态")
    private Integer AIMS_JOB_STATUS;

    @ApiModelProperty(value = "补充说明")
    private String AIMS_DESCRIPTION;

    @ApiModelProperty(value = "工作经历")
    private String ACTUAL_WORK_EXPERIENCE;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    private Integer UPDATE_TIME;

    private Integer SORT_ID;

    @ApiModelProperty(value = "1正常 2关闭")
    private Integer STATUS;

    @ApiModelProperty(value = "是否删除")
    private Integer IS_DEL;

    private Integer VIEW;


}
