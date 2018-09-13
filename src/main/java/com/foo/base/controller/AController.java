package com.foo.base.controller;

import com.foo.base.request.ARequest;
import com.foo.base.response.AResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * 抽象控制器
 *
 * @param <TRequest>
 */
public interface AController<TRequest extends ARequest> {

    AResponse doStatistics(TRequest request);

    AResponse doBatchImport(TRequest request);

    void doBatchExport(TRequest request, HttpServletRequest httpServletRequest);

}
