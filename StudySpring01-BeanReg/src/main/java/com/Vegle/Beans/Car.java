package com.Vegle.Beans;

public class Car {
    private String name;
    private int price;
    private int max;
    private int maxSpeed;

    public Car(String name, int price, int max) {
        this.name = name;
        this.price = price;
        this.max = max;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMax() {
        return max;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", max=" + max +
                '}';
    }
}
