package fr.diginamic.singleton;

import java.util.HashMap;
import java.util.ResourceBundle;

public class Configuration {
    private static final Configuration SINGLETON = new Configuration();
    private final HashMap<String, String> valeur = new HashMap<>();
    ResourceBundle configuration = ResourceBundle.getBundle("configuration");

    public Configuration() {
        init();
    }

    public static Configuration getInstance() {
        return SINGLETON;
    }

    private void init() {
        valeur.put("db.url", configuration.getString("db.url"));
        valeur.put("db.username", configuration.getString("db.user"));
        valeur.put("db.password", configuration.getString("db.password="));
    }

    public String getValeur(String cle) {
        return valeur.get(cle);
    }
}
