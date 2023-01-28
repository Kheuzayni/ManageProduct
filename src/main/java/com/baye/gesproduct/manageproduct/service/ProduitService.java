package com.baye.gesproduct.manageproduct.service;

import com.baye.gesproduct.manageproduct.entities.Produit;

import java.util.List;

public class ProduitService {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);s
    Produit getProduit(Long id);
    List<Produit> getAllProduits();
}
