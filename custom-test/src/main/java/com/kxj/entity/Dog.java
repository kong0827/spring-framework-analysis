package com.kxj.entity;

/**
 * @author kxj
 * @date 2021/7/7 00:37
 * @desc
 */
public class Dog {

    private String name;

    public Dog() {
        this.name = "旺财";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
