package com.kuang.service;

import com.kuang.model.DeptModel;
import com.kuang.pojo.Dept;

/**
 * @Description TODO
 * @ClassName DeptDaoService
 * @Author 康世行
 * @Date 15:56 2022/5/22
 * @Version 1.0
 **/
public interface DeptService {

    /**
    * @author 康世行
    * @description: 添加用户信息
    * @date  2022/5/22 15:57
    * @param dname
    * @return int
    * @Version1.0
    **/
    int addDept(String dname);

    /**
    * @author 康世行
    * @description: 查询用户信息，根据ID
    * @date  2022/5/22 15:58
    * @param deptno
    * @return com.kuang.model.DeptModel
    * @Version1.0
    **/
    DeptModel queryDeptById(Integer deptno);
}
