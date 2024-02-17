package com.zhifei.cloud.controller;

import com.zhifei.cloud.entity.User;
import com.zhifei.cloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @GetMapping("/testGet")
    User testGet(@RequestBody User user) {
        user.setAge((short) 23);
        return user;
    }
}
