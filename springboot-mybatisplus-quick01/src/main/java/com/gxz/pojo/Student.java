package com.gxz.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("students") // 如果与数据库表名不一致，用这个注解映射
public class Student {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    @TableField("class") //映射到数据库中的字段名
    private String classes;
    @TableField(exist = false)//exist= false表示不当做数据库字段
    private String en;
}
