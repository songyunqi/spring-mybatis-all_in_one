package com.foo.base.user;

import com.foo.base.controller.CController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController extends CController<User, UserRequest, UserResponse> {

    @Autowired
    UserService userService;


}
