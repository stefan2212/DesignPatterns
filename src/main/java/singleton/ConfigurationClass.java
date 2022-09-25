package singleton;

import lombok.Setter;

@Setter
public class ConfigurationClass {
    private static ConfigurationClass instance;
    private String databaseUrl;
    private String username;

    private ConfigurationClass() {

    }

    public String getDataBaseUrl() {
        return databaseUrl;
    }

    public String getDataBaseUsername() {
        return username;
    }

    public static ConfigurationClass getInstance() {
        if (instance == null) {
            instance = new ConfigurationClass();
        }
        return instance;
    }
}
