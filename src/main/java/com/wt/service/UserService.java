package com.wt.service;

import com.wt.model.User;

import java.util.List;

/**
 * Created by wt on 2018/7/4.
 */
public interface UserService {

    public User findByUserName(String username);
}
