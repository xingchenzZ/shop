package com.aishang.shop.service.impl;

import com.aishang.shop.dao.UserMapper;
import com.aishang.shop.po.User;
import com.aishang.shop.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
