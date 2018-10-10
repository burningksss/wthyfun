package com.wt.mapper;

import com.wt.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    public User findByUserName(String username);

    @Select("select * from user")
    public List<User> findAllUser();
}