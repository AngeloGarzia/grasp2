package fr.diginamic.composite;

public class TestComposite {
    public static void main(String[] args) {

        Employe e = new Employe("Garzia", "Angelo", 2000);
        Employe ee = new Employe("Dupond", "Serge", 2500);
        Service s = new Service("Service Technique");

        s.addElement(e);

        Employe directeur = new Employe("RASPEY", "Cécile", 10000);
        Employe architecte = new Employe("BECHKAR", "Bilel", 8000);
        Employe chefBigData = new Employe("RANNEY", "JB", 7500);
        Employe concepteur = new Employe("DOE", "Jane", 3500);
        Employe chefJava = new Employe("GUINEAU", "KEVIN", 7500);
        Employe leadDev = new Employe("MARTIN", "Paul", 3500);

        Service bigData = new Service("Big Data");
        bigData.addElement(chefBigData);
        bigData.addElement(concepteur);

        Service javaDev = new Service("Java Dev");
        javaDev.addElement(chefJava);
        javaDev.addElement(leadDev);

        Service dsin = new Service("DSIN");
        dsin.addElement(directeur);
        dsin.addElement(architecte);
        dsin.addElement(bigData);
        dsin.addElement(javaDev);

        System.out.println("Salaire Big Data = " + bigData.calculerSalaire());
        System.out.println("Salaire Big Data = " + bigData.calculerSalaire());
        System.out.println("Salaire DSIN = " + dsin.calculerSalaire());


    }
}
