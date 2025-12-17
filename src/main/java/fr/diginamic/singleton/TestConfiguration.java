package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class TestConfiguration {
    public static void main(String[] args) {

        ResourceBundle configuration = ResourceBundle.getBundle("configuration");
        String v1 = configuration.getString("db.url");
        String v2 = configuration.getString("db.user");
        String v3 = configuration.getString("db.password");
        System.out.println(v1 + " " + v2 + " " + v3);

    }
}
