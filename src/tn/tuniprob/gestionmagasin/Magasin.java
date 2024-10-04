package tn.tuniprob.gestionmagasin;

public class Magasin {
    private int id;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int nbProduits;

    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[capacite];
        this.nbProduits = 0;
    }

    public int getNbProduits() {
        return nbProduits;
    }

    public boolean chercherProduit(Produit produit) {
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i].comparer(produit)) {
                return true;
            }
        }
        return false;
    }

    public boolean ajouterProduit(Produit produit) {
        if (!chercherProduit(produit) && nbProduits < capacite) {
            produits[nbProduits] = produit;
            nbProduits++;
            return true;
        } else if (chercherProduit(produit)) {
            System.out.println("Produit déjà existant.");
        } else {
            System.out.println("Le magasin a atteint sa capacité maximale.");
        }
        return false;
    }

    public boolean supprimerProduit(Produit produit) {
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i].comparer(produit)) {
                produits[i] = produits[nbProduits - 1];
                produits[nbProduits - 1] = null;
                nbProduits--;
                return true;
            }
        }
        return false;
    }

    public static Magasin magasinAvecPlusDeProduits(Magasin m1, Magasin m2) {
        return m1.getNbProduits() > m2.getNbProduits() ? m1 : m2;
    }

    public void afficherCaracteristiques() {
        System.out.println("Magasin ID: " + id);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité: " + capacite);
        System.out.println("Produits:");
        for (int i = 0; i < nbProduits; i++) {
            System.out.println(produits[i]);
        }
    }

    public Produit[] getProduits() {
        return produits;
    }
}
