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
@TableName("ENETCMS_RECRUITMENT")
@ApiModel(value="Recruitment对象", description="")
public class Recruitment implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private Integer CONTENT_ID;

    private String CATEGORY;

    @ApiModelProperty(value = "职位类别")
    private String JOB_TYPE;

    private String EDUCATION;

    private String SEX;

    private String AGE;

    private String NUM;

    private String WORKPLACE;

    @ApiModelProperty(value = "工作公司")
    private String COMPANY;

    private String EXPERIENCE;

    private String CONTENT;

    private String QUALIFICATIONS;

    private String WORKBENEFITS;

    private String TREATMENT;

    private Integer START_TIME;

    private Integer END_TIME;


}
