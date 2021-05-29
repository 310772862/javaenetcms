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
@TableName("ENETCMS_ANNEX")
@ApiModel(value="Annex对象", description="")
public class Annex implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "文件名")
    private String NAME;

    @ApiModelProperty(value = "文件路径")
    private String URL;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    @ApiModelProperty(value = "文件大小")
    private Double FILE_SIZE;

    @ApiModelProperty(value = "类型 zip jpg等")
    private String TYPE;

    @ApiModelProperty(value = "后缀")
    private String EXT;

    @ApiModelProperty(value = "1后台，2前台")
    private Integer FROM;

    @ApiModelProperty(value = "1为已删除")
    private Integer IS_DEL;


}
