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

    //On appelle ces fonctions depuis service
    @Override
    public Produit saveProduit(Produit p){
        return produitRepository.save(p) ;
    }

    @Override
    public Produit updateProduit(Produit p){
        return produitRepository.save(p);
    }

    @Override
    public void deleteProduit(Produit p){
        produitRepository.delete(p);
    }

    public void deleteProduitById (Long id){
        produitRepository.deleteById(id);
    }

    public Produit getProduit(Long id){
        return produitRepository.findById(id).get();
    }

    public List<Produit> getAllProduits (){
        return produitRepository.findAll();
    }
}
