package com.foo.base.response;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 抽象返回
 *
 * @param <T>
 */
@Data
@Builder
@NoArgsConstructor
public class AResponse<T> {

    private T content;
    private int status = 0;
    private String msg = "0";

}
