package com.kuang.consumer;


import com.kuang.utils.FrontResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @ClassName DeptConsumer
 * @Author 康世行
 * @Date 17:10 2022/5/22
 * @Version 1.0
 **/
@RestController
@RequestMapping("/deptConsumer")
public class DeptConsumer {

    @Autowired
    private RestTemplate restTemplate;

    //通过 服务名获取对应地址
    private static final String REST_URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";

    @GetMapping("/addDeptConsumer/{deptName}")
    public FrontResult addDeptConsumer( @PathVariable("deptName") String deptName){
        FrontResult forObject = restTemplate.getForObject("http://localhost:8001/dept/addDept/" + deptName, FrontResult.class);
       return  forObject;
    }

    @GetMapping("/queryDeptConsumer/{deptno}")
    public FrontResult queryDeptConsumer( @PathVariable("deptno") String deptno){
         FrontResult forObject = restTemplate.getForObject("http://localhost:8001/dept/queryDept/" + deptno, FrontResult.class);
        return forObject;
    }
}
