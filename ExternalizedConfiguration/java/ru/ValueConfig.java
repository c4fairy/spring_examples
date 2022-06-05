package ru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValueConfig {
    //SpringApplication.setDefaultProperties
    //SpringApplication.setAddCommandLineProperties(false)
    public static void main(String[] args) {
        System.out.println("Starting");
        SpringApplication app =new SpringApplication(ru.ValueConfig.class);
        //app.setDefaultProperties();
        app.run(args);
    }
}
