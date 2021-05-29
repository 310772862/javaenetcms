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
@TableName("ENETCMS_RECRUITMENT_MESSAGE")
@ApiModel(value="RecruitmentMessage对象", description="")
public class RecruitmentMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private Integer CONTENT_ID;

    private Integer USER_ID;

    private String NAME;

    @ApiModelProperty(value = "性别")
    private Integer SEX;

    private String TEL;

    private String EMAIL;

    private String RESUME;

    @ApiModelProperty(value = "描述")
    private String CONTENT;

    private Integer CREATE_TIME;

    private String IP;

    private Integer ISVIEW;

    @ApiModelProperty(value = "状态")
    private Integer STATUS;

    @ApiModelProperty(value = "是否删除")
    private Integer IS_DEL;


}
