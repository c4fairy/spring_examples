package ru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YamlFileConfig {
    //SpringApplication.setDefaultProperties
    //SpringApplication.setAddCommandLineProperties(false)
    public static void main(String[] args) {
        System.out.println("Starting");
        SpringApplication app =new SpringApplication(ru.YamlFileConfig.class);
        //app.setDefaultProperties();
        app.run(args);
    }
}
