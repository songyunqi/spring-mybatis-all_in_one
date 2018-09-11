package com.foo.base.service;

import com.foo.base.request.ARequest;

import java.util.List;

public interface DDService<T, ID, TRequest extends ARequest> {

    int save(T t);

    int delete(List<ID> ids);

    int update(List<T> list);

    List<T> list(TRequest tRequest);
}
