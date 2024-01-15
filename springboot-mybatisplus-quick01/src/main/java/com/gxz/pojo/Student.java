package com.gxz.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("students") // 如果与数据库表名不一致，用这个注解映射
public class Student {
    //value:主键映射到数据库字段
    // type:AUTO配合sql主键自增长 ASSIGN_ID雪花算法生成Long不重复随机数字(也可以在yml全局配置)
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    @TableField("class") //映射到数据库中的字段名
    private String classes;
    @TableField(exist = false)//exist= false表示不当做数据库字段
    private String en;
}
