package com.xxx.server.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created with IntelliJ IDEA
 * User: WalWarS
 * Date: 2021/5/28 0028
 * Time: 16:22
 * Description: 验证码配置类
 */
@Configuration
public class CaptchaConfig {

    @Bean
    public DefaultKaptcha defaultKaptcha(){
        // 验证码生成器
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        // 配置
        Properties properties = new Properties();
        // 是否加边框
        properties.setProperty("kaptcha.border", "no");
        // 设置边框颜色
        properties.setProperty("kaptcha.border.color", "105,179,90");
        // 边框粗细度，默认为1
        // properties.setProperty("Kaptcha.border.thickness", "1");
        // 验证码
        properties.setProperty("kaptcha.session.key", "code");
        // 验证码文本字符颜色 默认为黑色
        properties.setProperty("kaptcha.textproducer.font.color", "54,0,120");
        // 背景颜色渐变，开始颜色 light grey
        properties.setProperty("kaptcha.background.clear.from", "white");
        // 干扰颜色
        // properties.setProperty("kaptcha.noise.color", "white");
        // 图片样式
        properties.setProperty("kaptcha.noise.impl", "com.google.code.kaptcha.impl.NoNoise");
        // 设置字体样式
        properties.setProperty("kaptcha.textproducer.font.names", "微软雅黑");
        // 字体大小，默认40
        properties.setProperty("kaptcha.textproducer.font.size", "30");
        // 验证码文本字符内容范围 默主为abcde2345678gfynmnpwx
        // properties.setProperty("kaptcha.textproducer.char.string", "");
        // 字符长度，默认为5
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        // 字符间距 默认为2
        properties.setProperty("kaptcha.textproduer.char.space", "6");
        // 验证码图片宽度 默认为200
        properties.setProperty("kaptcha.image.width", "100");
        // 验证码图片高度 默认为80
        properties.setProperty("kaptcha.image.height", "40");
        Config config = new Config(properties);
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}
