package com.kuang.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.kuang.dao.DeptDao;
import com.kuang.model.DeptModel;
import com.kuang.pojo.Dept;
import com.kuang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description TODO
 * @ClassName Deptimpl
 * @Author 康世行
 * @Date 15:59 2022/5/22
 * @Version 1.0
 **/
@Service
public class DeptImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addDept( String dname) {
        //校验参数是否为空
        if(StringUtils.isEmpty(dname)){
            return 0;
        }

        //添加部门信息
        Dept dept=new Dept(dname);
        int result = deptDao.addDept(dept);

        return result;
    }

    @Override
    public DeptModel queryDeptById(Integer deptno) {
        //校验参数是否为空
        if (StringUtils.isEmpty(String.valueOf(deptno))){
            return null;
        }

        //查询用户信息
        Dept dept = deptDao.queryById(deptno);
        if (dept==null){
            return null;
        }
        //进行类型转换
        DeptModel result=new DeptModel();
        result.setDname(dept.getDname());
        result.setDb_source(dept.getDb_source());
        result.setDeptno(dept.getDeptno());

        return result;
    }
}
