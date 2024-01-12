package com.gxz.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//实现Aop，面向切面编程
@Component//放入ioc容器
@Aspect//设置为切面
//@Order //设置优先级
public class LogAdvice {
    @Before("execution(* com..service.*.*(..))")//前置增强
    public void before(JoinPoint joinPoint){
        //用切点拿到方法相关信息
        String classname = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(classname+"::"+methodName+"开始执行了");
    }
}
