package com.marcosviniciusdev.models;

import jakarta.persistence.*;

@Entity
public class Numero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String numero;

    private Professor professor;

}