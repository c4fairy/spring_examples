package ru.envi;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EnvironmentVarsConfig {
    //SpringApplication.setDefaultProperties
    //SpringApplication.setAddCommandLineProperties(false)
    public static void main(String[] args) {
        System.out.println("Starting");
        SpringApplication app = new SpringApplication(EnvironmentVarsConfig.class);
        app.run(args);
    }

    @Bean
    public Smth doSmth(){
        return new Smth();
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> doSmth().printSmth();
    }

}
