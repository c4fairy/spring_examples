package ru.value;

import org.springframework.beans.factory.annotation.Value;

public class Smth {
    @Value("${my.value:defaultValue}")
    private String appName;

    public void printSmth() {
        System.out.println(appName);
    }
}
