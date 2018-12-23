package com.project.demo.common;

import java.io.Serializable;

/**
 * @Author: DJ
 * @Date: 2018/12/23 13:11
 */
public class Resp<T> implements Serializable {
    private int status;
    private String message;
    private T data;

    private Resp(int status){
        this.status=status;
    }
    private Resp(int status, String message) {
        this.status = status;
        this.message = message;
    }

    private Resp(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    private Resp(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess(){
        return this.status== Constants.SUCCESS.getCode();
    }

    /**
     * 成功返回
     * @param <T>
     * @return successCode
     */
    public static <T> Resp<T> createBySuccess(){
        return new Resp<>(Constants.SUCCESS.getCode());
    }
    public static <T> Resp<T> createBySucess(String message){
        return new Resp<>(Constants.SUCCESS.getCode(),message);
    }
    public static <T> Resp<T> createBySuccess(T data){
        return new Resp<>(Constants.SUCCESS.getCode(),data);
    }
    public static <T> Resp<T> createBySuccess(String message,T data){
        return new Resp<>(Constants.SUCCESS.getCode(),message,data);
    }

    /**
     * 失败返回
     * @param <T>
     * @return errorCode
     */
    public static <T> Resp<T> createByError(){
        return new Resp<>(Constants.ERROR.getCode());
    }
    public static <T> Resp<T> createByError(String errorMessage){
        return new Resp<>(Constants.ERROR.getCode(),errorMessage);
    }
    public static <T> Resp<T> createByError(T data){
        return new Resp<>(Constants.ERROR.getCode(),data);
    }
}
