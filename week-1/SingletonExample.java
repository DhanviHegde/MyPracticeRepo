public class SingletonExample {
    public static void main(String[] args) {
        ConfigManager c1 = ConfigManager.getInstance();
        ConfigManager c2 = ConfigManager.getInstance();
        System.out.println(c1 == c2); 
    }
}

class ConfigManager {
    private static ConfigManager instance = null;

    private ConfigManager() {
        System.out.println("Loading configuration...");
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getAppName() {
        return "E-Commerce Platform";
    }
}
