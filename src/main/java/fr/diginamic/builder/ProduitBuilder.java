package fr.diginamic.builder;

import fr.diginamic.commun.Additif;
import fr.diginamic.commun.Allergene;
import fr.diginamic.commun.Ingredient;
import fr.diginamic.commun.Unite;

import java.util.ArrayList;
import java.util.List;

public class ProduitBuilder {

    private Produit produit ;

    public ProduitBuilder() {
        produit =new Produit();
    }

    public ProduitBuilder appendNom(String nom) {
        this.produit.setNom(nom);
        return this;
    }

    public ProduitBuilder appendGrade(String grade) {
        this.produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder appendCategorie(String categorie) {
        this.produit.setNom(categorie);
        return this;
    }

    public ProduitBuilder appendMarque(String marque) {
        this.produit.setNom(marque);
        return this;
    }

    public ProduitBuilder appendIngredient(String nom,double valeur ,Unite unite) {
        Ingredient ing =new Ingredient(nom,valeur,unite);
        produit.getIngredients().add(ing);
        return this;
    }
    public ProduitBuilder appendAllergene(String nom,double valeur ,Unite unite) {
        Allergene all =new Allergene(nom,valeur,unite);
        produit.getAllergenes().add(all);
        return this;
    }
    public ProduitBuilder appendAdditif(String nom,double valeur ,Unite unite) {
        Additif addi =new Additif(nom,valeur,unite);
        produit.getAdditifs().add(addi);
        return this;
    }

    public ProduitBuilder(Produit produit) {
        this.produit = produit;
    }

    public Produit get(){

        return produit;
}


}
