package com.kxj.config;

import com.kxj.entity.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author kxj
 * @date 2021/7/7 00:13
 * @desc
 */

@Import({Cat.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
@Configuration
public class CustomConfig {

    /**
     * 导入自定义的Bean
     *
     * @return
     */
    @Bean
    public Person person() {
        return new Person("张三");
    }

}

/**
 * ImportSelector其主要作用是收集需要导入的配置类
 */
class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Student.class.getName(), Teacher.class.getName()};
    }

}


/**
 * 		BeanDefinitionRegistry：Bean定义信息注册中心：图纸中心;
 * 				它里面都是BeanDefinition
 *
 * 	<bean class="com.atguigu.spring.bean.Person" id="person">
 * 		<property name="name" value="张三"/>
 * 	</bean>
 * 	 对应
 * 	RootBeanDefinition
 *
 */
class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // BeanDefinition
        BeanDefinition beanDefinition = new RootBeanDefinition(Dog.class);
//        beanDefinition.setBeanClassName(Dog.class.getName());
        registry.registerBeanDefinition("dog", beanDefinition);

        // BeanDefinition
//        RootBeanDefinition beanDefinition = new RootBeanDefinition();
//        beanDefinition.setBeanClass(Dog.class);
//        //可以声明定义信息，包括我需要自动装配什么？
//
//        //Spring 这个实例的类型，名字
//        registry.registerBeanDefinition("dog", beanDefinition);

    }
}

