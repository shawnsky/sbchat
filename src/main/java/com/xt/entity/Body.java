package com.xt.entity;

/**
 * Created by admin on 2017/7/31.
 */
public class Body {

    private String code = "200"; //响应码

    private String msg; //消息

    private String status;//状态码

    private Object data;//数据


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
