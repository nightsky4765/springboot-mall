package com.yuan.springbootmall.dao;

import com.yuan.springbootmall.dto.UserRegisterRequest;
import com.yuan.springbootmall.model.User;

public interface UserDao {

    User getUserbyId(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
