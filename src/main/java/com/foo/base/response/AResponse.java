package com.foo.base.response;

import lombok.Data;

@Data
public class AResponse<T> {

    private T content;
    private int status = 0;
    private String msg = "0";

}
