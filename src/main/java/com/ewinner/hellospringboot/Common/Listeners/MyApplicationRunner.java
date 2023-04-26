package com.ewinner.hellospringboot.Common.Listeners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("------------------------------------------");
        System.out.println("MyApplicationRunner...正在运行...");
        System.out.println("------------------------------------------");
        // 打印传入的参数
        System.out.println(Arrays.asList(args.getSourceArgs()));
    }
}
