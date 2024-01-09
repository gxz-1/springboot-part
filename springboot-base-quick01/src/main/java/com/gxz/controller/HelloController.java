package com.gxz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller //在springboot启动类所在根包下的目录自动被扫描
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello springboot3!";
    }
}
