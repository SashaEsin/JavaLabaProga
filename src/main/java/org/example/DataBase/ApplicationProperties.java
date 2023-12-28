package org.example.DataBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class ApplicationProperties {
    private static final Logger LOGGER = LogManager.getLogger(ApplicationProperties.class);
    private static final String FILE_NAME = "/application.properties";
    private static ApplicationProperties INSTANCE;
    private final Properties properties = new Properties();

    private void init() {
        try (InputStream is = getClass().getResourceAsStream(FILE_NAME)){
            if (Objects.nonNull(is)) {
                properties.load(is);
            }
        } catch (IOException e) {
            LOGGER.info(e.getMessage(), e);
        }
    }

    public Properties getProperties() {
        return properties;
    }

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<>();
        for (final String name : properties.stringPropertyNames()) {
            map.put(name, properties.getProperty(name));
        }
        return map;
    }

    public static ApplicationProperties getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new ApplicationProperties();
            INSTANCE.init();
        }
        return INSTANCE;
    }
}
