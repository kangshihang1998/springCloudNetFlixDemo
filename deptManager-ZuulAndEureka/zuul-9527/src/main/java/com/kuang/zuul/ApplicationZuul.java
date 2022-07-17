package com.kuang.zuul;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 网关启动类
 * @ClassName ApplicationZuul
 * @Author 康世行
 * @Date 20:52 2022/7/17
 * @Version 1.0
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableSwagger2Doc
public class ApplicationZuul {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationZuul.class,args);
    }
    @Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider {
        @Override
        public List<SwaggerResource> get() {
            List resources = new ArrayList<>();
            resources.add(swaggerResource("mydeptProvider", "/mydeptProvider/v2/api-docs", "2.0"));
            resources.add(swaggerResource("mydeptConsumer", "/mydeptConsumer/v2/api-docs", "2.0"));
            return resources;
        }
        //定义swaggerResource的构造函数
        private SwaggerResource swaggerResource(String name, String location, String version) {
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }
}
