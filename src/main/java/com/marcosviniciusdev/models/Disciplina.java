package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String nome;
    private double carga_horaria;
    private String descricao;
    private int numeros_alunos;

    @ManyToOne
    private Departamento departamento;

}
