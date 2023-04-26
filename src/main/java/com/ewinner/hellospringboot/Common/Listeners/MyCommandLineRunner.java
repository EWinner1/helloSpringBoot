package com.ewinner.hellospringboot.Common.Listeners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------------------------------------");
        System.out.println("MyCommandLineRunner...正在运行...");
        System.out.println("------------------------------------------");
        System.out.println(Arrays.asList(args));
    }
}
