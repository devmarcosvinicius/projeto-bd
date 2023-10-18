package com.marcosviniciusdev.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class RegistroEmprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date data_emprestimo;
    private Date data_devolucao;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Exemplar exemplar;

    @ManyToOne
    private StatusEmprestimo status_emprestimo;

}
