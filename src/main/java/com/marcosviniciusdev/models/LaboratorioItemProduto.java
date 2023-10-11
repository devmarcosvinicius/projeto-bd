package com.marcosviniciusdev.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LaboratorioItemProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Laboratorio laboratorio;

    private ItemProduto itemProduto;

}
