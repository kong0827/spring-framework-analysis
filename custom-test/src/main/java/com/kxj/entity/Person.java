package com.kxj.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author kxj
 * @date 2021/7/5 23:58
 * @desc
 */
public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}
}
