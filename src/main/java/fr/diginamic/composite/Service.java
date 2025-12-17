package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {
    private String nom;
    private List<IElement> elements = new ArrayList<>();

    public Service(String nom) {
        this.nom = nom;
    }
    public void addElement(IElement element) {
        elements.add(element);
    }

    @Override
    public double calculerSalaire() {
        double total = 0.0;
        for (IElement element : elements) {
            total += element.calculerSalaire();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Service{" +
                "nom='" + nom + '\'' +
                ", elements=" + elements +
                '}';
    }
}