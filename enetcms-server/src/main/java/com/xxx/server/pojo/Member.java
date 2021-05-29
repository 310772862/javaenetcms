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
@TableName("ENETCMS_MEMBER")
@ApiModel(value="Member对象", description="")
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private String USERNAME;

    private String PASSWORD;

    private String ENCRYPT;

    @ApiModelProperty(value = "微信OPENID")
    private String OPENID;

    @ApiModelProperty(value = "昵称")
    private String NICKNAME;

    private String SEX;

    @ApiModelProperty(value = "头像")
    private String HEADIMGURL;

    private String BGIMGURL;

    private String NAME;

    private String PHONE;

    private String EMAIL;

    @ApiModelProperty(value = "拥有积分")
    private Integer INTEGRAL;

    @ApiModelProperty(value = "1代表已实名认证")
    private Integer CERTIFICATION;

    private Integer CREATE_TIME;

    @ApiModelProperty(value = "1正常 2关闭")
    private Integer STATUS;

    @ApiModelProperty(value = "1代表已删除 进入回收站")
    private Integer IS_DEL;

    private Integer CSRQ;

    private String SG;

    private String GZJYN;

    private String XJZD;

    private String BYXY;

    private String HYQK;

    private String XL;

    private String ZX;

    private String DNSP;

    private String YYSP;

    private String QZYX;

    private String JYBJ;

    private String GZJL;

    private String XMJY;

    private String XXJY;

    private String XYJL;

    private String JNTC;

    private String RYZS;

    private String ZWPJ;


}
