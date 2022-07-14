package com.kuang.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description 用户实体
 * @ClassName Dept
 * @Author 康世行
 * @Date 15:15 2022/5/21
 * @Version 1.0
 **/
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Dept  implements Serializable {
   private Integer deptno;
   private String dname;
   private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
