package com.foo.base.request;

import lombok.Data;

/**
 * 抽象请求类
 */
@Data
public class ARequest {

    private Integer pageSize;
    private Integer pageNum;


}
