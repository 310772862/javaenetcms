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
@TableName("ENETCMS_SYSTEM_AUDIT")
@ApiModel(value="SystemAudit对象", description="")
public class SystemAudit implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "1 开启评论审核")
    private Integer COMMENT_AUDIT;

    @ApiModelProperty(value = "发布审核")
    private Integer CONTENT_AUDIT;

    @ApiModelProperty(value = "网站状态")
    private Integer STATUS;

    @ApiModelProperty(value = "1表示放进回收站")
    private Integer IS_DEL;


}
