package com.kuang.consumer;

import com.kuang.feigClient.DeptOpenFeignClient;
import com.kuang.utils.FrontResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    @Autowired
    private DeptOpenFeignClient deptOpenFeign;

    //通过 服务名获取对应地址
    private static final String REST_URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";

    @GetMapping("/addDeptConsumer/{deptName}")
    public FrontResult addDeptConsumer( @PathVariable("deptName") String deptName){
        //FrontResult forObject = restTemplate.getForObject("http://localhost:8001/dept/addDept/" + deptName, FrontResult.class);
        return null;
    }

    @GetMapping("/queryDeptConsumer/{deptno}")
    public FrontResult queryDeptConsumer( @PathVariable("deptno") String deptno){
         //使用注册中心 的 restTemplate 调用
         //FrontResult forObject = restTemplate.getForObject(REST_URL_PREFIX + "/dept/queryDept/" + deptno, FrontResult.class);
         //不使用注册中心的restTemplate调用
        // FrontResult forObject = restTemplate.getForObject("http://localhost:8001/dept/queryDept/" + deptno, FrontResult.class);
        FrontResult frontResult = deptOpenFeign.queryDept(deptno);
        return frontResult;
    }
}
