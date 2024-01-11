package com.gxz.controller;

import com.gxz.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    //导入jdbc启动器后会根据yml文件自动加载jdbc配置类
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("user")
    public List<Student> list(){
        String sql="select * from students";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class));
    }

}
