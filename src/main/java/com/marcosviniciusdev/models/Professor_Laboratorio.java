package com.marcosviniciusdev.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Professor_Laboratorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Professor professor;

    private Laboratorio laboratorio;

}
