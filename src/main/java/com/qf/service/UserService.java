package com.qf.service;

import com.qf.pojo.User;

public interface UserService {
    User getUser(User user);
    int addUser(User user);
}
