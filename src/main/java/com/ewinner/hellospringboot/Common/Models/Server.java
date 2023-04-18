package com.ewinner.hellospringboot.Common.Models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "server")

public class Server {
    private List<DockerInfo> docker_configs;
    private List<Integer> open_ports;
    private String[] address;

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public List<Integer> getOpenPorts() {
        return open_ports;
    }

    public void setOpenPorts(List<Integer> open_ports) {
        this.open_ports = open_ports;
    }

    public List<DockerInfo> getDockerConfigs() {
        return docker_configs;
    }

    public void setDockerConfigs(List<DockerInfo> docker_configs) {
        this.docker_configs = docker_configs;
    }
}
