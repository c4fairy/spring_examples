package ru.envi;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EnvironmentVarsApp {
    public static void main(String[] args) {
        System.out.println("Starting");
        SpringApplication app = new SpringApplication(EnvironmentVarsApp.class);
        app.run(args);
    }
//in Environment variables = my.word=From idea env vars
//Java -jar myApp.jar -Dword=byEnvironment
//$ java -Dspring.application.json='{"my":{"name":"test"}}' -jar myapp.jar
    @Bean
    public Smth doSmth() {
        return new Smth();
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> doSmth().printSmth();
    }

}
