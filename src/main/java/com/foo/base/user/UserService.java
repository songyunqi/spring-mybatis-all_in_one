package com.foo.base.user;

import com.foo.base.request.ARequest;
import com.foo.base.service.CService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends CService<User, UserRequest> {


    @Override
    public int save(UserRequest request) {
        return 0;
    }

    @Override
    public int delete(UserRequest request) {
        return 0;
    }

    @Override
    public int update(UserRequest request) {
        return 0;
    }

    @Override
    public List<User> list(UserRequest userRequest) {
        return null;
    }
}
