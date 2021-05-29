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
@TableName("ENETCMS_SYSTEM_SETTING")
@ApiModel(value="SystemSetting对象", description="")
public class SystemSetting implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "1一般模式 2动态模式 3自定义模式")
    private Integer URL_MODEL;

    @ApiModelProperty(value = "联系电话")
    private String TEL;

    @ApiModelProperty(value = "电子邮箱")
    private String EMAIL;

    @ApiModelProperty(value = "1默认开启")
    private Integer STATISTICS;

    @ApiModelProperty(value = "网站状态")
    private Integer STATUS;

    @ApiModelProperty(value = "1表示放进回收站")
    private Integer IS_DEL;


}
