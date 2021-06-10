package com.xxx.server.controller;

import com.xxx.server.pojo.RespBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MultipartException;

/**
 * Created with IntelliJ IDEA
 * User: WalWarS
 * Date: 2021/6/9 0009
 * Time: 18:18
 * Description: 全局异常类
 */
@RestControllerAdvice(annotations = {Controller.class, RestController.class})
public class GlobalExceptionHander {

    @ExceptionHandler(MultipartException.class)
    public RespBean uploadExcepttion(MultipartException e){
        return RespBean.error("上传失败"+e.getMessage());
    }
}
