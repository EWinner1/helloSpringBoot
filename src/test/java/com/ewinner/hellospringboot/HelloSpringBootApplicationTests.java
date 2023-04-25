package com.ewinner.hellospringboot;

import com.ewinner.hellospringboot.Common.Mappers.IPeopleMapper;
import com.ewinner.hellospringboot.Common.Mappers.IPeopleMapperXML;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class HelloSpringBootApplicationTests {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;
    @Autowired
    private IPeopleMapper peopleMapper;
    @Autowired
    private IPeopleMapperXML peopleMapperXML;

    @Test
    void contextLoads() {
    }

    @Test
    public void TestSetRedisCache() {
        redisTemplate.boundValueOps("name").set("Justin William");
        redisTemplate.expire("name", 11, TimeUnit.SECONDS);
    }

    @Test
    public void TestGetRedisCache() {
        Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }

    @Test
    public void TestGetAllPeople() {
        System.out.println(peopleMapper.getAllPeople());
    }

    @Test
    public void TestGetAllPeopleXML() {
        System.out.println(peopleMapperXML.getAllPeople());
    }
}
