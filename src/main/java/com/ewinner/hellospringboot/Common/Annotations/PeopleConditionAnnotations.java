package com.ewinner.hellospringboot.Common.Annotations;

import com.ewinner.hellospringboot.Common.Conditions.PeopleCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(PeopleCondition.class)
public @interface PeopleConditionAnnotations {
    String[] conditions();
}
