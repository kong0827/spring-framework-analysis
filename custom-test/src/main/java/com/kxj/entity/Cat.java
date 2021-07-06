package com.kxj.entity;

/**
 * @author kxj
 * @date 2021/7/7 00:23
 * @desc
 */
public class Cat {
    private String name;

    public Cat() {
        this.name = "tomCat";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
