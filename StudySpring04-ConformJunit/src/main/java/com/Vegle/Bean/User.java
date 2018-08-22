package com.Vegle.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
    @Value("Vegle")
    private String name;
    @Value("15")
    private int age;
    /*
    @Autowired
    @Qualifier("car")
    Autowired默认是根据类型去注入，但是如果接口有多个实现就会有问题，所以要加Qualifier("")来限定名称
    但是还有一种更为简洁的语法是@Resource(name = "car")
    */
    @Autowired
    private Car car;
    public User(){
        System.out.println("你已经成功创建了一个用户");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
