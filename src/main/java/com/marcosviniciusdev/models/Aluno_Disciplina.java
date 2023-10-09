package com.marcosviniciusdev.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno_Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int frequencia;
    private double nota;

    private Disciplina disciplina;
    private Historico historico;

}
