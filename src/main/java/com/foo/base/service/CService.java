package com.foo.base.service;

import java.util.List;

import com.foo.base.request.ARequest;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

public abstract class CService<T, ID, TRequest extends ARequest> implements DDService<T, ID> {

	
	public abstract List<T> list(TRequest tRequest);
	
	public Page<T> page(TRequest request) {
		Page<T> page = PageHelper.startPage(request.getPageNum(), request.getPageSize());
		List<T> list = list(request);
		page.addAll(list);
		return page;
	}
}
