package com.baye.gesproduct.manageproduct.service;

import com.baye.gesproduct.manageproduct.entities.Produit;
import com.baye.gesproduct.manageproduct.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    ProduitRepository produitRepository;

    @Override
    public Produit saveProduit(Produit p){
        return produitRepository.save(p) ;
    }

    @Override
    public Produit updateProduit(Produit P){
        return null;
    }

    @Override
    public void deleteProduit(Produit P){
    }

    public void deleteProduitById (Long id){}

    public Produit getProduit(Long id){
        return null;
    }

    public List<Produit> getAllProduits (){
        return null;
    }
}
