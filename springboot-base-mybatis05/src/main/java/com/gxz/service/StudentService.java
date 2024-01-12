package com.gxz.service;

import com.gxz.mapper.StudentMapper;
import com.gxz.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public List<Student> query(){
        return studentMapper.queryAll();
    }

    @Transactional//添加事务
    public int delete(){
        int rows=studentMapper.delete(1);
        int i=1/0;//模拟报错后事务回滚
        return rows;
    }
}
