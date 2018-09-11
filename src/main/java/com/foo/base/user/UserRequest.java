package com.foo.base.user;

import com.foo.base.request.ARequest;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class UserRequest extends ARequest {

    @NotBlank
    private String name;


    private String searchName;

}
