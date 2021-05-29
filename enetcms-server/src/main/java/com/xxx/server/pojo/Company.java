package com.xxx.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Clob;

/**
 * <p>
 * 公司表
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ENETCMS_COMPANY")
@ApiModel(value="Company对象", description="公司表")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @ApiModelProperty(value = "注册邮箱")
    private String EMAIL;

    @ApiModelProperty(value = "用户名")
    private String USERNAME;

    @ApiModelProperty(value = "密码")
    private String PASSWORD;

    @ApiModelProperty(value = "企业性质")
    private Integer NATURE_ID;

    @ApiModelProperty(value = "所属行业")
    private Integer INDUSTRY_ID;

    @ApiModelProperty(value = "地区ID")
    private Integer AREA_ID;

    private String LOGO;

    @ApiModelProperty(value = "单位名称")
    private String NAME;

    @ApiModelProperty(value = "社会信用代码")
    private String SOCIAL_CREDIT_CODE;

    @ApiModelProperty(value = "注册资金")
    private Integer REGISTERED_CAPITAL_ID;

    @ApiModelProperty(value = "法人代表")
    private String LEGAL_REPRESENTATIVE;

    @ApiModelProperty(value = "邮政编码")
    private String ZIP_CODE;

    @ApiModelProperty(value = "在岗总人数")
    private String EMPLOYEE_COUNT;

    @ApiModelProperty(value = "缺工人数")
    private String LACK_OF_WORKERS;

    @ApiModelProperty(value = "企业经营范围")
    private String BUSINESS_SCOPE;

    @ApiModelProperty(value = "通讯地址")
    private String ADDRESS;

    @ApiModelProperty(value = "招聘联系人")
    private String CONTACT_NAME;

    @ApiModelProperty(value = "身份证号")
    private String ID_NUMBER;

    @ApiModelProperty(value = "手机号码")
    private String CONTACT_EMAIL;

    @ApiModelProperty(value = "联系电话")
    private String CONTACT_PHONE;

    private String CONTACT_TEL;

    @ApiModelProperty(value = "传真")
    private String CONTACT_FAX;

    @ApiModelProperty(value = "《营业执照》副本复印件")
    private String BUSINESS_LICENSE;

    @ApiModelProperty(value = "招聘代表身份证复印件")
    private String IC_CARD_COPY;

    @ApiModelProperty(value = "乙方委托代表到场招聘的委托书")
    private String POWER_OF_ATTORNEY;

    @ApiModelProperty(value = "招聘简章")
    private String HIRING_POST;

    @ApiModelProperty(value = "公司简介")
    private String CONTENT;

    @ApiModelProperty(value = "是否同意协议")
    private Integer IS_AGREE;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    @ApiModelProperty(value = "更新时间")
    private Integer UPDATE_TIME;

    @ApiModelProperty(value = "1正常  2关闭 3审核中 4审核不通过")
    private Integer STATUS;

    @ApiModelProperty(value = "是否删除")
    private Integer IS_DEL;

    @ApiModelProperty(value = "排序")
    private Integer SORT_ID;

    private Integer VIEW;

    private String IP;


}
