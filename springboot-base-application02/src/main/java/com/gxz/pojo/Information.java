package com.gxz.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //将组件放入ioc容器才能进行@Value依赖注入
@Data //设置get、set等,从而进行自动装配
@ConfigurationProperties(prefix = "gxz.info")//批量数据读取，prefix:相同的前缀
public class Information {
//    @Value("${gxz.info.name}")
    private String name;
//    @Value("${gxz.info.age}")
    private Integer age;
//    @Value("${gxz.info.prefer}")//@Value缺点：只能读取单个值，不能读取集合
    private List<String> prefer;
}
