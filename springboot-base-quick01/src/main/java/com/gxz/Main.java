package com.gxz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //设置为springboot启动类
//1.这个类是配置类，可以添加@Bean 2.自动加载其他配置类 3.扫描当前类所在根包下的目录下的Component组件
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);//自动创建ioc容器并启动tomcat服务器
    }
}