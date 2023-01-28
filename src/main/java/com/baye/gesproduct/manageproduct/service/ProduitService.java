package com.baye.gesproduct.manageproduct.service;

import com.baye.gesproduct.manageproduct.entities.Produit;

import java.util.List;

public class ProduitService {
    //Enregistrer Produit
    Produit saveProduit(Produit p);
    //Modifier produit
    Produit updateProduit(Produit p);
    //Supprimer un prodit
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);s
    Produit getProduit(Long id);
    List<Produit> getAllProduits();
}
