package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String nome;
    private String descricao;

    @ManyToOne
    private Departamento departamento;

}
