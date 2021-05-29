package com.xxx.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

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
@TableName("ENETCMS_SYSTEM_ADMIN")
@ApiModel(value="SystemAdmin对象", description="")
public class SystemAdmin implements Serializable, UserDetails {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    private String USERNAME;

    private String PASSWORD;

    private Integer GROUP_ID;

    private String ENCRYPT;

    private String NICKNAME;

    @ApiModelProperty(value = "性别：1 男  2 女")
    private Integer SEX;

    private String PHONE;

    private Integer CREATE_TIME;

    @ApiModelProperty(value = "1正常 2关闭")
    private Integer STATUS;

    @ApiModelProperty(value = "1代表已删除 进入回收站")
    private Integer IS_DEL;

    @ApiModelProperty(value = "识别登录信息，限制多并发登录")
    private String DIFFERENCE;

    private String TOKEN;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return PASSWORD;
    }

    @Override
    public String getUsername() {
        return USERNAME;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        if (IS_DEL == 1) {
            return false;
        } else {
            return true;
        }
    }
}
