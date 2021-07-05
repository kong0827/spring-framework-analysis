package com.kxj;

import com.kxj.entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kxj
 * @date 2021/7/5 23:50
 * @desc
 */
public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person person = context.getBean(Person.class);
		System.out.println(person);
	}
}
