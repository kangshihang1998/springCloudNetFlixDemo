package com.kuang.controller;

import com.kuang.model.DeptModel;
import com.kuang.service.DeptService;
import com.kuang.utils.FrontResult;
import com.kuang.utils.FrontResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description TODO
 * @ClassName DeptController
 * @Author 康世行
 * @Date 16:13 2022/5/22
 * @Version 1.0
 **/
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/addDept/{deptName}")
    public FrontResult addDept( @PathVariable("deptName") String deptName){

        int result = deptService.addDept(deptName);
        if (result>0){
            return FrontResult.build(FrontResultEnum.SUCCESS.getCode(),FrontResultEnum.SUCCESS.getMsg());
        }

        return FrontResult.build(FrontResultEnum.Failure.getCode(),FrontResultEnum.Failure.getMsg());
    }

    @GetMapping("/queryDept/{deptno}")
    public FrontResult queryDept( @PathVariable("deptno") Integer deptno){
        DeptModel deptModel = deptService.queryDeptById(deptno);

        //通抛出运行时异常，触发熔断机制
        if (deptModel==null){
           throw new RuntimeException("deptno=>"+deptno+"用户信息不存在");
        }
        return FrontResult.build(deptModel,FrontResultEnum.SUCCESS.getCode(),FrontResultEnum.SUCCESS.getMsg());
    }

}
