package ru.dina;

import lombok.extern.java.Log;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@Log
@SpringBootApplication
public class SpringPattern {
    public static void main(String[] args) {
        log.info("Starting application...");
        SpringApplication app = new SpringApplication(SpringPattern.class);
        app.run(args);
    }

    @Bean
    @ConfigurationProperties(prefix = "config")
    public AppConfig getProperties() {
        return new AppConfig();
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> getProperties().printProps();
    }
}