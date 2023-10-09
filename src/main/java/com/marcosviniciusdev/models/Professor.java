package com.marcosviniciusdev.models;

import jakarta.persistence.*;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String cpf;

    private String nome;
    private String sobrenome;

    private Departamento departamento;

}
