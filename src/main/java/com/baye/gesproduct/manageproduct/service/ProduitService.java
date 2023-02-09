package com.baye.gesproduct.manageproduct.service;

import com.baye.gesproduct.manageproduct.entities.Produit;

import java.util.List;

public interface ProduitService {
    //Enregistrer Produits
    Produit saveProduit(Produit p);
    //Modifier produits
    Produit updateProduit(Produit p);
    //Supprimer un produit
    void deleteProduit(Produit p);
    //Supprimer produit par id
    void deleteProduitById(Long id);
    //Get Produits
    Produit getProduit(Long id);
    //Lister les produits
    List<Produit> getAllProduits();
}
