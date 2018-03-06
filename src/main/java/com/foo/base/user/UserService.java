package com.foo.base.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foo.base.service.CService;

@Service
public class UserService extends CService<User, Long, UserRequest> {

	@Autowired
	UserMapper userMapper;

	@Override
	public int save(User t) {
		return 0;
	}

	@Override
	public int delete(List<Long> ids) {
		return 0;
	}

	@Override
	public int update(List<User> list) {
		return 0;
	}

	@Override
	public int batchImport(List<User> list) {
		return 0;
	}

	@Override
	public List<User> list(UserRequest tRequest) {
		return null;
	}

}
