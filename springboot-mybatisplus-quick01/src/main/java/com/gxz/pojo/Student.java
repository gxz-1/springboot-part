package com.gxz.pojo;

import com.baomidou.mybatisplus.annotation.*;
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

    @TableLogic //将这个字段标记为逻辑删除的状态字段
    // 删除时改为修改此列的属性值为1 查找时只查找deleted为0的(对于多个表，可以在yml中全局配置）
    private Integer deleted;

    @Version //乐观锁的版本号字段
    // 仅支持updatebyid和update方法 仅支持数据类型：int，long，Date，Timestamp，LocalDateTime
    private Integer version;
}
