package com.gxz.pojo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String classes;
}
