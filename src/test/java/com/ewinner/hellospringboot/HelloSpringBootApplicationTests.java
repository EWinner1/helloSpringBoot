package com.ewinner.hellospringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class HelloSpringBootApplicationTests {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void TestSetRedisCache(){
        redisTemplate.boundValueOps("name").set("Justin William");
    }

    @Test
    public void TestGetRedisCache(){
        Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }
}
