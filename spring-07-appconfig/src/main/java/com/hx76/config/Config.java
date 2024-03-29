package com.hx76.config;

import com.hx76.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 这个也会Spring容器托管，注册到容器中，因为他本来就是一个@Component
// @Configuration代表这是一个配置类，就和beans.xml一样

@Configuration
@ComponentScan("com.hx76.pojo")
@Import(Config2.class)
public class Config {
    // 注册一个bean，就相当于之前写的一个bean标签
    // 这个方法的名字就是id属性
    // 返回值就是bean标签中的class属性

    @Bean
    public User getUser(){
        return new User();  //返回要注入到bean的对象
    }
}
