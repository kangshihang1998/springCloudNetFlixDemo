package com.kuang.utils;

import lombok.Data;

/**
 * @Description 前端返回值封装
 * @ClassName FrontResult
 * @Author 康世行
 * @Date 15:15 2022/5/22
 * @Version 1.0
 **/

@Data
public class FrontResult<T> {

  private String code;
  private String msg;
  private T data;

    public FrontResult() {
    }


    protected static <T> FrontResult<T> build(T data){
        FrontResult<T> result=new FrontResult<>();
        if(data!=null){
            result.setData(data);
        }
        return  result;
    }

    /**
    * @author 康世行
    * @description: 构建有返回值的结果
    * @date  2022/5/22 15:51
    * @param body
     * @param code
     * @param msg
    * @return com.kuang.utils.FrontResult<T>
    * @Version1.0
    **/
    public static <T> FrontResult<T> build(T body,String code, String msg){
        FrontResult<T> result = build(body);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
    /**
    * @author 康世行
    * @description:构建没有返回值的结果
    * @date  2022/5/22 15:51
    * @param code
     * @param msg
    * @return com.kuang.utils.FrontResult<T>
    * @Version1.0
    **/

    public static <T> FrontResult<T> build(String code, String msg){
        FrontResult<T> result = build(null);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
