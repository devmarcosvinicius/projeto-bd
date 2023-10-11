package com.marcosviniciusdev.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SalaTurma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Sala> sala;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Turma> turma;

}
