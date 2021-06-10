package com.xxx.server.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA
 * User: WalWarS
 * Date: 2021/6/8 0008
 * Time: 11:17
 * Description: 文件上传POJO
 */

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UploadFile对象", description="文件上传")
public class UploadFile  implements Serializable {
}
