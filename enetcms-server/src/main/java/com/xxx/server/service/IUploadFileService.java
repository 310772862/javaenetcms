package com.xxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxx.server.pojo.RespBean;
import com.xxx.server.pojo.UploadFile;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;


/**
 * Created with IntelliJ IDEA
 * User: WalWarS
 * Date: 2021/6/8 0008
 * Time: 11:16
 * Description: 文件上传服务类
 */

public interface IUploadFileService extends IService<UploadFile> {
    /**
     * 单文件上传
     * @param multipartFile
     * @param request
     * @return
     */
    RespBean upload(MultipartFile multipartFile, HttpServletRequest request);

    /**
     * 多文件上传
     * @param request
     * @return
     */
    RespBean uploads(HttpServletRequest request);
}
