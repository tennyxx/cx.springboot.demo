package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.services.IUserServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author liucx
 */
@RestController
public class TestController {
    @Autowired
    User user;
    @Autowired
    IUserServiece userServiece;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public  User getUser(@PathVariable int id){
        user=userServiece.get(id);
        return user;
    }
}
