package com.baye.gesproduct.manageproduct.service;

import com.baye.gesproduct.manageproduct.entities.Produit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl extends ProduitService {

    @Override
    public Produit saveProduit(Produit P){
        return null;
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
