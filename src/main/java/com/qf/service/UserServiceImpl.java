package com.qf.service;

import com.qf.mapper.UserMapper;
import com.qf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(User user) {
        return userMapper.getUser(user);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
