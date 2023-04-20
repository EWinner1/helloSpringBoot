package com.ewinner.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 引导类，SpringBoot项目的入口
 */
@SpringBootApplication
public class HelloSpringBootApplication {
    public static void main(String[] args) {
        //启动SpringBoot的应用，返回Spring的IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(HelloSpringBootApplication.class, args);
        //获取Bean
        System.out.println(context.getBean("people"));
    }

}
