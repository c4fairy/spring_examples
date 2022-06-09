package ru.envi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Smth {
    @Autowired
    private Environment environment;

    public void printSmth() {
        String appName = environment.getProperty("my.word");
        Map<String, Object> map = new HashMap();
        for(Iterator it = ((AbstractEnvironment) environment).getPropertySources().iterator(); it.hasNext(); ) {
            PropertySource propertySource = (PropertySource) it.next();
            if (propertySource instanceof MapPropertySource) {
                map.putAll(((MapPropertySource) propertySource).getSource());
            }
        }
        System.out.println(appName);
    }
}
