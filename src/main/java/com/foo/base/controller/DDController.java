package com.foo.base.controller;

import java.util.List;

/**
 * 模型驱动控制器
 *
 * @param <T>
 * @param <ID>
 * @param <TRequest>
 * @param <TResponse>
 */
public interface DDController<T, ID, TRequest, TResponse> {

    TResponse doSave(T t);

    TResponse doDelete(List<ID> ids);

    TResponse doUpdate(List<T> list);

    TResponse doList(TRequest request);

    TResponse doPage(TRequest request);

}
