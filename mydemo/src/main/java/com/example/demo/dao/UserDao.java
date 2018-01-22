package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    //这里的get对应的是user.xml里<select id="get">
    public User get(@Param("id")int id);
}
