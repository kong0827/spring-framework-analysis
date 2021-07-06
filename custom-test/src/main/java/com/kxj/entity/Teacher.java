package com.kxj.entity;

/**
 * @author kxj
 * @date 2021/7/7 00:30
 * @desc
 */
public class Teacher {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
