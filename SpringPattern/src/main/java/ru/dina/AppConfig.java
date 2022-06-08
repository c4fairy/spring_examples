package ru.dina;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AppConfig {
    private String name;
    private int num;
    private List<String> nameList;
    private Map<String, String> nameMap;
    private NameType nameType;

    public enum NameType {
        SHORT(1, "Короткое имя"),
        LONG(2, "Длинное имя");

        private final int id;
        String name;

        NameType(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}