package com.kuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @ClassName ApplicationDeptConsumer
 * @Author 康世行
 * @Date 16:52 2022/5/22
 * @Version 1.0
 **/
@SpringBootApplication
public class ApplicationDeptConsumer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationDeptConsumer.class,args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
