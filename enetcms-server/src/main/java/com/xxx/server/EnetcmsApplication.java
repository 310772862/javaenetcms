package com.xxx.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xxx.server.mapper")
public class EnetcmsApplication {
    public static void main(String[] args){
        SpringApplication.run(EnetcmsApplication.class,args);
    }
}
