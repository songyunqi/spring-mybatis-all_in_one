package com.foo.base.user;

import com.foo.base.request.ARequest;
import lombok.Data;

@Data
public class UserRequest extends ARequest {

    private String name;

}
