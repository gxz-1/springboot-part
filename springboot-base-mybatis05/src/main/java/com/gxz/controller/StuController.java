package com.gxz.controller;

import com.gxz.mapper.StudentMapper;
import com.gxz.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuController {
    @Autowired
    StudentMapper studentMapper;

    @GetMapping("query")
    public List<Student> query(){
        return studentMapper.queryAll();
    }

}
