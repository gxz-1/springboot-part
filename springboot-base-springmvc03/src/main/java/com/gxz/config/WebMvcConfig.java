package com.gxz.config;

import com.gxz.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    //注册拦截器
    public void addInterceptor(InterceptorRegistry registry){
        registry.addInterceptor(new MyInterceptor());
    }
}
