package com.Vegle.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("car")
public class Car {
    @Value("宝马")
    private String name;
    @Value("150000")
    private String price;

    public Car(){
    System.out.println("测试");
    }














    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
