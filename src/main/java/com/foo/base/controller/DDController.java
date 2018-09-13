package com.foo.base.controller;

import com.foo.base.request.ARequest;
import com.foo.base.response.AResponse;

/**
 * 模型驱动控制器
 *
 * @param <TRequest>
 */
public interface DDController<T, TRequest extends ARequest, TResponse extends AResponse<T>> {

    AResponse doSave(TRequest request);

    AResponse doDelete(TRequest request);

    AResponse doUpdate(TRequest request);

    AResponse doList(TRequest request);

    AResponse doPage(TRequest request);

}
