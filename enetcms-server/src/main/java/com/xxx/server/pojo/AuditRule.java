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
@TableName("ENETCMS_AUDIT_RULE")
@ApiModel(value="AuditRule对象", description="")
public class AuditRule implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private String NAME;

    private String PROCESS;

    private Integer STATUS;

    private Integer CREATE_TIME;

    @ApiModelProperty(value = "1表示已删除")
    private Integer IS_DEL;


}
