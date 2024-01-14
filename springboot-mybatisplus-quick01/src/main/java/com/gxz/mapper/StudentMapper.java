package com.gxz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gxz.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {
    //mybatis plus提供了简单的增伤改查方法，不需要写接口，继承BaseMapper<>即可

    //自己写的根据年龄参数查询的接口，并且分页(指定IPage返回值并添加IPage<Student>形参)
    IPage<Student> queryByAge(IPage<Student> page,@Param("age") Integer age);
}
