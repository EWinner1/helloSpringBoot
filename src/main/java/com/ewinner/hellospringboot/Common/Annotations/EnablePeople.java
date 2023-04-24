package com.ewinner.hellospringboot.Common.Annotations;

import com.ewinner.hellospringboot.Common.Configs.PeopleConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(PeopleConfig.class)
public @interface EnablePeople {
}
