package com.baye.gesproduct.manageproduct.repository;

import com.baye.gesproduct.manageproduct.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Repository
public interface ProduitRepository extends JpaRepository <Produit, Long> {
    List<Produit> findByNomProduit(String nom);
    List<Produit> findByNomProduitContains(String nom);
}
