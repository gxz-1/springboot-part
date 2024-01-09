package com.gxz.controller;

import com.gxz.pojo.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //在springboot启动类所在根包下的目录自动被扫描
public class HelloController {

    @Autowired
    Information info;

    @RequestMapping("hello")
    public String hello(){
        return info.toString();
    }
}
