package com.liuray.springbootmall.service.impl;

import com.liuray.springbootmall.dao.UserDao;
import com.liuray.springbootmall.dto.UserRegisterRequest;
import com.liuray.springbootmall.model.User;
import com.liuray.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
