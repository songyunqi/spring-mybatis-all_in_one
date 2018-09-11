package com.foo.base.service;

import com.foo.base.request.ARequest;

import java.util.List;

/**
 * 模型驱动DD服务接口
 *
 * @param <T>
 * @param <ID>
 * @param <TRequest>
 */
public interface DDService<T, ID, TRequest extends ARequest> {

    int save(ARequest request);

    int delete(ARequest request);

    int update(ARequest request);

    List<T> list(TRequest tRequest);
}
