package fr.diginamic.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigurationTest {


    @Test
    void getValeur() {

        Configuration c1 = Configuration.getInstance();
        Configuration c2 = Configuration.getInstance();

        assertSame(c1, c2);


    }
}