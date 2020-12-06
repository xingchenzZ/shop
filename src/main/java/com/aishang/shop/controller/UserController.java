package com.aishang.shop.controller;

import com.aishang.shop.po.User;
import com.aishang.shop.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getAll")
    public List<User> getAll() {

        return userService.getAll();
    }
}
