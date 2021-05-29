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
@TableName("ENETCMS_TAGS")
@ApiModel(value="Tags对象", description="")
public class Tags implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private String TYPE;

    @ApiModelProperty(value = "分类名称")
    private String NAME;

    @ApiModelProperty(value = "排序，越大越靠前")
    private Integer SORT_ID;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    @ApiModelProperty(value = "1正常 2关闭")
    private Integer STATUS;

    @ApiModelProperty(value = "是否已删除 1是 0否 先进入回收站")
    private Integer IS_DEL;


}
