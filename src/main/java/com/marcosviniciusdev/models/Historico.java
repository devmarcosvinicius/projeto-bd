package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Historico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date data_inicio;
    private Date data_fim;

    @ManyToOne
    private Aluno aluno;

}
