package com.commons;

import lombok.Data;

@Data
public class LayuiDataResult {
    private Integer code;
    private String msg;
    private Integer count;
    private Object data;
}
