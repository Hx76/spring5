package com.hx76.pojo;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
    //    public User() {
//        System.out.println("lalalala");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName(){
        System.out.println(name);
    }
}
