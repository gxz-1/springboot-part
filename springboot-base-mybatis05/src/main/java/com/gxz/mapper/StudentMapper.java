package com.gxz.mapper;

import com.gxz.pojo.Student;

import java.util.List;

public interface StudentMapper {
    int delete(int i);

    List<Student> queryAll();
}
