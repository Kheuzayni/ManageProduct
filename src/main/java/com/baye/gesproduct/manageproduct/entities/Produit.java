package com.baye.gesproduct.manageproduct.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomProduit;
    private Double prixProduit;
    private Date dateCreationProduit;

    @ManyToOne
    private Category categorie;

}
