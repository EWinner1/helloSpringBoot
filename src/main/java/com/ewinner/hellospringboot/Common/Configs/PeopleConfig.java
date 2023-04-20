package com.ewinner.hellospringboot.Common.Configs;

import com.ewinner.hellospringboot.Common.Annotations.PeopleConditionAnnotations;
import com.ewinner.hellospringboot.Common.Models.People;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeopleConfig {
    @Bean
    //定义的动态的可配置多个的
    @PeopleConditionAnnotations(conditions = {"org.springframework.data.redis.core.RedisTemplate"})
    //定义的静态注解
    //@Conditional(PeopleCondition.class)
    public People people(){
        return new People();
    }
}
