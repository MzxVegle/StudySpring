package com.Vegle.Beans;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    public User(){
        System.out.println("成功的创建了一个对象");
    }
}
