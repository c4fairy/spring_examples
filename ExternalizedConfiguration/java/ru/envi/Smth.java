package ru.envi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class Smth {
    @Autowired
    private Environment environment;

    public void printSmth() {
        String appName = environment.getProperty("my.word");
        System.out.println(appName);
    }
}
