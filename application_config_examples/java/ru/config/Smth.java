package ru.config;

import lombok.Data;

@Data
public class Smth {
    private String conf;

    public void printSmth() {
        System.out.println(conf);
    }
}
