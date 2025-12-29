package com.yuan.springbootmall.service.impl;

import com.yuan.springbootmall.dao.UserDao;
import com.yuan.springbootmall.dto.UserRegisterRequest;
import com.yuan.springbootmall.model.User;
import com.yuan.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserbyId(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
