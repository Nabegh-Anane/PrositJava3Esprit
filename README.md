# Prosit 3: Programmation Orientée Objet (JAVA)

## « TuniProd » Gestion de Magasins

Le projet consiste à améliorer la gestion des magasins dans l'application **TuniProd**. Après avoir testé les fonctionnalités précédemment développées, le client a constaté des problèmes, notamment des redondances de produits dans les magasins. Votre supérieur vous demande d'apporter les modifications nécessaires pour corriger ces problèmes.

## Travail Demandé

### 1. Affichage du Nombre Total de Produits
Développer une méthode qui affiche le **nombre total de produits** ajoutés dans tous les magasins.

### 2. Méthode « Comparer » pour Tester la Conformité des Produits
Créer une méthode `comparer` qui permet de tester la conformité de deux produits. Deux produits sont considérés comme identiques s'ils ont **le même identifiant, libellé, et prix**. 

Cette méthode doit être implémentée de deux manières :
- `comparer(Produit p)` : Compare le produit actuel avec un autre produit passé en paramètre.
- `comparer(Produit p1, Produit p2)` : Compare deux produits passés en paramètres.

### 3. Méthode de Recherche de Produits
Ajouter une méthode qui permet de **chercher un produit dans un magasin**. La méthode doit retourner `True` si le produit est trouvé dans le magasin, sinon `False`.

### 4. Modification de la Méthode « AjouterProduit »
Modifier la méthode `ajouterProduit` pour s'assurer qu'un produit ne peut être ajouté **qu'une seule fois** dans un magasin, afin d'éviter les doublons.

### 5. Méthode « SupprimerProduit »
Ajouter une méthode `supprimerProduit` permettant de **supprimer un produit** d'un magasin.

### 6. Comparaison entre Deux Magasins
Créer une méthode qui compare deux magasins et **retourne celui ayant le plus grand nombre de produits**.

## Instructions de Compilation et d'Exécution

1. Compiler le projet avec `javac`.
2. Exécuter les méthodes mentionnées en les intégrant dans les classes de gestion des magasins.
