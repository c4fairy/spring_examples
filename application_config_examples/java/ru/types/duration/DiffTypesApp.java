package ru.types.duration;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DiffTypesApp {
    public static void main(String[] args) {
        System.out.println("Starting");
        SpringApplication app = new SpringApplication(DiffTypesApp.class);
        app.run(args);
    }

    @Bean
    @ConfigurationProperties(prefix = "types")
    public Smth smth() {
        return new Smth();
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> smth().printSmth();
    }
}
