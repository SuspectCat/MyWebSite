package com.commons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ResponseResult {
    private Integer code;
    private String msg;
    private Object data;

    public static ResponseResult OK() {
        return new ResponseResult(200, "success", null);
    }

    public static ResponseResult OKData(Object data) {
        return new ResponseResult(200, "success", data);
    }

    public static ResponseResult OKMessages(String messages, Object data) {
        return new ResponseResult(200, messages, data);
    }

    public static ResponseResult error(String message) {
        return new ResponseResult(300, message, null);
    }
}
