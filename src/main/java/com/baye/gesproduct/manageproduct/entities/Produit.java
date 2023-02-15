package com.baye.gesproduct.manageproduct.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomProduit;
    private Double prixProduit;
    private Date dateCreationProduit;

    @ManyToOne
    private Category categorie;

    public Produit() {
        super();
    }
    public Produit(String nomProduit, Double prixProduit, Date dateCreationProduit) {
        super();
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.dateCreationProduit = dateCreationProduit;
    }

}
