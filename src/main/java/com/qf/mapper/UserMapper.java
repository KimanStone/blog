package com.qf.mapper;

import com.qf.pojo.User;

public interface UserMapper {
    User getUser(User user);
    int addUser(User user);
}
