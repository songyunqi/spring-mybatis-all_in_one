package com.foo.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public abstract class CController<T, ID, TRequest, TResponse>
        implements DDController<T, ID, TRequest, TResponse>, AController<T, TRequest, TResponse> {

    @RequestMapping("save")
    @ResponseBody
    public TResponse save(T t) {
        TResponse response = doSave(t);
        return response;
    }

    @RequestMapping("delete")
    @ResponseBody
    public TResponse delete(List<ID> ids) {
        TResponse response = doDelete(ids);
        return response;
    }

    @RequestMapping("update")
    @ResponseBody
    public TResponse update(List<T> list) {
        TResponse response = doUpdate(list);
        return response;
    }

    @RequestMapping("list")
    @ResponseBody
    public TResponse list(TRequest request) {
        TResponse response = doList(request);
        return response;
    }

    @RequestMapping("page")
    @ResponseBody
    public TResponse page(TRequest request) {
        TResponse response = doPage(request);
        return response;
    }

    @RequestMapping("statis")
    @ResponseBody
    public TResponse statis(TRequest request) {
        TResponse response = doStatis(request);
        return response;
    }

    @RequestMapping("batchImport")
    @ResponseBody
    public TResponse batchImport(List<T> list) {
        TResponse response = doBatchImport(list);
        return response;
    }

    @RequestMapping("batchExport")
    public void doBatchExport(TRequest request, HttpServletRequest httpServletRequest) {

    }

}
