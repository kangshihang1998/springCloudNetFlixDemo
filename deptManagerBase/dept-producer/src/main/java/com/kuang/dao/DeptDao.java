package com.kuang.dao;

import com.kuang.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @ClassName DeptDao
 * @Author 康世行
 * @Date 16:36 2022/5/21
 * @Version 1.0
 **/
@Mapper
@Repository
public interface DeptDao {
    /**
    * @author 康世行
    * @description: 添加用户信息
    * @date  2022/5/21 16:37
    * @param dept
    * @return int
    * @Version1.0
    **/
    int addDept(Dept dept);

    /**
    * @author 康世行
    * @description: 根据ID查询用户信息
    * @date  2022/5/21 16:51
    * @param deptno
    * @return com.kuang.pojo.Dept
    * @Version1.0
    **/
    Dept queryById (@Param("deptno") Integer deptno);
}
