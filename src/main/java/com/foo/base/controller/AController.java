package com.foo.base.controller;

import javax.servlet.http.HttpServletRequest;

/**
 * 抽象控制器
 * @param <T>
 * @param <TRequest>
 * @param <TResponse>
 */
public interface AController<T, TRequest, TResponse> {

    TResponse doStatis(TRequest request);

    TResponse doBatchImport(TRequest request);

    void doBatchExport(TRequest request, HttpServletRequest httpServletRequest);

}
