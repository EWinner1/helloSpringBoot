package com.ewinner.hellospringboot.Common.Listeners;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class MySpringApplicationRunListener implements SpringApplicationRunListener {
    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("------------------------------------------");
        System.out.println("MySpringApplicationRunListener...启动中...");
        System.out.println("------------------------------------------");
        SpringApplicationRunListener.super.starting(bootstrapContext);
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        System.out.println("------------------------------------------");
        System.out.println("MySpringApplicationRunListener...环境准备完成...");
        System.out.println("------------------------------------------");
        SpringApplicationRunListener.super.environmentPrepared(bootstrapContext, environment);
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("------------------------------------------");
        System.out.println("MySpringApplicationRunListener...上下文Context准备完成...");
        System.out.println("------------------------------------------");
        SpringApplicationRunListener.super.contextPrepared(context);
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("------------------------------------------");
        System.out.println("MySpringApplicationRunListener...上下文Context加载完成...");
        System.out.println("------------------------------------------");
        SpringApplicationRunListener.super.contextLoaded(context);
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("------------------------------------------");
        System.out.println("MySpringApplicationRunListener...启动完成...");
        System.out.println("------------------------------------------");
        SpringApplicationRunListener.super.started(context, timeTaken);
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("------------------------------------------");
        System.out.println("MySpringApplicationRunListener...准备好啦！");
        System.out.println("------------------------------------------");
        SpringApplicationRunListener.super.ready(context, timeTaken);
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("------------------------------------------");
        System.out.println("MySpringApplicationRunListener...运行失败...");
        System.out.println("------------------------------------------");
        SpringApplicationRunListener.super.failed(context, exception);
    }
}
