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
 * 类型信息表
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ENETCMS_TYPE_LIST")
@ApiModel(value="TypeList对象", description="类型信息表")
public class TypeList implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "父级栏目")
    private Integer PARENT_ID;

    private String NAME;

    @ApiModelProperty(value = "类别")
    private String TYPE;

    private Integer CREATE_TIME;

    @ApiModelProperty(value = "排序")
    private Integer SORT_ID;

    @ApiModelProperty(value = "是否删除")
    private Integer IS_DEL;

    @ApiModelProperty(value = "使用次数")
    private Integer VIEW;


}
