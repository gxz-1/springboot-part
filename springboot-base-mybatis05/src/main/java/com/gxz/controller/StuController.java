package com.gxz.controller;

import com.gxz.mapper.StudentMapper;
import com.gxz.pojo.Student;
import com.gxz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuController {

    @Autowired
    StudentService studentService;

    @GetMapping("query")
    public List<Student> queryStu(){
        return studentService.query();
    }
    @GetMapping("del")
    public int del(){
        return studentService.delete();
    }
}
