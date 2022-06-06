package ru.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfPropertiesApp {
    public static void main(String[] args) {
        System.out.println("Starting");
        SpringApplication app = new SpringApplication(ConfPropertiesApp.class);
        app.run(args);
    }

    @Bean
    @ConfigurationProperties(prefix = "my")
    public Smth smth() {
        return new Smth();
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> smth().printSmth();
    }
}
