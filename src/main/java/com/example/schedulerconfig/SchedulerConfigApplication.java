package com.example.schedulerconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SchedulerConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulerConfigApplication.class, args);
    }

}
