package com.Vegle.Beans;

public class TestBean01 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestBean01{" +
                "name='" + name + '\'' +
                '}';
    }
}
