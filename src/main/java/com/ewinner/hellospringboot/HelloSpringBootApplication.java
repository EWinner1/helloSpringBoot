package com.ewinner.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.Jedis;

/**
 * 引导类，SpringBoot项目的入口
 */
@SpringBootApplication
public class HelloSpringBootApplication {

    // @Bean
    // public Jedis jedis(){
    //     return new Jedis("192.168.31.150", 6379);
    // }

    public static void main(String[] args) {
        //启动SpringBoot的应用，返回Spring的IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(HelloSpringBootApplication.class, args);
        //获取Bean
        System.out.println(context.getBean("people"));
        Jedis jedis = context.getBean(Jedis.class);
        System.out.println(jedis);
        jedis.setex("name",10, "ewinner");
        //jedis.expire("name", 10);
        System.out.println(jedis.get("name"));
    }
}
