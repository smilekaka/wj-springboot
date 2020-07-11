package com.frontbackend.learning.bean;

/**
 * @program: wj-springboot
 * @description: 结果返回类
 * @author: Jin Chun Liang
 * @create: 2020-07-10 14:32
 **/
public class Result {
    //响应码
    private int code;

    public Result(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}


