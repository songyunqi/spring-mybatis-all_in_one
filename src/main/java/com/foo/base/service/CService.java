package com.foo.base.service;

import com.foo.base.request.ARequest;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import java.util.List;

public abstract class CService<T, ID, TRequest extends ARequest> implements DDService<T, ID, TRequest> {

    public Page<T> page(TRequest request) {
        Page<T> page = PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<T> list = list(request);
        page.addAll(list);
        return page;
    }
}
