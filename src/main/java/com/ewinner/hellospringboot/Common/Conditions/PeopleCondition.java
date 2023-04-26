package com.ewinner.hellospringboot.Common.Conditions;

import com.ewinner.hellospringboot.Common.Annotations.PeopleConditionAnnotations;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class PeopleCondition implements Condition {
    /**
     * @param context  the condition context 获取上下文对象，环境，IOC等
     * @param metadata the metadata of the {@link org.springframework.core.type.AnnotationMetadata class}
     *                 or {@link org.springframework.core.type.MethodMetadata method} being checked
     * @return is exist or not class
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        /*
        添加正常的业务逻辑去判断，此处例子使用RedisTemplate
        try {
            Class<?> cls = Class.forName("org.springframework.data.redis.core.RedisTemplate");
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;*/
        Map<String, Object> map = metadata.getAnnotationAttributes(PeopleConditionAnnotations.class.getName());
        String[] conditions = (String[]) map.get("conditions");
        try {
            for (String className : conditions) {
                Class<?> cls = Class.forName(className);
            }
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }
}
