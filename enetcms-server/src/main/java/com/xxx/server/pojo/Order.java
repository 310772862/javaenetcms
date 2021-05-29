package com.xxx.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

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
@TableName("ENETCMS_ORDER")
@ApiModel(value="Order对象", description="")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private String SN;

    @ApiModelProperty(value = "类型")
    private String TYPE;

    @ApiModelProperty(value = "对像ID")
    private Integer FOR_ID;

    @ApiModelProperty(value = "会员ID")
    private Integer MEMBER_ID;

    @ApiModelProperty(value = "名称")
    private String NAME;

    @ApiModelProperty(value = "手机号")
    private String PHONE;

    private String CONTENT;

    @ApiModelProperty(value = "数量")
    private Integer NUM;

    @ApiModelProperty(value = "价格")
    private BigDecimal PRICE;

    @ApiModelProperty(value = "开始时间")
    private Integer START_TIME;

    @ApiModelProperty(value = "结束时间")
    private Integer END_TIME;

    @ApiModelProperty(value = "创建时间")
    private Integer CREATE_TIME;

    @ApiModelProperty(value = "使用积分")
    private Integer INTEGRAL;

    @ApiModelProperty(value = "支付订单号")
    private String OUT_TRADE_NO;

    @ApiModelProperty(value = "支付时间")
    private Integer PAY_TIME;

    @ApiModelProperty(value = "1已下单 2已支付 3已确认 4已完成 5已评论 6已取消")
    private Integer STATUS;

    @ApiModelProperty(value = "1代表进入回收站")
    private Integer IS_DEL;


}
