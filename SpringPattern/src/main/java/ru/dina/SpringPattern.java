package ru.dina;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class SpringPattern {

    public static void main(String[] args) {
        log.info("Starting application...");
        SpringApplication app = new SpringApplication(SpringPattern.class);
        ApplicationContext ctx = app.run(args);
        AppConfig cfg = ctx.getBean(AppConfig.class);
        log.info("cfg: {}", cfg);

    }

    @Bean
    @ConfigurationProperties(prefix = "config")
    public AppConfig getProperties() {
        return new AppConfig();
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> getProperties();
    }
}