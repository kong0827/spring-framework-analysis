package com.kxj;

import com.kxj.config.CustomConfig;
import com.kxj.entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author kxj
 * @date 2021/7/7 00:15
 * @desc 注解版Spring的用法
 */
public class AnnotationConfigTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CustomConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);

        Cat cat = context.getBean(Cat.class);
        System.out.println(cat);

        Student student = context.getBean(Student.class);
        System.out.println(student);

        Teacher teacher = context.getBean(Teacher.class);
        System.out.println(teacher);


        Dog dog = context.getBean(Dog.class);
        System.out.println(dog);
    }
}
