package fr.diginamic.builder;

import fr.diginamic.commun.Additif;
import fr.diginamic.commun.Allergene;
import fr.diginamic.commun.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private String nom;
    private String grade;

    private Categorie categorie;   // 1
    private Marque marque;
    private List<Ingredient> ingredients = new ArrayList<>();
    private List<Allergene> allergenes = new ArrayList<>();
    private List<Additif> additifs = new ArrayList<>();

    public Produit() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Allergene> getAllergenes() {
        return allergenes;
    }

    public void setAllergenes(List<Allergene> allergenes) {
        this.allergenes = allergenes;
    }

    public List<Additif> getAdditifs() {
        return additifs;
    }

    public void setAdditifs(List<Additif> additifs) {
        this.additifs = additifs;
    }
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void adddAllergene(Allergene allergene) {
        allergenes.add(allergene);
    }

    public void addAdditif(Additif additif) {
        additifs.add(additif);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", grade='" + grade + '\'' +
                ", categorie=" + categorie +
                ", marque=" + marque +
                ", ingredients=" + ingredients +
                ", allergenes=" + allergenes +
                ", additifs=" + additifs +
                '}';
    }
}
