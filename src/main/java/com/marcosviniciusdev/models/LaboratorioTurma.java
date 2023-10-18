package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class LaboratorioTurma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Laboratorio laboratorio;

    @ManyToOne
    private Turma turma;

}
