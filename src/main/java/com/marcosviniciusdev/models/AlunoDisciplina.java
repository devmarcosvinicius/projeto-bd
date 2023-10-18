package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AlunoDisciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int frequencia;
    private double nota;

    @ManyToOne
    private Disciplina disciplina;

    @ManyToOne
    private Historico historico;

}
