package com.liuray.springbootmall.dao;

import com.liuray.springbootmall.dto.UserRegisterRequest;
import com.liuray.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
