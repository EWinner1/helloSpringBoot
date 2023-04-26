package com.ewinner.hellospringboot.Common.Listeners;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("------------------------------------------");
        System.out.println("ApplicationContextInitializer...初始化中...");
        System.out.println("------------------------------------------");
    }
}
