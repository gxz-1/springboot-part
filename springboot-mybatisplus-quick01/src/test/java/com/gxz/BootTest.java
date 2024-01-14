package com.gxz;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gxz.mapper.StudentMapper;
import com.gxz.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class BootTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test() {
        Student s = new Student();
        s.setAge(19);
        s.setName("老八");
        s.setClasses("906班");
        s.setGender("男");
        //1.插入
        studentMapper.insert(s);
        //2.1 根据wrapper条件删除
        studentMapper.delete(null);
        //2.2 根据Id删除
        studentMapper.deleteById(2);
        //2.3 根据map删除
        Map param=new HashMap();
        param.put("age",20);
        studentMapper.deleteByMap(param);

        Student s1 = new Student();
        //自动修改非null的属性，注意：实体类中属性不能写基本数据类型（会有初始值，非空）
        s1.setAge(30);
        //3.1根据wrapper条件修改
        studentMapper.update(s1,null);
        //3.2根据id修改
        s1.setId(3);//不同于update,updateById的id必须有值
        studentMapper.updateById(s);
        //4.1 根据id查找
        studentMapper.selectById(1);
        //4.2 根据id批量查询
        List<Integer> ids=new ArrayList<>();
        ids.add(5);ids.add(7);
        studentMapper.selectBatchIds(ids);
        //4.3 集合查询
        studentMapper.selectList(null);
    }

    @Test
    public void testPage(){//用MybatisPlus提供的分页插件
        //1.提供的查询方法-直接使用即可
        //Page(页码，页容量)
        Page<Student> page = new Page<>(1, 3);
        studentMapper.selectPage(page,null);
        //结果
        page.getCurrent();//页码
        page.getSize();//页容量
        List<Student> list1 = page.getRecords();//当前页数据
        page.getTotal();//总条数
        System.out.println("list1 = " + list1);

        //2.自定义的mapper接口
        studentMapper.queryByAge(page,1);
        List<Student> list2 = page.getRecords();//当前页数据
        System.out.println("list2 = " + list2);
    }
}
