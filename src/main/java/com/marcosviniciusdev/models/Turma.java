package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numero_alunos;
    private Date data_inicio;
    private Date data_fim;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Turno turno;

    @ManyToOne
    private Professor professor;

}
