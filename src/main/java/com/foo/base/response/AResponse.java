package com.foo.base.response;

import lombok.Data;

/**
 * 抽象返回
 * @param <T>
 */
@Data
public class AResponse<T> {

    private T content;
    private int status = 0;
    private String msg = "0";

}
