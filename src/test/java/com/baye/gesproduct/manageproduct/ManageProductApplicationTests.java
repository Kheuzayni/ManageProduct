package com.baye.gesproduct.manageproduct;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baye.gesproduct.manageproduct.entities.Produit;
import com.baye.gesproduct.manageproduct.entities.Category;
import com.baye.gesproduct.manageproduct.repository.ProduitRepository;

//For test
@SpringBootTest
class ManageProductApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private ProduitRepository produitRepository;

    @Test
    public void testCreateProduit() {
        Produit prod = new Produit("PC Baye",3000.500,new Date());
        produitRepository.save(prod);
        System.out.println("************* produit créé avec succès *************");
    }

    @Test
    public void testFindProduit()
    {
        Produit p = produitRepository.findById(1L).get();
        System.out.println(p);
        System.out.println("************* produit trouvé *************");
    }

    @Test
    public void testUpdateProduit()
    {
        Produit p = produitRepository.findById(1L).get();
        p.setPrixProduit(2000.0);
        produitRepository.save(p);

        System.out.println(p);

        System.out.println("************* produit modifié avec succès *************");
    }

    @Test
    public void testDeleteProduit()
    {
        produitRepository.deleteById(1L);
    }

    @Test
    public void testFindAllProduits()
    {
        List<Produit> prods = produitRepository.findAll();

        for (Produit p:prods)
            System.out.println(p);

    }


    @Test
    public void testFindProduitByNom()
    {
        List<Produit> prods = produitRepository.findByNomProduit("PS 4");

        for (Produit p:prods)
            System.out.println(p);

    }

    @Test
    public void testFindProduitByNomContains()
    {
        List<Produit> prods = produitRepository.findByNomProduitContains("P");

        for (Produit p:prods)
            System.out.println(p);

    }

    @Test
    public void testfindByNomPrix()
    {
        List<Produit> prods = produitRepository.findByNomPrix("PS 4", 1000.0);
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }


    @Test
    public void testfindByCategorie()
    {
        Category cat = new Category();
        cat.setIdCat(1L);

        List<Produit> prods = produitRepository.findByCategorie(cat);
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }

    @Test
    public void findByCategorieIdCat()
    {
        List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }


    @Test
    public void testfindByOrderByNomProduitAsc()
    {
        List<Produit> prods =  produitRepository.findByOrderByNomProduitAsc();
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }

    @Test
    public void testTrierProduitsNomsPrix()
    {
        List<Produit> prods = produitRepository.trierProduitsNomsPrix();
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }
}
