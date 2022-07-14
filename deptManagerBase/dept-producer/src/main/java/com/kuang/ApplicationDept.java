package com.kuang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

import org.springframework.context.annotation.Bean;

/**
 * @Description 启动项
 * @ClassName ApplicationDept
 * @Author 康世行
 * @Date 16:41 2022/5/21
 * @Version 1.0
 **/
@SpringBootApplication

public class ApplicationDept {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationDept.class,args);
    }
}
