package com.kuang.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description TODO
 * @ClassName DeptModel
 * @Author 康世行
 * @Date 15:54 2022/5/22
 * @Version 1.0
 **/
@Data
@Accessors(chain = true)
public class DeptModel implements Serializable {
    private Integer deptno;
    private String dname;
    private String db_source;
}
