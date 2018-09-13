package com.foo.base.controller;

import com.foo.base.request.ARequest;
import com.foo.base.response.AResponse;
import com.foo.base.service.CService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 某种具体实现控制器
 *
 * @param <TRequest>
 */
public abstract class CController<T, TRequest extends ARequest, TResponse extends AResponse<T>>
        implements DDController<T, TRequest, TResponse>, AController<TRequest> {


    CService service;

    @Autowired
    public void setService(CService service) {
        this.service = service;
    }

    @Override
    public TResponse doStatistics(TRequest request) {
        return null;
    }

    @Override
    public TResponse doBatchImport(TRequest request) {
        return null;
    }

    @Override
    public void doBatchExport(TRequest request, HttpServletRequest httpServletRequest) {

    }

    @Override
    public TResponse doSave(TRequest request) {
        int affectCount = service.save(request);
        return null;
    }

    @Override
    public TResponse doDelete(TRequest request) {
        return null;
    }

    @Override
    public AResponse doUpdate(TRequest request) {
        return null;
    }

    @Override
    public AResponse doList(TRequest request) {
        List<T> list = service.list(request);
        return AResponse.builder().content(list).build();
    }

    @Override
    public AResponse doPage(TRequest request) {
        Page<T> page = service.page(request);
        return AResponse.builder().content(page).build();
    }
}
