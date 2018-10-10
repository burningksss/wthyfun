package com.wt.service.impl;

import com.wt.mapper.UserMapper;
import com.wt.model.User;
import com.wt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wt on 2018/7/4.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public User findByUserName(String username) {
        return userMapper.findByUserName(username);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }
}
