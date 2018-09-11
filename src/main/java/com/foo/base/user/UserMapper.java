package com.foo.base.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    User save(User t);

    int delete(List<Long> ids);

    int update(List<User> list);

    @Select(" select c.customer_username as name "
            + " from np_customer c "
            + "where c.customer_username "
            + " like #{request.name,jdbcType=VARCHAR} ")
    List<User> list(@Param("request") UserRequest request);
}
