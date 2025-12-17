package fr.diginamic.composite;

public class Employe implements IElement{
    private String nom;
    private String prenom;
    private double salaire;

    public Employe(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }
    @Override
    public double calculerSalaire() {
        // Pour un employé, on retourne simplement son salaire
        return salaire;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public double getSalaire() { return salaire; }



    @Override
    public String toString() {
        return "Employe{" + nom + " " + prenom + ", salaire=" + salaire + "}";
    }

}
