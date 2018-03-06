package com.foo.base.service;

import java.util.List;

public interface DDService<T, ID> {

	public abstract int save(T t);

	public abstract int delete(List<ID> ids);

	public abstract int update(List<T> list);

	public abstract int batchImport(List<T> list);
}
