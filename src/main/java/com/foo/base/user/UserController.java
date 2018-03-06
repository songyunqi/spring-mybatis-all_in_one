package com.foo.base.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.foo.base.controller.CController;
import com.github.pagehelper.Page;

@Controller
@RequestMapping("user")
public class UserController extends CController<User, Long, UserRequest, UserResponse> {

	@Autowired
	UserService userService;

	@Override
	public UserResponse doSave(User t) {
		userService.save(t);
		return null;
	}

	@Override
	public UserResponse doDelete(List<Long> ids) {
		return null;
	}

	@Override
	public UserResponse doUpdate(List<User> list) {
		return null;
	}

	@Override
	public UserResponse doList(UserRequest request) {
		Page<User> page = userService.page(request);
		UserResponse response = new UserResponse();
		response.setContext(page);
		return response;
	}

	@Override
	public UserResponse doBatchImport(List<User> list) {
		return null;
	}

	@Override
	public void doBatchExport(UserRequest request, HttpServletRequest httpServletRequest) {

	}

	@Override
	public UserResponse doStatis(UserRequest request) {
		return null;
	}

	@Override
	public UserResponse doPage(UserRequest request) {
		Page<User> page = userService.page(request);
		UserResponse response = new UserResponse();
		response.setContext(page);
		return response;
	}

}
