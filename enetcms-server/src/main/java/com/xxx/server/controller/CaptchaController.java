package com.xxx.server.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA
 * User: WalWarS
 * Date: 2021/5/28 0028
 * Time: 16:43
 * Description: 验证码
 */
@RestController
public class CaptchaController {

    @Autowired
    private Producer producer;

    @ApiOperation(value = "验证码")
    @GetMapping(value = "/captcha", produces = "image/jpeg")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 定义response输出类型为image/jpeg类型
        response.setDateHeader("Expires", 0);
        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Control","no-store, no-cache, must-revalidate");
        // Set IE extender HTTP/1.1 no-cache headers (use addHeader).
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");
        // return a jpeg
        response.setContentType("image/jpeg");
        //----------------------- 生成验证码 begin -----------------------

        //生成文字，并缓存起来
        String code = producer.createText();
        //生成图片，响应到页面
        BufferedImage img = producer.createImage(code);
        request.getSession().setAttribute("captcha", code);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(img, "png", out);
        IOUtils.closeQuietly(out);

        //----------------------- 生成验证码 end -------------------------
    }
}
