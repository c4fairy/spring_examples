package ru.types.duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.time.Duration;
import java.util.Objects;

public class Smth {
    @Autowired
    private Environment environment;

    public void printSmth() {
        Duration time = Duration.parse(Objects.requireNonNull(environment.getProperty("types.duration")));
        long milliseconds = time.toMillis();
        System.out.println("Duration = " + milliseconds);
    }
}
