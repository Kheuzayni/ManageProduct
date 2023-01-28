package com.baye.gesproduct.manageproduct.service;

import com.baye.gesproduct.manageproduct.entities.Produit;

import java.util.List;

public class ProduitService {
    //Enregistrer Produit
    Produit saveProduit(Produit p);
    //Modifier produit
    Produit updateProduit(Produit p);
    //Supprimer un produit
    void deleteProduit(Produit p);
    //Supprimer produit par id
    void deleteProduitById(Long id);
    //Get Produit
    Produit getProduit(Long id);
    //Lister les produits
    List<Produit> getAllProduits();
}
