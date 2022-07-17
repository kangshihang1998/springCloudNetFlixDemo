package com.kuang.eurea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description 注册中心启动类
 * @ClassName EurekaServer7002
 * @Author 康世行
 * @Date 17:24 2022/7/17
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002.class,args);
    }
}
