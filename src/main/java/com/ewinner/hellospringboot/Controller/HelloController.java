package com.ewinner.hellospringboot.Controller;

import com.ewinner.hellospringboot.Common.Models.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloController {

    @Value("${server.serverName}")
    private String serverName;
    private Environment env;
    private Server server;

    @Autowired
    public void setEnvironment(Environment env) {
        this.env = env;
    }

    @Autowired
    public void setServer(Server server) {
        this.server = server;
    }

    @RequestMapping("/helloController")
    public String hello() {
        return "Hello SpringBoot!";
    }

    @RequestMapping("/serverStatus")
    public void getStatus() {
        System.out.print("Server name is ");
        System.out.println(serverName);
        System.out.println("-----------------------");
        System.out.print("Server address is ");
        System.out.println("From env:" + env.getProperty("server.address[0]"));
        System.out.println("-----------------------");
        System.out.println("Available dockers:");
        System.out.println(server.getDockerConfigs().toString().replaceAll("(?<=}),", "\n"));
        System.out.println("-----------------------");
        System.out.println("Available ports:");
        System.out.println(server.getOpenPorts().toString().replaceAll("(?<=}),", "\n"));
        String[] address = server.getAddress();
        for (String s : address) {
            System.out.println(s);
        }
    }

    @RequestMapping("/user")
    public String findAll(){
        return "success";
    }

}
