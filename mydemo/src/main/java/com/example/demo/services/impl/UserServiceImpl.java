package com.example.demo.services.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import com.example.demo.services.IUserServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserServiece {

    @Autowired
    //idea会报语法错误，编译没问题Could not autowire. No beans of 'UserDao' type found
    // 降低警告级别可解决
    private UserDao dao;

    @Override
    public User get(int id) {
        User user = dao.get(id);
        return  user;
    }
}
