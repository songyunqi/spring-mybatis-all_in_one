package com.foo.base.user;

import com.foo.base.request.ARequest;
import com.foo.base.service.CService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends CService<User, Long, UserRequest> {

    @Autowired
    UserMapper userMapper;

    @Override
    public int save(ARequest request) {
        return 0;
    }

    @Override
    public int delete(ARequest request) {
        return 0;
    }

    @Override
    public int update(ARequest request) {
        return 0;
    }

    @Override
    public List<User> list(UserRequest userRequest) {
        return null;
    }
}
