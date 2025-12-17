package fr.diginamic.factory;

import fr.diginamic.commun.*;

public class ElementFactory {

    public static Element Nouveauelement(TypeElement type, String nom, double valeur, Unite unite) {
        switch (type) {
            case INGREDIENT: return new Ingredient(nom, valeur, unite);
            case ADDITIF:    return new Additif(nom, valeur, unite);
            case ALLERGENE:  return new Allergene(nom, valeur, unite);
            default: return null;
        }
    }
}