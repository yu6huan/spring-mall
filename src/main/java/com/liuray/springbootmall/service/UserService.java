package com.liuray.springbootmall.service;

import com.liuray.springbootmall.dto.UserRegisterRequest;
import com.liuray.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
