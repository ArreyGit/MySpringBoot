package com.arrey.springbootvuedemo.entity;

/**
 * @author sunzhirui
 * @date 2018年12月4日
 * @description 封装API统一响应结果
 */
public class RestResult {
    /** 状态码 */
    private int code ;
    /** 消息 */
    private String message;
    /** 数据 */
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
