package com.foo.base.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public interface AController<T, TRequest, TResponse> {

	abstract TResponse doStatis(TRequest request);

	abstract TResponse doBatchImport(List<T> list);

	abstract void doBatchExport(TRequest request, HttpServletRequest httpServletRequest);

}
