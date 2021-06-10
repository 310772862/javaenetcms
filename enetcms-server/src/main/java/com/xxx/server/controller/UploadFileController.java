package com.xxx.server.controller;

import com.xxx.server.pojo.RespBean;
import com.xxx.server.service.IUploadFileService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA
 * User: WalWarS
 * Date: 2021/6/8 0008
 * Time: 11:15
 * Description: 文件上传类
 */
@RestController
@RequestMapping("/upload_file")
public class UploadFileController {

    @Autowired
    IUploadFileService uploadFileService;

    @ApiOperation(value = "单文件上传")
    @PostMapping("upload")
    public RespBean upload(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest request){
        return uploadFileService.upload(multipartFile, request);
    }

    @ApiOperation(value = "多文件上传")
    @PostMapping("uploads")
    public RespBean uploads(HttpServletRequest request) {
        return uploadFileService.uploads(request);
    }


}
