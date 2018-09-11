package com.foo.base.service;

import com.foo.base.request.ARequest;

import java.util.List;

/**
 * 模型驱动DD服务接口
 *
 * @param <T>
 * @param <TRequest>
 */
public interface DDService<T, TRequest extends ARequest> {

    int save(TRequest request);

    int delete(TRequest request);

    int update(TRequest request);

    List<T> list(TRequest tRequest);
}
