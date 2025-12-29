package com.yuan.springbootmall.service;

import com.yuan.springbootmall.dto.UserLoginRequest;
import com.yuan.springbootmall.dto.UserRegisterRequest;
import com.yuan.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
