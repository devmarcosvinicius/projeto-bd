package com.marcosviniciusdev.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CursoDisciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Curso curso;

    private Disciplina disciplina;
}
