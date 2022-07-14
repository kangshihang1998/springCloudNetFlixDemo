package com.kuang.utils;

import lombok.Getter;

/**
 * @Description 前端返回值值枚举封装
 * @ClassName FrontResultEnum
 * @Author 康世行
 * @Date 15:08 2022/5/22
 * @Version 1.0
 **/
@Getter
public enum FrontResultEnum {
    SUCCESS("0000","请求成功!"),
    Failure("1111","请求失败！")
    ;

    private String code;
    private String msg;

    FrontResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
