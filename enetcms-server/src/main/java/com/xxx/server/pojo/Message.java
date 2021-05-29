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
@TableName("ENETCMS_MESSAGE")
@ApiModel(value="Message对象", description="")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private String COUNTRY;

    private String COMPANY;

    private String FRIST_NAME;

    @ApiModelProperty(value = "留言姓名")
    private String NAME;

    @ApiModelProperty(value = "性别")
    private Integer SEX;

    @ApiModelProperty(value = "1:留言建议 2:投诉信息")
    private String TYPE;

    @ApiModelProperty(value = "电话")
    private String TEL;

    @ApiModelProperty(value = "电子邮箱")
    private String EMAIL;

    private String TITLE;

    @ApiModelProperty(value = "留言内容")
    private String CONTENT;

    private String ADDRESS;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    private String IP;

    @ApiModelProperty(value = "是否查看")
    private Integer ISVIEW;

    private Integer IS_DEL;

    @ApiModelProperty(value = "1正常 2关闭")
    private Integer STATUS;


}
