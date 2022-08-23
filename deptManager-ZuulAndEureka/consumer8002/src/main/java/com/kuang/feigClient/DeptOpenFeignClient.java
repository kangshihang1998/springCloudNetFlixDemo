package com.kuang.feigClient;

import com.kuang.utils.FrontResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description （部门管理）生产者客户接口
 * @ClassName DeptClient
 * @Author 康世行
 * @Date 20:41 2022/8/22
 * @Version 1.0
 **/

@FeignClient(value="DEPT-PROVIDER",path = "/dept/")
public interface DeptOpenFeignClient {
    /**
    * @author 康世行
    * @description: 根据id查询部门信息
    * @date  2022/8/22 20:46
    * @param deptno
    * @return com.kuang.utils.FrontResult
    * @Version1.0
    **/
    @GetMapping("queryDept/{id}")
    FrontResult queryDept(@PathVariable("id") String deptno);
}
