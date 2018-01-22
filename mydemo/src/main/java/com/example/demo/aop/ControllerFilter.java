package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
/**
 * @author:liucx
 * @date:2018-1-21
 * @description:控制器切面拦截
 */
//配置注解，@Component也可以
@Configuration
//切面注解
@Aspect
public class ControllerFilter {
    //定义一个切入点
    @Pointcut("execution(* com.example.demo.controller.TestController.*(..))")
    public void ActionFilter() {}

    @Before("ActionFilter()")
    public void BeforeAction(JoinPoint point) {
        System.out.println("before切面");
        //ToDoSomething
    }
}