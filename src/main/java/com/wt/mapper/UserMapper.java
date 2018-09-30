package com.wt.mapper;

import com.wt.model.User;

import java.util.List;

public interface UserMapper {

    public User findByUserName(String username);
}