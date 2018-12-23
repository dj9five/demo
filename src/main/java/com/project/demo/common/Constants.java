package com.project.demo.common;

/**
 * @Author: DJ
 * @Date: 2018/12/23 13:11
 */
public enum Constants {
    //响应成功
    SUCCESS(0,"SUCCESS"),
    //响应失败
    ERROR(1,"ERROR");

    private final int code;
    private final String desc;


    Constants(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
