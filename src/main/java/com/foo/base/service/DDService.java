package com.foo.base.service;

import java.util.List;

public interface DDService<T, ID> {

    int save(T t);

    int delete(List<ID> ids);

    int update(List<T> list);

    int batchImport(List<T> list);
}
