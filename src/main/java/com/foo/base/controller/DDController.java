package com.foo.base.controller;

import java.util.List;

public interface DDController<T, ID, TRequest, TResponse> {

	abstract TResponse doSave(T t);

	abstract TResponse doDelete(List<ID> ids);

	abstract TResponse doUpdate(List<T> list);

	abstract TResponse doList(TRequest request);

	abstract TResponse doPage(TRequest request);

}
