package com.baye.gesproduct.manageproduct.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat;

    private String nomCat;

    private String descriptionCat;

    @OneToMany (mappedBy = "categorie")
    private List <Produit> produits;
}
