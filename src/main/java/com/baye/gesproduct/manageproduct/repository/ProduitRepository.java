package com.baye.gesproduct.manageproduct.repository;

import com.baye.gesproduct.manageproduct.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

//Repository
public interface ProduitRepository extends JpaRepository <Produit, Long> {
}
