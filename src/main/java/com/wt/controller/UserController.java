package com.wt.controller;

import com.wt.model.User;
import com.wt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by wt on 2018/7/4.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toDemo")
    public ModelAndView toDemo(){
        ModelAndView model=new ModelAndView();
        model.setViewName("demo");
        return model;
    }

    @ResponseBody
    @RequestMapping("/getAllUser")
    public User getAllUser(){
        return userService.findByUserName("xyycici");
    }
}
