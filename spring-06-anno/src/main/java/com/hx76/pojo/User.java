package com.hx76.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// component是组件的意思，等价于<bean id="user" class="com.hx76.pojo.User"/>

@Component
@Scope("prototype")
public class User {
    @Value("zhangThree")
    public String name;
    @Value("lifour")
    public void setName(String name) {
        this.name = name;
    }


    public void print(String name){
        System.out.println(name);
    }
}
