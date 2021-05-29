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
@TableName("ENETCMS_DOWNLOAD")
@ApiModel(value="Download对象", description="")
public class Download implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private Integer CONTENT_ID;

    @ApiModelProperty(value = "封面")
    private String IMAGE;

    @ApiModelProperty(value = "下载文件")
    private String FILE_URL;

    @ApiModelProperty(value = "文件说明")
    private String CONTENT;

    @ApiModelProperty(value = "文件大小")
    private Double SIZE;


}
