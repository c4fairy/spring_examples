package ru.dina.simple_rest_project.client.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SimpleFeignRestApp {
    public static void main(String[] args) {
        SpringApplication.run(SimpleFeignRestApp.class, args);
    }
}
