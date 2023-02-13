package com.baye.gesproduct.manageproduct.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat;

    private String nomCat;

    private String descriptionCat;
}
