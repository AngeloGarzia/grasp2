package fr.diginamic.fatcory;
import static org.junit.Assert.*;

import fr.diginamic.commun.Allergene;
import fr.diginamic.commun.Ingredient;
import fr.diginamic.commun.TypeElement;
import fr.diginamic.commun.Unite;
import fr.diginamic.factory.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {
    /**
     * DELTA
     */
    private static final double DELTA = 0.0000001;

    @Test
    public void ingrediantTest() {
        Element e = new Ingredient("Sel", 5.00, Unite.MILLI_GRAMMES);

        assertEquals("Sel", e.getNom());
        assertEquals(5.00, e.getValeur(), DELTA);
        assertEquals(Unite.MILLI_GRAMMES, e.getUnite());
    }


    @Test
    public void alergeneTest() {


        Element ee = ElementFactory.Nouveauelement(
                TypeElement.ALLERGENE,
                "E122",
                1.0,
                Unite.MICRO_GRAMMES
        );

        assertTrue(ee instanceof Allergene);

        assertEquals("E122", ee.getNom());

        assertEquals(1.0, ee.getValeur(), DELTA);

        assertEquals(Unite.MICRO_GRAMMES, ee.getUnite());


    }
}