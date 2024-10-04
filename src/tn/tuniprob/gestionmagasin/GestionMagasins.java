package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class GestionMagasins {

    public static void main(String[] args) {
        Date date1 = new Date(2024 - 1900, 9, 30);
        Date date2 = new Date(2024 - 1900, 10, 5);
        Date date3 = new Date(2025 - 1900, 1, 15);

        Produit produit1 = new Produit(1021, "Lait", "Delice", 0.7, date1);
        Produit produit2 = new Produit(2510, "Yaourt", "Vitalait", 0.5, date2);
        Produit produit3 = new Produit(3250, "Tomate", "Sicam", 1.2, date3);
        Produit produit4 = new Produit(1021, "Lait", "Delice", 0.7, date1);

        Magasin magasin1 = new Magasin(1, "Centre Ville, Tunis", 50);
        Magasin magasin2 = new Magasin(2, "Lac, Tunis", 100);

        magasin1.ajouterProduit(produit1);
        magasin1.ajouterProduit(produit2);
        magasin1.ajouterProduit(produit3);
        magasin1.ajouterProduit(produit4);

        magasin1.afficherCaracteristiques();

        System.out.println("Nombre total de produits dans le magasin 1: " + magasin1.getNbProduits());
        Magasin largerStore = Magasin.magasinAvecPlusDeProduits(magasin1, magasin2);
        System.out.println("Le magasin avec le plus de produits est: " + (largerStore == magasin1 ? "Magasin 1" : "Magasin 2"));
    }
}
